package logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Modela el controlador de un tablero de sudoku
 */
public class TableroSudoku {
	private final String _separador = " ";
	private final int _tablero_size = 9;
	private Integer[][] celdas;
	private boolean[][] esEditable;

	/**
	 * Crea un nuevo TableroSudoku
	 */
	public TableroSudoku() {
		celdas = new Integer[_tablero_size][_tablero_size];
		esEditable = new boolean[_tablero_size][_tablero_size];
	}

	/**
	 * Devuelve el valor almacenado en la celda pasada por parámetro
	 * 
	 * @param f Fila de la celda consultada
	 * @param c Columna de la celda consultada
	 */
	public int intAt(int f, int c) {
		return celdas[f][c];
	}

	/**
	 * Establece el valor de una celda del sudoku
	 * 
	 * @param f   fila de la celda
	 * @param c   columna de la celda
	 * @param val nuevo valor de la celda
	 * @return true si se pudo establecer el valor, false si no.
	 */
	public boolean setCasillaAt(int f, int c, int val) {
		boolean correcto = val > 0 && val < 10 && esEditable[f][c];
		if (correcto)
			celdas[f][c] = val;
		return correcto;
	}

	/**
	 * Lee de un archivo de texto que contendrá 9 filas de 9 números separados por
	 * un espacio.
	 * 
	 * @param ruta Ruta del archivo
	 * @throws FileNotFoundException      En caso de no encontrar el archivo.
	 * @throws ArchivoIncorrectoException En caso de que el archivo no respete el
	 *                                    formato.
	 */
	public void leerArchivo(String ruta) throws FileNotFoundException, ArchivoIncorrectoException {
		File archivo = new File(ruta);
		Scanner scanner = new Scanner(archivo);
		String[] fila;

		try {
			for (int f = 0; scanner.hasNextLine(); f++) {
				fila = scanner.nextLine().split(_separador);

				if (fila.length != _tablero_size) {
					scanner.close();
					String msg = String.format("Numero de columnas incorrecto en la linea %d de %s", (f + 1), ruta);
					throw new ArchivoIncorrectoException(msg);
				}

				for (int c = 0; c < fila.length; c++)
					celdas[f][c] = Integer.parseInt(fila[c]);

			}
		} catch (NumberFormatException e) {
			String msg = String.format("No se pudo interpretar un elemento del archivo %s", ruta);
			throw new ArchivoIncorrectoException(msg);
		} finally {
			scanner.close();
		}
	}

	/**
	 * Permite verificar si una celda es editable o no.
	 * @param f fila de la celda.
	 * @param c columna de la celda.
	 * @return verdadero si la celda es editable, falso si no.
	 */
	public boolean esEditable(int f, int c) {
		return esEditable[f][c];
	}
}
