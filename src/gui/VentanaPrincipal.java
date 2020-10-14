package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.text.Caret;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class VentanaPrincipal extends JFrame {
	private JPanel main;
	private JPanel region_7;
	private JLabel[][] casillas;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				    UIManager.setLookAndFeel( new NimbusLookAndFeel());
				} catch( Exception ex ) {
				    System.err.println( "Failed to initialize LaF" );
				}

				try {
					
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		main = new JPanel();
		main.setAlignmentX(CENTER_ALIGNMENT);
		main.setAlignmentY(CENTER_ALIGNMENT);;
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
		for(int f = 0 ; f < casillas.length; f++) {
			for(int c = 0; c < casillas[0].length; c++) {
				casillas[f][c] = new JLabel(f+":"+c);
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
}
