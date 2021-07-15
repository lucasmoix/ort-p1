package edu.ort.p1.extra.examenes._2021c1._recu2.tema2.src;

public class CamionDeSolidos extends Camion {

	public static final int MAX_LARGO = 6;
	public static final int KMTS = 200000;
	public static final int MAX_KMTS = 250000;
	
	private int ancho;
	private int alto;
	private int largo;

	public CamionDeSolidos(int ancho, int alto, int largo) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	@Override
	public boolean debeRenovarse() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void mostrarID() {
		// TODO Auto-generated method stub

	}

}
