package logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TableroSudoku {
  private final String _separador = " ";
  private final int _tablero_size = 9;

  private Integer[][] celdas;

  public TableroSudoku() {
    celdas = new Integer[_tablero_size][_tablero_size];
  }

  public void readFromFile(String name) throws FileNotFoundException, ArchivoIncorrectoException {
    File archivo = new File(name);
    Scanner scanner = new Scanner(archivo);
    String[] fila;

    for (int f = 0; scanner.hasNextLine(); f++) {
      fila = scanner.nextLine().split(_separador);

      if (fila.length != _tablero_size) {
        scanner.close();
        String msg = String.format("Numero de columnas incorrecto en la linea %d de %s", (f + 1), name);
        throw new ArchivoIncorrectoException(msg);
      }

      for (int c = 0; c < fila.length; c++)
        try {
          celdas[f][c] = Integer.parseInt(fila[c]);
        } catch (NumberFormatException e) {
          String msg = String.format("No se pudo reconocer %s (%d,%d) de %s", fila[c], f, c, name);
          throw new ArchivoIncorrectoException(msg);
        } finally {
          scanner.close();
        }
    }

    scanner.close();
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
