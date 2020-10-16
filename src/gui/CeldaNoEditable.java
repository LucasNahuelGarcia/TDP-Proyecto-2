package gui;

import java.awt.Color;

public class CeldaNoEditable extends Celda{

	CeldaNoEditable(ImageProvider imageProvider, int fila, int columna, int val) {
		super(imageProvider, fila, columna, val);
	}
	
	@Override
	public void darFoco() {
		this.setBackground(Color.gray);
	}
}
