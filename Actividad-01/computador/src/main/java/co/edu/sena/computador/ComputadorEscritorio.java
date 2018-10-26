package co.edu.sena.computador;

import co.edu.sena.computador.dispositivo.entrada.Mouse;
import co.edu.sena.computador.dispositivo.entrada.Teclado;
import co.edu.sena.computador.dispositivo.salida.Monitor;
import co.edu.sena.computador.partes.torre.Torre;

public class ComputadorEscritorio extends Computador {

	public ComputadorEscritorio(Torre torre, Mouse mouse, Teclado teclado, Monitor pantalla) {
		super(torre, mouse, teclado, pantalla);
	}

}
