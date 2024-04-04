package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		/*
		 * Persona persona1 = new Persona(); LocalDate fechaNacimientoPersona1 =
		 * LocalDate.of(1998, 11,14); persona1.setDni(41609462);
		 * persona1.setNombre("Cristian Escalier");
		 * persona1.setFechaNacimiento(fechaNacimientoPersona1);
		 * persona1.setProvincia("Jujuy"); persona1.mostrarDatos(); LocalDate
		 * fechaNacimientoPersona2 = LocalDate.of(1995, 4, 23); Persona persona2 = new
		 * Persona(12342,"Carlos Sagas",fechaNacimientoPersona2,"Salta");
		 * persona2.mostrarDatos(); LocalDate fechaNacimientoPersona3 =
		 * LocalDate.of(2010, 1, 1); Persona persona3 = new
		 * Persona(11233,"Maria Sanchez",fechaNacimientoPersona3);
		 * persona3.mostrarDatos();
		 */

		Scanner sc = new Scanner(System.in);

		int dni, anio, mes, dia;
		String nombre, provincia;
		LocalDate fechaNacimiento;

		System.out.println("Ingrese los datos de la primera persona: ");
		System.out.print("Nombre > ");
		nombre = sc.next();
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
		provincia = sc.next();
		fechaNacimiento = LocalDate.of(anio, mes, dia);
		Persona persona1 = new Persona();

		persona1.setDni(dni);
		persona1.setNombre(nombre);
		persona1.setFechaNacimiento(fechaNacimiento);
		persona1.setProvincia(provincia);

		System.out.println("Ingrese los datos de la segunda persona: ");
		System.out.print("Nombre > ");
		nombre = sc.next();
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
		provincia = sc.next();
		fechaNacimiento = LocalDate.of(anio, mes, dia);
		Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);

		System.out.println("Ingrese los datos de la segunda persona: ");
		System.out.print("Nombre > ");
		nombre = sc.next();
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
		provincia = sc.next();
		fechaNacimiento = LocalDate.of(anio, mes, dia);
		Persona persona3 = new Persona(dni, nombre, fechaNacimiento);

		persona1.mostrarDatos();
		persona2.mostrarDatos();
		persona3.mostrarDatos();

		sc.close();
	}

}
