package ar.edu.ort.p1.unidades.u1.ejemplos._01_enum._01_ejemplo_nivel_estudio.src;

import java.util.ArrayList;

/**
 * 
 * @author ihsanch
 *
 */
public class Empresa {

	private ArrayList<Persona> personas;

	/*----------------------------------------------------------------------------*/

	public Empresa() {
		this.personas = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	public void agregarPersona(Persona persona) {
		this.personas.add(persona);
	}

	/**
	 * 
	 * @param nivelEstudio
	 */
	public void mostrarPorNivel(NivelDeEstudio nivelEstudio) {
		for (Persona persona : personas) {
			if (persona.getNivelDeEstudio() == nivelEstudio) {
				System.out.println(persona);
			}
		}
	}
}
