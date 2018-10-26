package co.edu.sena.computador;

import co.edu.sena.computador.dispositivo.entrada.Camara;
import co.edu.sena.computador.dispositivo.entrada.Mouse;
import co.edu.sena.computador.dispositivo.entrada.Scanner;
import co.edu.sena.computador.dispositivo.entrada.Teclado;
import co.edu.sena.computador.dispositivo.entradasalida.Multifuncional;
import co.edu.sena.computador.dispositivo.salida.Impresora;
import co.edu.sena.computador.dispositivo.salida.Monitor;
import co.edu.sena.computador.partes.torre.Torre;

public class Computador {
	public Computador(Torre torre, Mouse mouse, Teclado teclado, Monitor pantalla) {
		super();
		this.torre = torre;
		this.mouse = mouse;
		this.teclado = teclado;
		this.pantalla = pantalla;
	}

	private Torre torre;
	private Mouse mouse;
	private Teclado teclado;
	private Monitor pantalla;
	private Camara camara = new Camara(null, null);
	private Impresora impresora = new Impresora(null, null);
	private Multifuncional multifuncional = new Multifuncional(null, null);
	private Scanner scanner = new Scanner(null, null);

	public Torre getTorre() {
		return torre;
	}

	public void setTorre(Torre torre) {
		this.torre = torre;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Monitor getPantalla() {
		return pantalla;
	}

	public void setPantalla(Monitor pantalla) {
		this.pantalla = pantalla;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public Impresora getImpresora() {
		return impresora;
	}

	public void setImpresora(Impresora impresora) {
		this.impresora = impresora;
	}

	public Multifuncional getMultifuncional() {
		return multifuncional;
	}

	public void setMultifuncional(Multifuncional multifuncional) {
		this.multifuncional = multifuncional;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

}
