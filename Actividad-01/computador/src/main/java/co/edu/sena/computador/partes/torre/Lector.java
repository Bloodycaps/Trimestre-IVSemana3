package co.edu.sena.computador.partes.torre;

public class Lector extends Parte {
	private double ancho;
	private double alto;
	private double largo;

	public Lector(double ancho, double alto, double largo, String marca, String serial) {
		super(marca, serial);
		this.ancho = ancho;
		this.alto = alto;
		this.largo = largo;
	}

}
