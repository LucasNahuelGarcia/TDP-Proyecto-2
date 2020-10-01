package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

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

public class VentanaPrincipal extends JFrame {

	private JPanel main;
	private JPanel region_7;
	private JTextField inputNumero_0;
	private JTextField inputNumero_1;
	private JTextField inputNumero_3;
	private JTextField inputNumero_4;
	private JTextField inputNumero_5;
	private JTextField inputNumero_6;
	private JTextField inputNumero_2;
	private JTextField inputNumero_7;
	private JTextField inputNumero_8;

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
		tablero.setLayout(new GridLayout(3, 3, 0, 0));
		
		JPanel region_1 = new JPanel();
		region_1.setBackground(Color.DARK_GRAY);
		region_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		tablero.add(region_1);
		region_1.setLayout(new GridLayout(3, 3, 1, 1));
		
		inputNumero_0 = new JTextField();
		inputNumero_0.setBackground(Color.WHITE);
		inputNumero_0.setEditable(true);
		inputNumero_0.setDoubleBuffered(false);
		inputNumero_0.setFont(new Font("FreeSans", Font.BOLD, 22));
		inputNumero_0.setToolTipText("");
		inputNumero_0.setHorizontalAlignment(SwingConstants.CENTER);
		inputNumero_0.setText("");
		region_1.add(inputNumero_0);
		
		inputNumero_1 = new JTextField();
		inputNumero_1.setToolTipText("");
		inputNumero_1.setText("");
		inputNumero_1.setHorizontalAlignment(SwingConstants.CENTER);
		inputNumero_1.setFont(new Font("FreeSans", Font.BOLD, 22));
		inputNumero_1.setEditable(true);
		inputNumero_1.setDoubleBuffered(false);
		region_1.add(inputNumero_1);
		
		inputNumero_2 = new JTextField();
		inputNumero_2.setToolTipText("");
		inputNumero_2.setText("");
		inputNumero_2.setHorizontalAlignment(SwingConstants.CENTER);
		inputNumero_2.setFont(new Font("FreeSans", Font.BOLD, 22));
		inputNumero_2.setEditable(true);
		inputNumero_2.setDoubleBuffered(false);
		region_1.add(inputNumero_2);
		
		inputNumero_3 = new JTextField();
		inputNumero_3.setToolTipText("");
		inputNumero_3.setText("");
		inputNumero_3.setHorizontalAlignment(SwingConstants.CENTER);
		inputNumero_3.setFont(new Font("FreeSans", Font.BOLD, 22));
		inputNumero_3.setEditable(true);
		inputNumero_3.setDoubleBuffered(false);
		region_1.add(inputNumero_3);
		
		inputNumero_4 = new JTextField();
		inputNumero_4.setToolTipText("");
		inputNumero_4.setText("");
		inputNumero_4.setHorizontalAlignment(SwingConstants.CENTER);
		inputNumero_4.setFont(new Font("FreeSans", Font.BOLD, 22));
		inputNumero_4.setEditable(true);
		inputNumero_4.setDoubleBuffered(false);
		region_1.add(inputNumero_4);
		
		inputNumero_5 = new JTextField();
		inputNumero_5.setToolTipText("");
		inputNumero_5.setText("");
		inputNumero_5.setHorizontalAlignment(SwingConstants.CENTER);
		inputNumero_5.setFont(new Font("FreeSans", Font.BOLD, 22));
		inputNumero_5.setEditable(true);
		inputNumero_5.setDoubleBuffered(false);
		region_1.add(inputNumero_5);
		
		inputNumero_6 = new JTextField();
		inputNumero_6.setToolTipText("");
		inputNumero_6.setText("");
		inputNumero_6.setHorizontalAlignment(SwingConstants.CENTER);
		inputNumero_6.setFont(new Font("FreeSans", Font.BOLD, 22));
		inputNumero_6.setEditable(true);
		inputNumero_6.setDoubleBuffered(false);
		region_1.add(inputNumero_6);
		
		inputNumero_7 = new JTextField();
		inputNumero_7.setToolTipText("");
		inputNumero_7.setText("");
		inputNumero_7.setHorizontalAlignment(SwingConstants.CENTER);
		inputNumero_7.setFont(new Font("FreeSans", Font.BOLD, 22));
		inputNumero_7.setEditable(true);
		inputNumero_7.setDoubleBuffered(false);
		region_1.add(inputNumero_7);
		
		inputNumero_8 = new JTextField();
		inputNumero_8.setToolTipText("");
		inputNumero_8.setText("");
		inputNumero_8.setHorizontalAlignment(SwingConstants.CENTER);
		inputNumero_8.setFont(new Font("FreeSans", Font.BOLD, 22));
		inputNumero_8.setEditable(true);
		inputNumero_8.setDoubleBuffered(false);
		region_1.add(inputNumero_8);
		
		JPanel region_2 = new JPanel();
		region_2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		tablero.add(region_2);
		region_2.setLayout(new GridLayout(3, 3, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.RED);
		panel.setBackground(Color.blue);
		region_2.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.RED);
		panel_1.setBackground(Color.BLUE);
		region_2.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.RED);
		panel_2.setBackground(Color.BLUE);
		region_2.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(Color.RED);
		panel_3.setBackground(Color.BLUE);
		region_2.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setForeground(Color.RED);
		panel_4.setBackground(Color.BLUE);
		region_2.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setForeground(Color.RED);
		panel_5.setBackground(Color.BLUE);
		region_2.add(panel_5);
		
		JPanel region_3 = new JPanel();
		region_3.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		tablero.add(region_3);
		region_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel region_4 = new JPanel();
		region_4.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		tablero.add(region_4);
		region_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel region_5 = new JPanel();
		region_5.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		tablero.add(region_5);
		region_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel region_6 = new JPanel();
		region_6.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		tablero.add(region_6);
		region_6.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel region_7 = new JPanel();
		region_7.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		tablero.add(region_7);
		region_7.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel region_8 = new JPanel();
		region_8.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		tablero.add(region_8);
		region_8.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel region_9 = new JPanel();
		region_9.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		tablero.add(region_9);
		region_9.setLayout(new GridLayout(1, 0, 0, 0));
	}
	public Border getBorde_region() {
		return region_7.getBorder();
	}
	public void setBorde_region(Border border) {
		region_7.setBorder(border);
	}
}
