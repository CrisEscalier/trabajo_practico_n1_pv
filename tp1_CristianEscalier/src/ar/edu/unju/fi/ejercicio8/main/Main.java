package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		
		System.out.println("Calculadora Iniciada");
		System.out.print("Ingrese un numero entero: ");
		num = sc.nextInt();
		
		CalculadoraEspecial c = new CalculadoraEspecial();
		c.setNumero(num);
		
		System.out.println("Resultado sumatoria: " + c.calcularSumatoria());
		System.out.println("Resultado productoria: " + c.calcularProductoria());
		
		sc.close();
		
	}

}
