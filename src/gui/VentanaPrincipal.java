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
	private JPanel panel;

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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		tablero.add(panel_1, gbc_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 0;
		tablero.add(panel_2, gbc_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.gridx = 2;
		gbc_panel_3.gridy = 0;
		tablero.add(panel_3, gbc_panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 1;
		tablero.add(panel_4, gbc_panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.insets = new Insets(0, 0, 5, 5);
		gbc_panel_5.gridx = 1;
		gbc_panel_5.gridy = 1;
		tablero.add(panel_5, gbc_panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.insets = new Insets(0, 0, 5, 0);
		gbc_panel_6.gridx = 2;
		gbc_panel_6.gridy = 1;
		tablero.add(panel_6, gbc_panel_6);
		
		panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 2;
		tablero.add(panel, gbc_panel);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.insets = new Insets(0, 0, 0, 5);
		gbc_panel_8.gridx = 1;
		gbc_panel_8.gridy = 2;
		tablero.add(panel_8, gbc_panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY, null, null));
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.gridx = 2;
		gbc_panel_9.gridy = 2;
		tablero.add(panel_9, gbc_panel_9);
	}
	public Border getBorde_region() {
		return panel.getBorder();
	}
	public void setBorde_region(Border border) {
		panel.setBorder(border);
	}
}
