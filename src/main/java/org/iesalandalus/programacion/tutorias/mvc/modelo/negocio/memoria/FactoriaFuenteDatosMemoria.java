package org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.memoria;

import org.iesalandalus.programacion.tutorias.mvc.modelo.IFuenteDatos;
import org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.*;

public class FactoriaFuenteDatosMemoria implements IFuenteDatos {

	public FactoriaFuenteDatosMemoria() {
		
	}
	
	public IAlumnos crearAlumnos() {
		
		return new Alumnos();
	}
	
	public IProfesores crearProfesores() {
		
		return new Profesores();
	}
	public ITutorias crearTutorias() {
		return new Tutorias();
		
		
	}
	public ISesiones crearSesiones() {
		return new Sesiones();
	}
	public ICitas crearCitas() {

		return new Citas();
	}
}
