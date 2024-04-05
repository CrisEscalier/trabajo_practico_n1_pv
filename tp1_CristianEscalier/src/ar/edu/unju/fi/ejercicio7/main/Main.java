package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nombre;
		int legajo;
		double salario;
		
		System.out.print("Ingrese el nombre del empleado: ");
		nombre = sc.nextLine();
		System.out.print("Ingrese el legajo del empleado: ");
		legajo = sc.nextInt();
		System.out.print("Ingrese el salario del empleado: ");
		salario = sc.nextDouble();
		
		Empleado empleado1 = new Empleado(nombre,legajo,salario);
		
		empleado1.mostrarDatos();
		
		int anios;
		System.out.print("Ingrese la cantidad de años del empleado: ");
		anios = sc.nextInt();
		empleado1.darAumento(anios);		
		empleado1.mostrarDatos();
		
		sc.close();

	}

}
