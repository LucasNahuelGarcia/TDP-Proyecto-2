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
import java.awt.Font;
import javax.swing.border.Border;
import java.awt.GridLayout;
import java.io.FileNotFoundException;

import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel main;
	private JPanel region_7;
	private JLabel[][] casillas;
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
					tableroLogica.readFromFile("/home/lucas/Documentos/TecProg/proyecto2/Sudoku/res/archivoCorrecto.txt");
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
		setBounds(100, 100, 500, 500);
		main = new JPanel();
		main.setAlignmentX(CENTER_ALIGNMENT);
		main.setAlignmentY(CENTER_ALIGNMENT);
		;
		main.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(main);
		main.setLayout(new BorderLayout(0, 0));

		JPanel tablero = new JPanel();
		tablero.setBackground(Color.DARK_GRAY);
		tablero.setBorder(new EmptyBorder(5, 5, 5, 5));
		tablero.setAlignmentY(0.5f);
		tablero.setAlignmentX(0.5f);
		main.add(tablero, BorderLayout.CENTER);
		tablero.setLayout(new GridLayout(9, 9, 0, 0));
		
		

		casillas = new JLabel[9][9];
		for (int f = 0; f < casillas.length; f++) {
			for (int c = 0; c < casillas[0].length; c++) {
				casillas[f][c] = new JLabel();
				int num = tableroLogica.intAt(f, c);
				casillas[f][c].setIcon(_getNumberIcon(num));
				tablero.add(casillas[f][c]);
			}
		}
	}

	public Border getBorde_region() {
		return region_7.getBorder();
	}

	public void setBorde_region(Border border) {
		region_7.setBorder(border);
	}

	private ImageIcon _getNumberIcon(int num) {
		String path = getClass().getResource("/num-tablero-"+num+".png").getPath();
		ImageIcon img = new ImageIcon(path);
	return img;	
	}
}
