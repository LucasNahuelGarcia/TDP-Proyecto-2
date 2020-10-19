package gui;

import java.awt.Color;

import logica.Posicion;

public class CeldaNoEditable extends Celda {
	private static final long serialVersionUID = 2843864743814307535L;

	CeldaNoEditable(ImageProvider imageProvider, Posicion p, int val) {
		super(imageProvider, p, val);
		this.setIcon(imageProvider.getIconoDeCeldaNoEditable(valor));
	}

	@Override
	public void grabFocus() {
		super.grabFocus();
		this.setBackground(Color.gray);
	}

	@Override
	public void setValor(int val) {
		// No es editable, podria generar algun sonido cosa grafica
		// para indicar que no es posible.
	}
}
