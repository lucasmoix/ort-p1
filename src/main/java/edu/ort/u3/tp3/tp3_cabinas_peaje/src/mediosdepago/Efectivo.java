package edu.ort.u3.tp3.tp3_cabinas_peaje.src.mediosdepago;

public class Efectivo extends MedioDePago {

	private static final double DCTO = 0;

	@Override
	public double obtenerDescuento() {
		return DCTO;
	}
}