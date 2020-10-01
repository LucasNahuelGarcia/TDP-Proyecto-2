package logica;

/**
 * Modela una excepción que ocurre cuando un archivo de sudoku no tiene el
 * formato correcto
 */
public class ArchivoIncorrectoException extends Exception {
  private static final long serialVersionUID = 1L;

  /**
   * Crea un nuevo ArchivoIncorrectoException, con un mensaje de error s
   * 
   * @param s Mensaje que se envía al lanzar la excepción.
   */
	public ArchivoIncorrectoException(String s) {
		super(s);
	}
}
