package gui;

import java.awt.Color;

public class CeldaEditable extends Celda {

	private static final long serialVersionUID = 1L;

	CeldaEditable(ImageProvider imageProvider, int fila, int columna, Integer valor) {
		super(imageProvider, fila, columna, valor);
		// Si el valor es nulo, la casilla esta vacía
		// usamos por convencion a 0 como indicador de casilla vacía.
		if (this.valor != null)
			this.valor = 0;
		this.setIcon(imageProvider.getIconoDeCeldaEditable(valor));
	}

	CeldaEditable(ImageProvider imageProvider, int fila, int columna) {
		this(imageProvider, fila, columna, null);
	}

	@Override
	public void setValor(int val) {
		valor = val;
		this.setIcon(imageProvider.getIconoDeCeldaEditable(val));
	}

	@Override
	public void darFoco() {
		this.setBackground(Color.blue);
	}
}
