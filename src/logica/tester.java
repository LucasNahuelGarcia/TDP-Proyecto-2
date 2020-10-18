package logica;

import static org.junit.Assert.*;
import org.junit.*;

import java.io.FileNotFoundException;

public class tester {
	final private String rutaArchivo = "/home/lucas/Documentos/TecProg/proyecto2/Sudoku/res/";
	private TableroSudoku tablero;

	@Before
	public void setUp() {
		tablero = new TableroSudoku();
	}

	@Test
	public void excepcionesDeLeerArchivo() {
		assertThrows(FileNotFoundException.class, () -> {
			tablero.leerArchivo(rutaArchivo + "archivoQueNoExiste.txt");
		});

		assertThrows(ArchivoIncorrectoException.class, () -> {
			tablero.leerArchivo(rutaArchivo + "archivoIncorrecto-1.txt");
		});

		assertThrows(ArchivoIncorrectoException.class, () -> {
			tablero.leerArchivo(rutaArchivo + "archivoIncorrecto-2.txt");
		});
	}

	@Test
	public void noExcepcionesAlLeerCorrecto() throws ArchivoIncorrectoException, FileNotFoundException {
		tablero.leerArchivo(rutaArchivo + "archivoCorrecto.txt");
	}

	private void inicializarArr(Integer arr[][]) {
		for (int f = 0; f < arr.length; f++) {
			for (int c = 0; c < arr[0].length; c++)
				arr[f][c] = (c + f) % 10;
		}
	}

	@Test
	public void leeCorrectamente() throws ArchivoIncorrectoException, FileNotFoundException {
		Integer[][] arr = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, };

		// inicializarArr(arr);
		tablero.leerArchivo(rutaArchivo + "archivoPruebaLectura.txt");

		for (int f = 0; f < 9; f++)
			for (int c = 0; c < 9; c++)
				assertEquals((int) arr[f][c], tablero.intAt(f, c));
	}

	private boolean tieneConflictos(String nombreArchivo) throws FileNotFoundException, ArchivoIncorrectoException {
		tablero.leerArchivo(rutaArchivo + nombreArchivo);
		int conflictos = 0;

		for (int f = 0; f < 9; f++)
			for (int c = 0; c < 9; c++) {
				if (!tablero.verificarCelda(new Posicion(f, c)).isEmpty())
					conflictos++;
			}

		return conflictos > 0;
	}
	@Test
	public void conflictos() throws FileNotFoundException, ArchivoIncorrectoException {
		assertTrue(tieneConflictos("solucionIncorrectaLinea.txt"));
		assertTrue(tieneConflictos("solucionIncorrectaColumna.txt"));
		assertTrue(tieneConflictos("solucionIncorrectaRegion.txt"));
		assertFalse(tieneConflictos("archivoCorrecto.txt"));
	}
}
