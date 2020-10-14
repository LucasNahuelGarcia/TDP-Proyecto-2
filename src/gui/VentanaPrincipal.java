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
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.border.Border;
import java.awt.GridLayout;
import java.awt.Insets;
import java.io.FileNotFoundException;

import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel main;
	private JPanel region_7;
	private JLabel[][] casillas;
	private JPanel[][] regiones;

	private static TableroSudoku tableroLogica;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		tableroLogica = new TableroSudoku();

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					tableroLogica
							.readFromFile("/home/lucas/Documentos/TecProg/proyecto2/Sudoku/res/archivoCorrecto.txt");
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {

		setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 12));
		setTitle("Sudoku");
		setResizable(false);
		setBackground(Color.BLACK);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		main = new JPanel();
		main.setAlignmentX(CENTER_ALIGNMENT);
		main.setAlignmentY(CENTER_ALIGNMENT);
		;
		main.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(main);
		main.setLayout(new BorderLayout(0, 0));

		JPanel tablero = new JPanel();
		tablero.setBackground(Color.DARK_GRAY);
		tablero.setBounds(100, 100, 500, 500);
		tablero.setBorder(new EmptyBorder(5, 5, 5, 5));
		tablero.setAlignmentY(0.5f);
		tablero.setAlignmentX(0.5f);
		main.add(tablero, BorderLayout.CENTER);
		tablero.setLayout(new GridLayout(3, 3, 0, 0));

		crearCasillas();
		crearRegiones(tablero);
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
				regiones[fReg][cReg].setBorder(getBorde_region());
				for (int fCel = 0; fCel < 3; fCel++)
					for (int cCel = 0; cCel < 3; cCel++)
						regiones[fReg][cReg].add(casillas[fCel + 3 * fReg][cCel + 3 * cReg]);
				tablero.add(regiones[fReg][cReg]);
			}

	}

	/**
	 * Inicializa el arreglo de casillas de 9x9
	 */
	private void crearCasillas() {
		casillas = new JLabel[9][9];

		for (int f = 0; f < casillas.length; f++) {
			for (int c = 0; c < casillas[0].length; c++) {
				casillas[f][c] = new JLabel();
				casillas[f][c].setHorizontalAlignment(JLabel.CENTER);
				casillas[f][c].setVerticalAlignment(JLabel.CENTER);
				casillas[f][c].setBorder(getBorde_celda());
				int num = tableroLogica.intAt(f, c);
				casillas[f][c].setIcon(_getNumberIcon(c + 1));
			}
		}
	}

	public Border getBorde_region() {
		Border borde = BorderFactory.createLineBorder(Color.black);
		return borde;
	}

	public Border getBorde_celda() {
		Border borde = BorderFactory.createEmptyBorder();
		return borde;
	}

	private ImageIcon _getNumberIcon(int num) {
		String path = getClass().getResource("/num-tablero-" + num + ".png").getPath();
		ImageIcon img = new ImageIcon(path);
		return img;
	}
}
