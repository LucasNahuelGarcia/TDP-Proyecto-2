package gui;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

abstract class Celda extends JButton {
	private static final long serialVersionUID = 1L;
	protected int fila, columna;
	protected Integer valor;
	protected ImageProvider imageProvider;

	Celda(ImageProvider imageProvider, int fila, int columna, Integer valor) {
		this.imageProvider = imageProvider;
		this.fila = fila;
		this.columna = columna;
		this.valor = valor;
		this.quitarFoco();
		this.setHorizontalAlignment(JButton.CENTER);
		this.setVerticalAlignment(JButton.CENTER);
		this.setBorder(BorderFactory.createEmptyBorder());
	}

	public void setValor(int val) {
		valor = val;
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

	public void quitarFoco() {
		this.setBackground(Color.black);
	}
}
