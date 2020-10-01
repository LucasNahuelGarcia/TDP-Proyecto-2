package logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Modela el controlador de un tablero de sudoku
 */
public class TableroSudoku {
  private final String _separador = " ";
  private final int _tablero_size = 9;
  private Integer[][] celdas;

  /**
   * Crea un nuevo TableroSudoku
   */
  public TableroSudoku() {
    celdas = new Integer[_tablero_size][_tablero_size];
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
   * Lee de un archivo de texto que contendrá 9 filas de 9 números separados por
   * un espacio.
   * 
   * @param ruta Ruta del archivo
   * @throws FileNotFoundException      En caso de no encontrar el archivo.
   * @throws ArchivoIncorrectoException En caso de que el archivo no respete el
   *                                    formato.
   */
  public void readFromFile(String ruta) throws FileNotFoundException, ArchivoIncorrectoException {
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

  public String toString() {
    String str = "";

    for (int f = 0; f < celdas.length; f++) {
      for (int c = 0; c < celdas[0].length; c++)
        str = str + "|" + celdas[f][c];
      str = str + '\n';
    }

    return str;
  }
}
