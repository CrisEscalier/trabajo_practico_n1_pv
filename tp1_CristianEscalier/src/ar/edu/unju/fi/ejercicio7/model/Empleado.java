package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	
	private static double SALARIO_MINIMO = 210000.00d;
	private static double MERITO = 20000.00d;
	
	private String nombre;
	private int legajo;
	private double salario;
	
	public Empleado(String nombre, int legajo, double salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario = calcularSalario(salario);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularSalario(double salario) {
		if(salario>=SALARIO_MINIMO)
			return salario;
		else
			return SALARIO_MINIMO;
	}
	
	/**
	 * Metodo que otorga al empleado un aumento segun la cantidad de años trabajados
	 * @param anios La cantidad de años del empleado
	 */
	public void darAumento(int anios) {
		this.setSalario(this.getSalario() + anios*MERITO);
	}
	
	/**
	 * Metodo que muestra los datos del empleado por consola
	 */
	public void mostrarDatos() {
		System.out.println("\nNombre del empelado: " + this.getNombre());
		System.out.println("Legajo: " + this.getLegajo());
		System.out.println("Salario $: " + this.getSalario());
	}
	
	

}
