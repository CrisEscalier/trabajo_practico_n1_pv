package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();

		int cont = 0;
		int diametro;
		String resp;
		boolean ingredientes;

		System.out.println("Bienvenido a la pizzeria!!");
		do {

			do {
				System.out.println("Ingrese el diametro de la pizza 20, 30 o 40: ");
				diametro = sc.nextInt();
			} while (diametro != 20 && diametro != 30 && diametro != 40);

			System.out.print("LLeva ingredientes especiales? si/no: ");
			resp = sc.next();
			ingredientes = resp.equalsIgnoreCase("si");

			if (cont == 0)
				pizza1 = new Pizza(diametro, ingredientes);
			if (cont == 1)
				pizza2 = new Pizza(diametro, ingredientes);
			if (cont == 2)
				pizza3 = new Pizza(diametro, ingredientes);

			cont++;
		} while (cont < 3);

		for (int i = 1; i <= cont; i++) {
			System.out.println("\n** Pizza " + i + " **");
			if (i == 1)
				pizza1.mostrarDatos();
			if (i == 2)
				pizza2.mostrarDatos();
			if (i == 3)
				pizza3.mostrarDatos();
		}

		sc.close();

	}

}
