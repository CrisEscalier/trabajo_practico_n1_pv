package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un numero, entre el 1 y el 9: ");
		int num;
		num = sc.nextInt();

		if (num >= 1 && num <= 9) {
			for (int i = 0; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + num * i);
			}
		} else
			System.out.println("Numero fuera del rango!");

		sc.close();

	}

}
