package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int dni, anio, mes, dia;
		String nombre, provincia,vacio;
		LocalDate fechaNacimiento;

		System.out.println("Ingrese los datos de la primera persona: ");
		System.out.print("Nombre > ");
		nombre = sc.nextLine();
		System.out.print("DNI > ");
		dni = sc.nextInt();
		System.out.println("Fecha de Naciemiento: ");
		System.out.print("Año > ");
		anio = sc.nextInt();
		System.out.print("Mes > ");
		mes = sc.nextInt();
		System.out.print("Dia > ");
		dia = sc.nextInt();
		System.out.print("Provincia > ");
		vacio = sc.nextLine();
		provincia = sc.nextLine();
		fechaNacimiento = LocalDate.of(anio, mes, dia);
		Persona persona1 = new Persona();

		persona1.setDni(dni);
		persona1.setNombre(nombre);
		persona1.setFechaNacimiento(fechaNacimiento);
		persona1.setProvincia(provincia);
		
		System.out.println("Ingrese los datos de la segunda persona: ");
		System.out.print("Nombre > ");		
		nombre = sc.nextLine();
		System.out.print("DNI > ");
		dni = sc.nextInt();
		System.out.println("Fecha de Naciemiento: ");
		System.out.print("Año > ");
		anio = sc.nextInt();
		System.out.print("Mes > ");
		mes = sc.nextInt();
		System.out.print("Dia > ");
		dia = sc.nextInt();
		System.out.print("Provincia > ");
		vacio = sc.nextLine();
		provincia = sc.nextLine();
		fechaNacimiento = LocalDate.of(anio, mes, dia);
		Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);

		System.out.println("Ingrese los datos de la segunda persona: ");
		System.out.print("Nombre > ");
		nombre = sc.nextLine();
		System.out.print("DNI > ");
		dni = sc.nextInt();
		System.out.println("Fecha de Naciemiento: ");
		System.out.print("Año > ");
		anio = sc.nextInt();
		System.out.print("Mes > ");
		mes = sc.nextInt();
		System.out.print("Dia > ");
		dia = sc.nextInt();
		fechaNacimiento = LocalDate.of(anio, mes, dia);
		Persona persona3 = new Persona(dni, nombre, fechaNacimiento);

		persona1.mostrarDatos();
		persona2.mostrarDatos();
		persona3.mostrarDatos();

		sc.close();
	}

}
