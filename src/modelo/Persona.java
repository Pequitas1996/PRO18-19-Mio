package modelo;

import java.time.LocalDate;
import java.util.Random;

public class Persona {

	private String nif; // this.nif
	private String nombre;
	private LocalDate fecha_nac;
	private int longPaso;

	/*-----------------------02/10/2018 Metodo Constructor------------------
	 * Vamos a averiguar para que funciona el metodo constructor, 
	 * 1)el prototipo del constructor tiene que tener el mismo nombre de la Clase.
	 * 
	 * 3)En la llamada se llama al constructor con la palabra new
	 * */

	public Persona(String nif, String nombre, int longPaso) {
		super();// tiene que ver con la herencia
		this.nif = nif;
		this.nombre = nombre;
		this.longPaso = longPaso;
		this.fecha_nac = null;
	}

	public Persona() { /* constructo de la superClass */
		super();
		this.nif = "12345678F";
		this.nombre = "Anonimo";
		this.fecha_nac = LocalDate.now();
		this.longPaso = 33;
	}

	public int caminar(int numPasos) {

		double a = 9.0;

		Random rnd = new Random();
		int valor = rnd.nextInt();

		return numPasos * longPaso / 100;

	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

}
