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
}
