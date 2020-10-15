package gui;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

class Celda extends JButton {
	private static final long serialVersionUID = 1L;
	private int fila, columna;
	private Integer valor;
	private boolean activa;

	Celda(int fila, int columna, Integer valor) {
		this.fila = fila;
		this.columna = columna;
		this.valor = valor;
		activa = false;
		this.quitarFoco();
		this.setHorizontalAlignment(JButton.CENTER);
		this.setVerticalAlignment(JButton.CENTER);
		this.setBorder(BorderFactory.createEmptyBorder());
		// Si el valor es nulo, consideramos a la casilla no editable
		if (valor != null)
			this.setIcon(getIconoDeNumero(valor, 10));
	}

	Celda(int fila, int columna) {
		this(fila, columna, null);
	}

	public void setValor(int val) {
		valor = val;
		this.setIcon(getIconoDeNumero(val, 10));
	}

	public int getValor() {
		return valor;
	}

	public int getFila() {
		return fila;
	}

	public int getColumna() {
		return columna;
	}
	
	public void darFoco() {
		this.setBackground(Color.blue);
	}
	
	public void quitarFoco() {
		this.setBackground(Color.black);
	}

	private ImageIcon getIconoDeNumero(int num, int size) {
		ImageIcon img = null;
		String path;
		try {// Guardamos la imagen en un buffer, lo que nos permite escalarla
			path = getClass().getResource("/num-tablero-" + num + ".png").getPath();
			Image dimg = ImageIO.read(new File(path));
			//dimg = dimg.getScaledInstance(size, size, Image.SCALE_SMOOTH);

			img = new ImageIcon(dimg);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return img;
	}
}
