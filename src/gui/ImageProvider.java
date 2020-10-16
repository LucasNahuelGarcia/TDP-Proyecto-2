package gui;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

class ImageProvider {
	private ImageIcon[] numeros_celda;

	public ImageProvider() {
		String path;
		int cantElementos = 10;
		numeros_celda = new ImageIcon[cantElementos];
		for (int i = 0; i < cantElementos; i++)
			try {
				// Guardamos la imagen en un buffer, lo que nos permite escalarla
				// Se toma la convención de que el sprite num-tablero-0 es el sprite de la
				// casilla vacia.
				path = getClass().getResource("/num-tablero-" + i + ".png").getPath();
				Image dimg = ImageIO.read(new File(path));
				// dimg = dimg.getScaledInstance(size, size, Image.SCALE_SMOOTH);

				numeros_celda[i] = new ImageIcon(dimg);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	public ImageIcon getIconoDeCelda(int num) {
		return numeros_celda[num];
	}

}
