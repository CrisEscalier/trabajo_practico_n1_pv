package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int tam,i;
		
		do {
			System.out.println("Ingrese el tamaño del arreglo, 5 - 10: ");
			tam = sc.nextInt();
		} while (tam <= 4 || tam >= 11);
		sc.nextLine();
		String[] arreglo = new String[tam];
		
		for (i = 0; i < arreglo.length; i++) {
			System.out.println("Ingrese el nombre de una persona");
			arreglo[i] = sc.nextLine();
		}

		sc.close();
		
		for (i = 0; i < arreglo.length; i++) {
			System.out.println("arreglo[" + i + "]: " + arreglo[i]);
		}

		for (i = arreglo.length - 1; i >= 0; i--) {
			System.out.println("arreglo[" + i + "]: " + arreglo[i]);
		}

	

	}

}
