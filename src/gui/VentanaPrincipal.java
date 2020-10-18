package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import logica.ArchivoIncorrectoException;
import logica.Posicion;
import logica.PosicionInvalidaException;
import logica.TableroSudoku;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.border.Border;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel main;
	private Celda celdaActiva;
	private TableroSudoku tableroLogica;

	private JPanel[][] regiones;
	private Celda[][] celdas;
	private Color c_background = Color.BLACK;

	private Map<Posicion, List<Posicion>> conflictosTablero;

	private ImageProvider imageProvider;

	/**
	 * Launch the application. private TableroSudoku tableroLogica;
	 */
	public static void main(String[] args) {
		TableroSudoku logica = new TableroSudoku();
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					ImageProvider imageProvider = new ImageProvider();
					logica.leerArchivo("/home/lucas/Documentos/TecProg/proyecto2/Sudoku/res/archivoCorrecto.txt");
					logica.eliminarCeldas(3);
					VentanaPrincipal frame = new VentanaPrincipal(logica, imageProvider);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal(TableroSudoku logica, ImageProvider imageProvider) {
		this.imageProvider = imageProvider;
		tableroLogica = logica;
		conflictosTablero = new HashMap<>();

		crearCeldas();

		setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 12));
		setTitle("Sudoku");
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		main = new JPanel();
		main.setAlignmentX(CENTER_ALIGNMENT);
		main.setAlignmentY(CENTER_ALIGNMENT);

		main.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(main);
		main.setLayout(new BorderLayout(0, 0));

		JPanel tablero = new JPanel();

		tablero.setBackground(c_background);
		tablero.setBounds(100, 100, 500, 500);
		tablero.setAlignmentY(0.5f);
		tablero.setAlignmentX(0.5f);
		main.add(tablero, BorderLayout.CENTER);
		tablero.setLayout(new GridLayout(3, 3, 5, 5));
		crearRegiones(tablero);
		establecerKeyBindingsTablero(tablero);

		JPanel panel = new JPanel();
		main.add(panel, BorderLayout.SOUTH);

		JLabel lblNewLabel = new JLabel("Aca va el reloj");

		panel.add(lblNewLabel);
	}

	/**
	 * Inicializa las regiones del tablero y les asigna sus celdas correspondientes
	 * 
	 * @param tablero el tablero donde se agregan las celdas
	 */
	private void crearRegiones(JPanel tablero) {
		regiones = new JPanel[3][3];

		for (int fReg = 0; fReg < regiones.length; fReg++)
			for (int cReg = 0; cReg < regiones[0].length; cReg++) {
				regiones[fReg][cReg] = new JPanel(new GridLayout(3, 3, 0, 0));
				regiones[fReg][cReg].setBackground(c_background);
				// Agregamos las celdas correspondientes
				for (int fCel = 0; fCel < 3; fCel++)
					for (int cCel = 0; cCel < 3; cCel++) {
						regiones[fReg][cReg].add(celdas[fCel + 3 * fReg][cCel + 3 * cReg]);
					}
				tablero.add(regiones[fReg][cReg]);
			}
	}

	/**
	 * Inicializa el arreglo de celdas de 9x9
	 */
	private void crearCeldas() {
		celdas = new Celda[9][9];

		for (int f = 0; f < celdas.length; f++) {
			for (int c = 0; c < celdas[0].length; c++) {
				Posicion p = new Posicion(f, c);
				celdas[f][c] = crearCelda(p, tableroLogica.intAt(p));
			}
		}

	}

	/**
	 * Inicializa una celda y la configura correctamente.
	 * 
	 * @param f   fila de la celda.
	 * @param c   columna de la celda.
	 * @param val valor de la celda.
	 * @return Una celda ya configurada.
	 */
	private Celda crearCelda(Posicion p, int val) {
		Celda nueva;
		if (tableroLogica.esEditable(p)) {
			nueva = new CeldaEditable(imageProvider, p, tableroLogica.intAt(p));

			// si es editable, le agregamos un listener para editar el valor de la celda.
			nueva.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					int val;
					if (celdaActiva != null && Character.isDigit(e.getKeyChar())) {
						val = Character.getNumericValue(e.getKeyChar());
						try {
							Posicion p = new Posicion(celdaActiva.getFila(), celdaActiva.getColumna());
							tableroLogica.setCelda(p, val);
							celdaActiva.setValor(val);
							updateConflictos(p);
						} catch (PosicionInvalidaException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			});

		} else {
			nueva = new CeldaNoEditable(imageProvider, p, tableroLogica.intAt(p));
		}
		nueva.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setCeldaActiva((Celda) e.getSource());
			}
		});
		return nueva;
	}

	/**
	 * Actualiza la lista de conflictos del tablero para una posicion dada.
	 * 
	 * @param p Posicion a la que se quiere actualizar conflictos.
	 */
	private void updateConflictos(Posicion p) {
		List<Posicion> conflictosCelda = tableroLogica.verificarCelda(p);
		desdibujarConflictos(p);
		if (conflictosCelda.isEmpty())
			conflictosTablero.remove(p);
		else
			conflictosTablero.put(p, conflictosCelda);

		dibujarConflictos();
	}

	/**
	 * Muestra en pantalla los conflictos guardados en conflictosTablero
	 */
	private void dibujarConflictos() {
		int f, c;
		for (Map.Entry<Posicion, List<Posicion>> entrada : conflictosTablero.entrySet()) {
			f = entrada.getKey().fila();
			c = entrada.getKey().columna();
			celdas[f][c].marcarConflicto();

			ListIterator<Posicion> listIterator = entrada.getValue().listIterator();

			while (listIterator.hasNext()) {
				Posicion pos = listIterator.next();
				celdas[pos.fila()][pos.columna()].marcarConflicto();
			}
		}
	}

	/**
	 * Quita la representación gráfica de los conflictos para una celda dada.
	 * 
	 * @param p Posición de la celda a la que se quiere desdibujar conflictos.
	 */
	private void desdibujarConflictos(Posicion p) {
		List<Posicion> conflictos = conflictosTablero.get(p);
		celdas[p.fila()][p.columna()].quitarConflicto();
		if (conflictos != null) {
			ListIterator<Posicion> listIterator = conflictos.listIterator();
			while (listIterator.hasNext()) {
				Posicion pos = listIterator.next();
				celdas[pos.fila()][pos.columna()].quitarConflicto();
			}
		}
	}

	/**
	 * Establece los KeyBindings que permiten moverse dentro del sudoku.
	 * 
	 * @param tablero El objeto al que se van a asignar los KeyBindings.
	 */
	private void establecerKeyBindingsTablero(JPanel tablero) {
		InputMap inputMap = tablero.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke("UP"), "moverUp");

		tablero.getActionMap().put("moverUp", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (celdaActiva != null) {
					int f = (celdaActiva.getFila() - 1 + celdas.length) % celdas.length;
					int c = celdaActiva.getColumna();
					setCeldaActiva(celdas[f][c]);
				}
			}
		});

		inputMap.put(KeyStroke.getKeyStroke("DOWN"), "moverDown");
		tablero.getActionMap().put("moverDown", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (celdaActiva != null) {
					int f = (celdaActiva.getFila() + 1) % celdas.length;
					int c = celdaActiva.getColumna();
					setCeldaActiva(celdas[f][c]);
				}
			}
		});

		inputMap.put(KeyStroke.getKeyStroke("LEFT"), "moverLeft");
		tablero.getActionMap().put("moverLeft", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (celdaActiva != null) {
					int f = celdaActiva.getFila();
					int c = (celdaActiva.getColumna() - 1 + celdas[0].length) % celdas[0].length;
					setCeldaActiva(celdas[f][c]);
				}
			}
		});

		inputMap.put(KeyStroke.getKeyStroke("RIGHT"), "moverRight");
		tablero.getActionMap().put("moverRight", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (celdaActiva != null) {
					int f = celdaActiva.getFila();
					int c = (celdaActiva.getColumna() + 1) % celdas[0].length;
					setCeldaActiva(celdas[f][c]);
				}
			}
		});
	}

	/**
	 * Establece la celda pasada como parámetro como activa.
	 * 
	 * @param nuevaActiva nueva celda activa.
	 */
	private void setCeldaActiva(Celda nuevaActiva) {
		if (celdaActiva != null)
			celdaActiva.resetColor();

		nuevaActiva.grabFocus();
		celdaActiva = nuevaActiva;
	}
}
