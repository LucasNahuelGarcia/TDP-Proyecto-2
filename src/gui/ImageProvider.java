package gui;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

class ImageProvider {
	private ImageIcon[] numerosCeldaEditable;
	private ImageIcon[] numerosCeldaNoEditable;
	private ImageIcon[] numerosReloj;

	public ImageProvider() {
		cargarIconosCeldaEditable(10);
		cargarIconosCeldaNoEditable(9);
		cargarIconosReloj(10);
	}

	private void cargarIconosCeldaEditable(int cantElementos) {
		String path;
		Image dimg;
		numerosCeldaEditable = new ImageIcon[cantElementos];
		try {
			for (int i = 0; i < cantElementos; i++) {
				// Guardamos la imagen en un buffer, lo que nos permite escalarla
				// Se toma la convención de que el sprite num-tablero-0 es el sprite de la
				// casilla vacia.
				path = getClass().getResource("/editables/casilla-editable-" + i + ".png").getPath();
				dimg = ImageIO.read(new File(path));
				// dimg = dimg.getScaledInstance(size, size, Image.SCALE_SMOOTH);

				numerosCeldaEditable[i] = new ImageIcon(dimg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void cargarIconosCeldaNoEditable(int cantElementos) {
		String path;
		Image dimg;
		numerosCeldaNoEditable = new ImageIcon[cantElementos];
		try {
			for (int i = 0; i < cantElementos; i++) {
				// Guardamos la imagen en un buffer, lo que nos permite escalarla
				// Se toma la convención de que el sprite num-tablero-0 es el sprite de la
				// casilla vacia.
				path = getClass().getResource("/noEditables/casilla-no-editable-" + (i + 1) + ".png").getPath();
				dimg = ImageIO.read(new File(path));
				// dimg = dimg.getScaledInstance(size, size, Image.SCALE_SMOOTH);

				numerosCeldaNoEditable[i] = new ImageIcon(dimg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void cargarIconosReloj(int cantElementos) {
		String path;
		Image dimg;
		numerosCeldaNoEditable = new ImageIcon[cantElementos];
		try {
			for (int i = 0; i < cantElementos; i++) {
				// Guardamos la imagen en un buffer, lo que nos permite escalarla
				// Se toma la convención de que el sprite num-tablero-0 es el sprite de la
				// casilla vacia.
				path = getClass().getResource("/reloj/" + (i) + ".png").getPath();
				dimg = ImageIO.read(new File(path));
				// dimg = dimg.getScaledInstance(size, size, Image.SCALE_SMOOTH);

				numerosReloj[i] = new ImageIcon(dimg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ImageIcon getIconoDeCeldaEditable(int num) {
		return numerosCeldaEditable[num];
	}

	public ImageIcon getIconoDeCeldaNoEditable(int num) {
		return numerosCeldaNoEditable[num - 1];
	}
	
	public ImageIcon getIconoReloj(int num) {
		return numerosReloj[num];
	}
}
