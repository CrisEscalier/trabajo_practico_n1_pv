package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Calendar fechaNac = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese la fecha de nacimiento: ");
		System.out.print("Año: ");
		int anio = sc.nextInt();
		System.out.print("Mes (1 al 12): ");
		int mes = sc.nextInt();
		System.out.print("Dia: ");
		int dia = sc.nextInt();
		fechaNac.set(anio, mes-1, dia);
		
		Persona persona1 = new Persona(nombre,fechaNac);
		
		persona1.mostrarDatos();
		
		sc.close();

	}

}
