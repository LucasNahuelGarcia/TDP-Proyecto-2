package gui;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import logica.Posicion;

abstract class Celda extends JButton {
	private static final long serialVersionUID = 1L;
	protected Posicion posicion;
	protected Integer valor;
	protected ImageProvider imageProvider;
	protected Color color;

	Celda(ImageProvider imageProvider, Posicion p, Integer valor) {
		this.imageProvider = imageProvider;
		this.posicion = p;
		this.valor = valor;
		this.color = Color.black;
		resetColor();
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
		return posicion.fila();
	}

	public int getColumna() {
		return posicion.columna();
	}

	public void resetColor() {
		this.setBackground(color);
	}
	
	public void marcarConflicto() {
		color = Color.red;
		resetColor();
	}
	
	public void quitarConflicto() {
		color = Color.black;
		resetColor();
	}
}
