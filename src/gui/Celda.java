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
	private ImageProvider imageProvider;

	Celda(ImageProvider imageProvider, int fila, int columna, Integer valor) {
		this.imageProvider = imageProvider;
		this.fila = fila;
		this.columna = columna;
		this.valor = valor;
		this.quitarFoco();
		this.setHorizontalAlignment(JButton.CENTER);
		this.setVerticalAlignment(JButton.CENTER);
		this.setBorder(BorderFactory.createEmptyBorder());

		// Si el valor es nulo, consideramos a la casilla no editable
		if (valor != null)
			this.setIcon(imageProvider.getIconoDeCelda(valor));
	}

	Celda(ImageProvider imageProvider, int fila, int columna) {
		this(imageProvider, fila, columna, null);
	}

	public void setValor(int val) {
		valor = val;
		this.setIcon(imageProvider.getIconoDeCelda(val));
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

}
