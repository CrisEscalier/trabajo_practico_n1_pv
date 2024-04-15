package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] arreglo = new String[5];
		int j = 0;

		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("Ingrese un nombre: ");
			arreglo[i] = sc.nextLine();
		}

		while (j < arreglo.length) {
			System.out.println("arreglo[" + j + "]: " + arreglo[j]);
			j++;
		}

		System.out.println("Tamaño del arreglo: " + arreglo.length);

		System.out.println("Ingrese una posicion a eliminar, del 1 al 5: ");
		byte num = sc.nextByte();
		num--;
		do {
			arreglo[num] = arreglo[num + 1];
			num++;
		} while (num < j - 1);

		for (int i = 0; i < arreglo.length - 1; i++) {
			System.out.println("arreglo[" + i + "]: " + arreglo[i]);
		}

		sc.close();

	}

}
