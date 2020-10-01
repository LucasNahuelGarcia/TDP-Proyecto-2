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

public class VentanaPrincipal extends JFrame {

	private JPanel main;
	private JPanel region_7;

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
		tablero.setBorder(new EmptyBorder(5, 5, 5, 5));
		tablero.setAlignmentY(0.5f);
		tablero.setAlignmentX(0.5f);
		main.add(tablero);
		GridBagLayout gbl_tablero = new GridBagLayout();
		gbl_tablero.columnWidths = new int[] {1, 1, 1};
		gbl_tablero.rowHeights = new int[]{1, 1, 1, 0};
		gbl_tablero.columnWeights = new double[]{1.0, 1.0, 1.0};
		gbl_tablero.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		tablero.setLayout(gbl_tablero);
		
		JPanel region_1 = new JPanel();
		region_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		GridBagConstraints gbc_region_1 = new GridBagConstraints();
		gbc_region_1.fill = GridBagConstraints.BOTH;
		gbc_region_1.insets = new Insets(0, 0, 5, 5);
		gbc_region_1.gridx = 0;
		gbc_region_1.gridy = 0;
		tablero.add(region_1, gbc_region_1);
		
		JPanel region_2 = new JPanel();
		region_2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		GridBagConstraints gbc_region_2 = new GridBagConstraints();
		gbc_region_2.fill = GridBagConstraints.BOTH;
		gbc_region_2.insets = new Insets(0, 0, 5, 5);
		gbc_region_2.gridx = 1;
		gbc_region_2.gridy = 0;
		tablero.add(region_2, gbc_region_2);
		
		JPanel region_3 = new JPanel();
		region_3.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		GridBagConstraints gbc_region_3 = new GridBagConstraints();
		gbc_region_3.fill = GridBagConstraints.BOTH;
		gbc_region_3.insets = new Insets(0, 0, 5, 0);
		gbc_region_3.gridx = 2;
		gbc_region_3.gridy = 0;
		tablero.add(region_3, gbc_region_3);
		
		JPanel region_4 = new JPanel();
		region_4.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		GridBagConstraints gbc_region_4 = new GridBagConstraints();
		gbc_region_4.fill = GridBagConstraints.BOTH;
		gbc_region_4.insets = new Insets(0, 0, 5, 5);
		gbc_region_4.gridx = 0;
		gbc_region_4.gridy = 1;
		tablero.add(region_4, gbc_region_4);
		
		JPanel region_5 = new JPanel();
		region_5.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		GridBagConstraints gbc_region_5 = new GridBagConstraints();
		gbc_region_5.fill = GridBagConstraints.BOTH;
		gbc_region_5.insets = new Insets(0, 0, 5, 5);
		gbc_region_5.gridx = 1;
		gbc_region_5.gridy = 1;
		tablero.add(region_5, gbc_region_5);
		
		JPanel region_6 = new JPanel();
		region_6.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		GridBagConstraints gbc_region_6 = new GridBagConstraints();
		gbc_region_6.fill = GridBagConstraints.BOTH;
		gbc_region_6.insets = new Insets(0, 0, 5, 0);
		gbc_region_6.gridx = 2;
		gbc_region_6.gridy = 1;
		tablero.add(region_6, gbc_region_6);
		
		region_7 = new JPanel();
		region_7.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		GridBagConstraints gbc_region_7 = new GridBagConstraints();
		gbc_region_7.fill = GridBagConstraints.BOTH;
		gbc_region_7.insets = new Insets(0, 0, 0, 5);
		gbc_region_7.gridx = 0;
		gbc_region_7.gridy = 2;
		tablero.add(region_7, gbc_region_7);
		
		JPanel region_8 = new JPanel();
		region_8.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		GridBagConstraints gbc_region_8 = new GridBagConstraints();
		gbc_region_8.fill = GridBagConstraints.BOTH;
		gbc_region_8.insets = new Insets(0, 0, 0, 5);
		gbc_region_8.gridx = 1;
		gbc_region_8.gridy = 2;
		tablero.add(region_8, gbc_region_8);
		
		JPanel region_9 = new JPanel();
		region_9.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		GridBagConstraints gbc_region_9 = new GridBagConstraints();
		gbc_region_9.fill = GridBagConstraints.BOTH;
		gbc_region_9.gridx = 2;
		gbc_region_9.gridy = 2;
		tablero.add(region_9, gbc_region_9);
	}
	public Border getBorde_region() {
		return region_7.getBorder();
	}
	public void setBorde_region(Border border) {
		region_7.setBorder(border);
	}
}
