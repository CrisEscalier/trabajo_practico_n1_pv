package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private int dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;

	public Persona() {
	}

	public Persona(int dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}

	public Persona(int dni, String nombre, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia="Jujuy";
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	

	public int calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(this.getFechaNacimiento(), fechaActual);
		return periodo.getYears();
	}
	
	public boolean verificarEdad() {
		return calcularEdad()>=18;
	}
	
	public void mostrarDatos() {
		int anio,mes,dia;
		anio = this.getFechaNacimiento().getYear();
		mes = this.getFechaNacimiento().getMonthValue();
		dia = this.getFechaNacimiento().getDayOfMonth();
		System.out.println("\nNombre: " + this.getNombre());
		System.out.println("Provincia: " + this.getProvincia());
		System.out.println("DNI: " + this.getDni());
		System.out.println("Fecha de Nacimiento: " + dia + "/" + mes + "/" + anio);
		System.out.println("Edad: " + calcularEdad());
		if(verificarEdad()==true){
			System.out.println("La persona es mayor de edad");
		} else
			System.out.println("La persona no es mayor de edad");
	}

}
