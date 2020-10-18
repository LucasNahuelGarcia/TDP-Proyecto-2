package gui;

import java.awt.Color;

import logica.Posicion;

public class CeldaEditable extends Celda {

	private static final long serialVersionUID = 1L;

	CeldaEditable(ImageProvider imageProvider, Posicion p, Integer valor) {
		super(imageProvider, p, valor);
		// Si el valor es nulo, la casilla esta vacía
		// usamos por convencion a 0 como indicador de casilla vacía.
		if (this.valor != null)
			this.valor = 0;
		this.setIcon(imageProvider.getIconoDeCeldaEditable(valor));
	}

	CeldaEditable(ImageProvider imageProvider, Posicion p) {
		this(imageProvider, p, null);
	}

	@Override
	public void setValor(int val) {
		valor = val;
		this.setIcon(imageProvider.getIconoDeCeldaEditable(val));
	}

	@Override
	public void grabFocus() {
		super.grabFocus();
		this.setBackground(Color.blue);
	}
}
