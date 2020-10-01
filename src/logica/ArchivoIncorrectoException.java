package logica;

/**
 * Modela una excepción que ocurre cuando un archivo de sudoku no tiene el
 * formato correcto
 */
public class ArchivoIncorrectoException extends Exception {
	/**
	 * Crea un nuevo ArchivoIncorrectoException, con un mensaje de error s
	 * 
	 * @param s Mensaje que se envía al lanzar la excepción.
	 */
	public ArchivoIncorrectoException(String s) {
		super(s);
	}
}
