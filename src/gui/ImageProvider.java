package gui;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;

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
		URL path;
		numerosCeldaEditable = new ImageIcon[cantElementos];
			for (int i = 0; i < cantElementos; i++) {
				path = getClass().getResource("/editables/casilla-editable-" + i + ".png");

				numerosCeldaEditable[i] = new ImageIcon(path);
			}
	}

	private void cargarIconosCeldaNoEditable(int cantElementos) {
		URL path;
		numerosCeldaNoEditable = new ImageIcon[cantElementos];
		for (int i = 0; i < cantElementos; i++) {
			path = getClass().getResource("/noEditables/casilla-no-editable-" + (i + 1) + ".png");

			numerosCeldaNoEditable[i] = new ImageIcon(path);
		}
	}

	private void cargarIconosReloj(int cantElementos) {
		URL path;
		numerosReloj = new ImageIcon[cantElementos];
		for (int i = 0; i < cantElementos; i++) {
			path = getClass().getResource("/reloj/" + (i) + ".png");

			numerosReloj[i] = new ImageIcon(path);
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
