package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[8];
		int cont = 0;
		int num;
		
		do {
			System.out.println("Ingrese un numero: ");
			num = sc.nextInt();
			numeros[cont] = num;
			cont++;
		} while (cont < 8);

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("numeros[" + i + "]: " + numeros[i]);
		}

		sc.close();

	}

}
