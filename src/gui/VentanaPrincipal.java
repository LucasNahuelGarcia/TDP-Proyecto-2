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
import javax.swing.border.MatteBorder;

public class VentanaPrincipal extends JFrame {

	private JPanel main;
	private JPanel region_7;
	private JPanel panel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JPanel panel_1;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JPanel panel_2;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JPanel panel_3;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JPanel panel_4;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JPanel panel_5;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JPanel panel_6;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JPanel panel_7;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JPanel panel_8;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;

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
		
		panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		panel.setBackground(Color.DARK_GRAY);
		tablero.add(panel);
		panel.setLayout(new GridLayout(3, 3, 1, 1));
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setText("");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField.setEditable(true);
		textField.setDoubleBuffered(false);
		textField.setBackground(Color.WHITE);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setText("");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_1.setEditable(true);
		textField_1.setDoubleBuffered(false);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("");
		textField_2.setText("");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_2.setEditable(true);
		textField_2.setDoubleBuffered(false);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("");
		textField_3.setText("");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_3.setEditable(true);
		textField_3.setDoubleBuffered(false);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("");
		textField_4.setText("");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_4.setEditable(true);
		textField_4.setDoubleBuffered(false);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("");
		textField_5.setText("");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_5.setEditable(true);
		textField_5.setDoubleBuffered(false);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setToolTipText("");
		textField_6.setText("");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_6.setEditable(true);
		textField_6.setDoubleBuffered(false);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setToolTipText("");
		textField_7.setText("");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_7.setEditable(true);
		textField_7.setDoubleBuffered(false);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setToolTipText("");
		textField_8.setText("");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_8.setEditable(true);
		textField_8.setDoubleBuffered(false);
		panel.add(textField_8);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		panel_1.setBackground(Color.DARK_GRAY);
		tablero.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 3, 1, 1));
		
		textField_9 = new JTextField();
		textField_9.setToolTipText("");
		textField_9.setText("");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_9.setEditable(true);
		textField_9.setDoubleBuffered(false);
		textField_9.setBackground(Color.WHITE);
		panel_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setToolTipText("");
		textField_10.setText("");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_10.setEditable(true);
		textField_10.setDoubleBuffered(false);
		panel_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setToolTipText("");
		textField_11.setText("");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_11.setEditable(true);
		textField_11.setDoubleBuffered(false);
		panel_1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setToolTipText("");
		textField_12.setText("");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_12.setEditable(true);
		textField_12.setDoubleBuffered(false);
		panel_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setToolTipText("");
		textField_13.setText("");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_13.setEditable(true);
		textField_13.setDoubleBuffered(false);
		panel_1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setToolTipText("");
		textField_14.setText("");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_14.setEditable(true);
		textField_14.setDoubleBuffered(false);
		panel_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setToolTipText("");
		textField_15.setText("");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_15.setEditable(true);
		textField_15.setDoubleBuffered(false);
		panel_1.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setToolTipText("");
		textField_16.setText("");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_16.setEditable(true);
		textField_16.setDoubleBuffered(false);
		panel_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setToolTipText("");
		textField_17.setText("");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_17.setEditable(true);
		textField_17.setDoubleBuffered(false);
		panel_1.add(textField_17);
		
		panel_2 = new JPanel();
		tablero.add(panel_2);
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setLayout(new GridLayout(3, 3, 1, 1));
		
		textField_18 = new JTextField();
		textField_18.setToolTipText("");
		textField_18.setText("");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_18.setEditable(true);
		textField_18.setDoubleBuffered(false);
		textField_18.setBackground(Color.WHITE);
		panel_2.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setToolTipText("");
		textField_19.setText("");
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_19.setEditable(true);
		textField_19.setDoubleBuffered(false);
		panel_2.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setToolTipText("");
		textField_20.setText("");
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_20.setEditable(true);
		textField_20.setDoubleBuffered(false);
		panel_2.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setToolTipText("");
		textField_21.setText("");
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_21.setEditable(true);
		textField_21.setDoubleBuffered(false);
		panel_2.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setToolTipText("");
		textField_22.setText("");
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_22.setEditable(true);
		textField_22.setDoubleBuffered(false);
		panel_2.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setToolTipText("");
		textField_23.setText("");
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_23.setEditable(true);
		textField_23.setDoubleBuffered(false);
		panel_2.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setToolTipText("");
		textField_24.setText("");
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_24.setEditable(true);
		textField_24.setDoubleBuffered(false);
		panel_2.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setToolTipText("");
		textField_25.setText("");
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_25.setEditable(true);
		textField_25.setDoubleBuffered(false);
		panel_2.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setToolTipText("");
		textField_26.setText("");
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_26.setEditable(true);
		textField_26.setDoubleBuffered(false);
		panel_2.add(textField_26);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		panel_3.setBackground(Color.DARK_GRAY);
		tablero.add(panel_3);
		panel_3.setLayout(new GridLayout(3, 3, 1, 1));
		
		textField_27 = new JTextField();
		textField_27.setToolTipText("");
		textField_27.setText("");
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_27.setEditable(true);
		textField_27.setDoubleBuffered(false);
		textField_27.setBackground(Color.WHITE);
		panel_3.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setToolTipText("");
		textField_28.setText("");
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_28.setEditable(true);
		textField_28.setDoubleBuffered(false);
		panel_3.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setToolTipText("");
		textField_29.setText("");
		textField_29.setHorizontalAlignment(SwingConstants.CENTER);
		textField_29.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_29.setEditable(true);
		textField_29.setDoubleBuffered(false);
		panel_3.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setToolTipText("");
		textField_30.setText("");
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_30.setEditable(true);
		textField_30.setDoubleBuffered(false);
		panel_3.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setToolTipText("");
		textField_31.setText("");
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_31.setEditable(true);
		textField_31.setDoubleBuffered(false);
		panel_3.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setToolTipText("");
		textField_32.setText("");
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_32.setEditable(true);
		textField_32.setDoubleBuffered(false);
		panel_3.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setToolTipText("");
		textField_33.setText("");
		textField_33.setHorizontalAlignment(SwingConstants.CENTER);
		textField_33.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_33.setEditable(true);
		textField_33.setDoubleBuffered(false);
		panel_3.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setToolTipText("");
		textField_34.setText("");
		textField_34.setHorizontalAlignment(SwingConstants.CENTER);
		textField_34.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_34.setEditable(true);
		textField_34.setDoubleBuffered(false);
		panel_3.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setToolTipText("");
		textField_35.setText("");
		textField_35.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_35.setEditable(true);
		textField_35.setDoubleBuffered(false);
		panel_3.add(textField_35);
		
		panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		panel_4.setBackground(Color.DARK_GRAY);
		tablero.add(panel_4);
		panel_4.setLayout(new GridLayout(3, 3, 1, 1));
		
		textField_36 = new JTextField();
		textField_36.setToolTipText("");
		textField_36.setText("");
		textField_36.setHorizontalAlignment(SwingConstants.CENTER);
		textField_36.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_36.setEditable(true);
		textField_36.setDoubleBuffered(false);
		textField_36.setBackground(Color.WHITE);
		panel_4.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setToolTipText("");
		textField_37.setText("");
		textField_37.setHorizontalAlignment(SwingConstants.CENTER);
		textField_37.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_37.setEditable(true);
		textField_37.setDoubleBuffered(false);
		panel_4.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setToolTipText("");
		textField_38.setText("");
		textField_38.setHorizontalAlignment(SwingConstants.CENTER);
		textField_38.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_38.setEditable(true);
		textField_38.setDoubleBuffered(false);
		panel_4.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setToolTipText("");
		textField_39.setText("");
		textField_39.setHorizontalAlignment(SwingConstants.CENTER);
		textField_39.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_39.setEditable(true);
		textField_39.setDoubleBuffered(false);
		panel_4.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setToolTipText("");
		textField_40.setText("");
		textField_40.setHorizontalAlignment(SwingConstants.CENTER);
		textField_40.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_40.setEditable(true);
		textField_40.setDoubleBuffered(false);
		panel_4.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setToolTipText("");
		textField_41.setText("");
		textField_41.setHorizontalAlignment(SwingConstants.CENTER);
		textField_41.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_41.setEditable(true);
		textField_41.setDoubleBuffered(false);
		panel_4.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setToolTipText("");
		textField_42.setText("");
		textField_42.setHorizontalAlignment(SwingConstants.CENTER);
		textField_42.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_42.setEditable(true);
		textField_42.setDoubleBuffered(false);
		panel_4.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setToolTipText("");
		textField_43.setText("");
		textField_43.setHorizontalAlignment(SwingConstants.CENTER);
		textField_43.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_43.setEditable(true);
		textField_43.setDoubleBuffered(false);
		panel_4.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setToolTipText("");
		textField_44.setText("");
		textField_44.setHorizontalAlignment(SwingConstants.CENTER);
		textField_44.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_44.setEditable(true);
		textField_44.setDoubleBuffered(false);
		panel_4.add(textField_44);
		
		panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		panel_5.setBackground(Color.DARK_GRAY);
		tablero.add(panel_5);
		panel_5.setLayout(new GridLayout(3, 3, 1, 1));
		
		textField_45 = new JTextField();
		textField_45.setToolTipText("");
		textField_45.setText("");
		textField_45.setHorizontalAlignment(SwingConstants.CENTER);
		textField_45.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_45.setEditable(true);
		textField_45.setDoubleBuffered(false);
		textField_45.setBackground(Color.WHITE);
		panel_5.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setToolTipText("");
		textField_46.setText("");
		textField_46.setHorizontalAlignment(SwingConstants.CENTER);
		textField_46.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_46.setEditable(true);
		textField_46.setDoubleBuffered(false);
		panel_5.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setToolTipText("");
		textField_47.setText("");
		textField_47.setHorizontalAlignment(SwingConstants.CENTER);
		textField_47.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_47.setEditable(true);
		textField_47.setDoubleBuffered(false);
		panel_5.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setToolTipText("");
		textField_48.setText("");
		textField_48.setHorizontalAlignment(SwingConstants.CENTER);
		textField_48.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_48.setEditable(true);
		textField_48.setDoubleBuffered(false);
		panel_5.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setToolTipText("");
		textField_49.setText("");
		textField_49.setHorizontalAlignment(SwingConstants.CENTER);
		textField_49.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_49.setEditable(true);
		textField_49.setDoubleBuffered(false);
		panel_5.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setToolTipText("");
		textField_50.setText("");
		textField_50.setHorizontalAlignment(SwingConstants.CENTER);
		textField_50.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_50.setEditable(true);
		textField_50.setDoubleBuffered(false);
		panel_5.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setToolTipText("");
		textField_51.setText("");
		textField_51.setHorizontalAlignment(SwingConstants.CENTER);
		textField_51.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_51.setEditable(true);
		textField_51.setDoubleBuffered(false);
		panel_5.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setToolTipText("");
		textField_52.setText("");
		textField_52.setHorizontalAlignment(SwingConstants.CENTER);
		textField_52.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_52.setEditable(true);
		textField_52.setDoubleBuffered(false);
		panel_5.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setToolTipText("");
		textField_53.setText("");
		textField_53.setHorizontalAlignment(SwingConstants.CENTER);
		textField_53.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_53.setEditable(true);
		textField_53.setDoubleBuffered(false);
		panel_5.add(textField_53);
		
		panel_6 = new JPanel();
		panel_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		panel_6.setBackground(Color.DARK_GRAY);
		tablero.add(panel_6);
		panel_6.setLayout(new GridLayout(3, 3, 1, 1));
		
		textField_54 = new JTextField();
		textField_54.setToolTipText("");
		textField_54.setText("");
		textField_54.setHorizontalAlignment(SwingConstants.CENTER);
		textField_54.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_54.setEditable(true);
		textField_54.setDoubleBuffered(false);
		textField_54.setBackground(Color.WHITE);
		panel_6.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setToolTipText("");
		textField_55.setText("");
		textField_55.setHorizontalAlignment(SwingConstants.CENTER);
		textField_55.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_55.setEditable(true);
		textField_55.setDoubleBuffered(false);
		panel_6.add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setToolTipText("");
		textField_56.setText("");
		textField_56.setHorizontalAlignment(SwingConstants.CENTER);
		textField_56.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_56.setEditable(true);
		textField_56.setDoubleBuffered(false);
		panel_6.add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setToolTipText("");
		textField_57.setText("");
		textField_57.setHorizontalAlignment(SwingConstants.CENTER);
		textField_57.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_57.setEditable(true);
		textField_57.setDoubleBuffered(false);
		panel_6.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setToolTipText("");
		textField_58.setText("");
		textField_58.setHorizontalAlignment(SwingConstants.CENTER);
		textField_58.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_58.setEditable(true);
		textField_58.setDoubleBuffered(false);
		panel_6.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setToolTipText("");
		textField_59.setText("");
		textField_59.setHorizontalAlignment(SwingConstants.CENTER);
		textField_59.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_59.setEditable(true);
		textField_59.setDoubleBuffered(false);
		panel_6.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setToolTipText("");
		textField_60.setText("");
		textField_60.setHorizontalAlignment(SwingConstants.CENTER);
		textField_60.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_60.setEditable(true);
		textField_60.setDoubleBuffered(false);
		panel_6.add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setToolTipText("");
		textField_61.setText("");
		textField_61.setHorizontalAlignment(SwingConstants.CENTER);
		textField_61.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_61.setEditable(true);
		textField_61.setDoubleBuffered(false);
		panel_6.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setToolTipText("");
		textField_62.setText("");
		textField_62.setHorizontalAlignment(SwingConstants.CENTER);
		textField_62.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_62.setEditable(true);
		textField_62.setDoubleBuffered(false);
		panel_6.add(textField_62);
		
		panel_7 = new JPanel();
		panel_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		panel_7.setBackground(Color.DARK_GRAY);
		tablero.add(panel_7);
		panel_7.setLayout(new GridLayout(3, 3, 1, 1));
		
		textField_63 = new JTextField();
		textField_63.setToolTipText("");
		textField_63.setText("");
		textField_63.setHorizontalAlignment(SwingConstants.CENTER);
		textField_63.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_63.setEditable(true);
		textField_63.setDoubleBuffered(false);
		textField_63.setBackground(Color.WHITE);
		panel_7.add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setToolTipText("");
		textField_64.setText("");
		textField_64.setHorizontalAlignment(SwingConstants.CENTER);
		textField_64.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_64.setEditable(true);
		textField_64.setDoubleBuffered(false);
		panel_7.add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setToolTipText("");
		textField_65.setText("");
		textField_65.setHorizontalAlignment(SwingConstants.CENTER);
		textField_65.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_65.setEditable(true);
		textField_65.setDoubleBuffered(false);
		panel_7.add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setToolTipText("");
		textField_66.setText("");
		textField_66.setHorizontalAlignment(SwingConstants.CENTER);
		textField_66.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_66.setEditable(true);
		textField_66.setDoubleBuffered(false);
		panel_7.add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setToolTipText("");
		textField_67.setText("");
		textField_67.setHorizontalAlignment(SwingConstants.CENTER);
		textField_67.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_67.setEditable(true);
		textField_67.setDoubleBuffered(false);
		panel_7.add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setToolTipText("");
		textField_68.setText("");
		textField_68.setHorizontalAlignment(SwingConstants.CENTER);
		textField_68.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_68.setEditable(true);
		textField_68.setDoubleBuffered(false);
		panel_7.add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setToolTipText("");
		textField_69.setText("");
		textField_69.setHorizontalAlignment(SwingConstants.CENTER);
		textField_69.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_69.setEditable(true);
		textField_69.setDoubleBuffered(false);
		panel_7.add(textField_69);
		
		textField_70 = new JTextField();
		textField_70.setToolTipText("");
		textField_70.setText("");
		textField_70.setHorizontalAlignment(SwingConstants.CENTER);
		textField_70.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_70.setEditable(true);
		textField_70.setDoubleBuffered(false);
		panel_7.add(textField_70);
		
		textField_71 = new JTextField();
		textField_71.setToolTipText("");
		textField_71.setText("");
		textField_71.setHorizontalAlignment(SwingConstants.CENTER);
		textField_71.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_71.setEditable(true);
		textField_71.setDoubleBuffered(false);
		panel_7.add(textField_71);
		
		panel_8 = new JPanel();
		panel_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		panel_8.setBackground(Color.DARK_GRAY);
		tablero.add(panel_8);
		panel_8.setLayout(new GridLayout(3, 3, 1, 1));
		
		textField_72 = new JTextField();
		textField_72.setToolTipText("");
		textField_72.setText("");
		textField_72.setHorizontalAlignment(SwingConstants.CENTER);
		textField_72.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_72.setEditable(true);
		textField_72.setDoubleBuffered(false);
		textField_72.setBackground(Color.WHITE);
		panel_8.add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setToolTipText("");
		textField_73.setText("");
		textField_73.setHorizontalAlignment(SwingConstants.CENTER);
		textField_73.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_73.setEditable(true);
		textField_73.setDoubleBuffered(false);
		panel_8.add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setToolTipText("");
		textField_74.setText("");
		textField_74.setHorizontalAlignment(SwingConstants.CENTER);
		textField_74.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_74.setEditable(true);
		textField_74.setDoubleBuffered(false);
		panel_8.add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setToolTipText("");
		textField_75.setText("");
		textField_75.setHorizontalAlignment(SwingConstants.CENTER);
		textField_75.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_75.setEditable(true);
		textField_75.setDoubleBuffered(false);
		panel_8.add(textField_75);
		
		textField_76 = new JTextField();
		textField_76.setToolTipText("");
		textField_76.setText("");
		textField_76.setHorizontalAlignment(SwingConstants.CENTER);
		textField_76.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_76.setEditable(true);
		textField_76.setDoubleBuffered(false);
		panel_8.add(textField_76);
		
		textField_77 = new JTextField();
		textField_77.setToolTipText("");
		textField_77.setText("");
		textField_77.setHorizontalAlignment(SwingConstants.CENTER);
		textField_77.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_77.setEditable(true);
		textField_77.setDoubleBuffered(false);
		panel_8.add(textField_77);
		
		textField_78 = new JTextField();
		textField_78.setToolTipText("");
		textField_78.setText("");
		textField_78.setHorizontalAlignment(SwingConstants.CENTER);
		textField_78.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_78.setEditable(true);
		textField_78.setDoubleBuffered(false);
		panel_8.add(textField_78);
		
		textField_79 = new JTextField();
		textField_79.setToolTipText("");
		textField_79.setText("");
		textField_79.setHorizontalAlignment(SwingConstants.CENTER);
		textField_79.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_79.setEditable(true);
		textField_79.setDoubleBuffered(false);
		panel_8.add(textField_79);
		
		textField_80 = new JTextField();
		textField_80.setToolTipText("");
		textField_80.setText("");
		textField_80.setHorizontalAlignment(SwingConstants.CENTER);
		textField_80.setFont(new Font("FreeSans", Font.BOLD, 22));
		textField_80.setEditable(true);
		textField_80.setDoubleBuffered(false);
		panel_8.add(textField_80);
	}
	public Border getBorde_region() {
		return region_7.getBorder();
	}
	public void setBorde_region(Border border) {
		region_7.setBorder(border);
	}
	public Border getBorder_region() {
		return panel.getBorder();
	}
	public void setBorder_region(Border border_1) {
		panel.setBorder(border_1);
	}
}
