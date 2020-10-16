package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import logica.ArchivoIncorrectoException;
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

import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel main;
	private Celda casillaActiva;
	private TableroSudoku tableroLogica;

	private JPanel[][] regiones;
	private Celda[][] casillas;
	private Color c_background = Color.BLACK;

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

		crearCasillas();

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

		JPanel panel = new JPanel();
		main.add(panel, BorderLayout.SOUTH);

		JLabel lblNewLabel = new JLabel("Aca va el reloj");

		panel.add(lblNewLabel);
	}

	/**
	 * Inicializa las regiones del tablero y les asigna sus casillas
	 * correspondientes
	 * 
	 * @param tablero el tablero donde se agregan las casillas
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
						regiones[fReg][cReg].add(casillas[fCel + 3 * fReg][cCel + 3 * cReg]);
					}
				tablero.add(regiones[fReg][cReg]);
			}
	}

	/**
	 * Inicializa el arreglo de celdas de 9x9
	 */
	private void crearCasillas() {
		casillas = new Celda[9][9];

		for (int f = 0; f < casillas.length; f++) {
			for (int c = 0; c < casillas[0].length; c++) {
				casillas[f][c] = crearCelda(f, c, tableroLogica.intAt(f, c));
			}
		}

	}

	private Celda crearCelda(int f, int c, int val) {
		Celda nueva;
		if (tableroLogica.esEditable(f, c)) {
			nueva = new Celda(imageProvider, f, c, tableroLogica.intAt(f, c));

			nueva.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					int val;
					if (casillaActiva != null && Character.isDigit(e.getKeyChar())) {
						val = Character.getNumericValue(e.getKeyChar());
						if (tableroLogica.setCasillaAt(casillaActiva.getFila(), casillaActiva.getColumna(), val))
							casillaActiva.setValor(val);
					}
				}
			});

		} else {
			nueva = new CeldaNoEditable(imageProvider, f, c, tableroLogica.intAt(f, c));
		}
		nueva.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setCasillaActiva(((Celda) e.getComponent()));
			}
		});
		nueva.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int f, c;
				if (casillaActiva != null) {
					f = casillaActiva.getFila();
					c = casillaActiva.getColumna();

					switch (e.getKeyCode()) {
					case KeyEvent.VK_RIGHT:
						c++;
						break;
					case KeyEvent.VK_LEFT:
						c--;
						break;
					case KeyEvent.VK_UP:
						f--;
						break;
					case KeyEvent.VK_DOWN:
						f++;
						break;
					}

					moverActivaAPos(f, c);
				}
			}
		});

		return nueva;
	}

	private void moverActivaAPos(int f, int c) {
		if (f > casillas.length - 1)
			f = casillas.length - 1;
		if (f < 0)
			f = 0;
		if (c > casillas[0].length - 1)
			c = casillas.length - 1;
		if (c < 0)
			c = 0;
		setCasillaActiva(casillas[f][c]);
	}

	private void setCasillaActiva(Celda nuevaActiva) {
		if (casillaActiva != null)
			casillaActiva.quitarFoco();

		nuevaActiva.darFoco();
		casillaActiva = nuevaActiva;
	}
}
