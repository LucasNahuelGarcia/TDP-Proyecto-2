package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.GridLayout;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

	private JPanel main;
	private JPanel region_7;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
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
		setBounds(100, 100, 463, 463);
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
		region_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		tablero.add(region_1);
		region_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		textField = new JTextField();
		region_1.add(textField);
		textField.setColumns(10);
		
		JPanel region_2 = new JPanel();
		region_2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		tablero.add(region_2);
		region_2.setLayout(new GridLayout(1, 0, 0, 0));
		
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
