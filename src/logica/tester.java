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
      tablero.readFromFile(rutaArchivo + "archivoQueNoExiste.txt");
    });

    assertThrows(ArchivoIncorrectoException.class, () -> {
      tablero.readFromFile(rutaArchivo + "archivoIncorrecto-1.txt");
    });

    assertThrows(ArchivoIncorrectoException.class, () -> {
      tablero.readFromFile(rutaArchivo + "archivoIncorrecto-2.txt");
    });
  }

  @Test
  public void noExcepcionesAlLeerCorrecto() throws ArchivoIncorrectoException, FileNotFoundException {
    tablero.readFromFile(rutaArchivo + "archivoCorrecto.txt");
  }
}
