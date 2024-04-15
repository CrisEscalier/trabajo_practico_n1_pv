package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el tamaño del arreglo, 3 - 10: ");
		int max = sc.nextInt();

		int[] arreglo = new int[max];

		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("Ingrese un numero entero: ");
			arreglo[i] = sc.nextInt();
		}
		int acum = 0;
		for (int i = 0; i < arreglo.length; i++) {
			acum += arreglo[i];
			System.out.println("arreglo[" + i + "]: " + arreglo[i]);
		}
		System.out.println("Sumatoria: " + acum);

		sc.close();

	}

}
