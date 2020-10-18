package logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
	 * @throws PosicionInvalidaException 
	 */
	public void setCelda(Posicion p, int val) throws PosicionInvalidaException {
		if (esEditable[p.fila()][p.columna()])
			celdas[p.fila()][p.columna()] = val;
		else
			throw new PosicionInvalidaException(String.format("Posicion f(%d), c(%d)", p.fila(),p.columna()));
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
	 * 
	 * @param f fila de la celda.
	 * @param c columna de la celda.
	 * @return verdadero si la celda es editable, falso si no.
	 */
	public boolean esEditable(int f, int c) {
		return esEditable[f][c];
	}

	/**
	 * Elimina el valor de celdas al azar especificado en cantidad de cada región,
	 * haciendolas editables.
	 * 
	 * @param cantidad cantidad de celdas a eliminar por región.
	 */
	public void eliminarCeldas(int cantidad) {
		Random random = new Random();
		for (int f = 0; f < 3; f++)
			for (int c = 0; c < 3; c++)
				for (int i = 0; i < cantidad; i++) {
					int fEliminar = random.nextInt((3 * f + 3) - 3 * f) + 3 * f;
					int cEliminar = random.nextInt((3 * c + 3) - 3 * c) + 3 * c;
					esEditable[fEliminar][cEliminar] = true;
					// Usamos como convencion que 0 es una casilla vacia.
					celdas[fEliminar][cEliminar] = 0;
				}

	}

	/**
	 * Verifica si el valor de una de las celdas es correcto según las reglas del
	 * sudoku y devuelve una lista con las infracciones de esta.
	 * 
	 * @param p poscicion de la celda a verificar.
	 * @return una lista con las posiciones que tienen un conflicto con el valor de
	 *         la celda p.
	 */
	public List<Posicion> verificarCelda(Posicion p) {
		List<Posicion> conflictos = new ArrayList<Posicion>();
		int valCelda = celdas[p.fila()][p.columna()];

		// Verificamos la columna.
		for (int i = 0; i < celdas.length; i++)
			if (celdas[i][p.columna()] == valCelda && i != p.fila())
				conflictos.add(new Posicion(i, p.columna()));

		// Verificamos la fila.
		for (int i = 0; i < celdas[0].length; i++)
			if (celdas[p.fila()][i] == valCelda && i != p.columna())
				conflictos.add(new Posicion(p.fila(), i));

		// Encontramos el inicio de la región
		int fR = (p.fila() / (celdas.length / 3)) * 3;
		int cR = (p.columna() / (celdas[0].length / 3)) * 3;

		// Verificamos la region
		for (int f = fR; (f - fR) < 3; f++)
			for (int c = cR; (c - cR) < 3; c++)
				if (celdas[f][c] == valCelda && !p.equals(new Posicion(f, c)))
					conflictos.add(new Posicion(f, c));

		return conflictos;
	}
}
