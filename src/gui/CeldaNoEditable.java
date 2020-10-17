package gui;

import java.awt.Color;

public class CeldaNoEditable extends Celda {

	CeldaNoEditable(ImageProvider imageProvider, int fila, int columna, int val) {
		super(imageProvider, fila, columna, val);
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
