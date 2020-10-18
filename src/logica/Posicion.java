package logica;

public class Posicion {
	private int fila, columna;

	public Posicion(int f, int c) {
		fila = f;
		columna = c;
	}

	public int fila() {
		return fila;
	}

	public int columna() {
		return columna;
	}

	@Override
	public boolean equals(Object obj) {
		boolean equals = false;

		try {
			Posicion pos = (Posicion) obj;
			equals = this.fila == pos.fila() && this.columna == pos.columna;
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		return equals;
	}

	@Override
	public int hashCode() {
		int hash = 17;
		hash = hash * 31 + fila;
		hash = hash * 31 + columna;
		return hash;
	}
}
