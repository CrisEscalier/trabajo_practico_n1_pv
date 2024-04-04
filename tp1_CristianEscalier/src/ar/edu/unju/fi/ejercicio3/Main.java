package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingrese un numero entero: ");
		num = sc.nextInt();
		
		if(num%2==0)
			System.out.println("El triple de " + num + " es: " + num*3);
		else
			System.out.println("El doble de " + num + " es: " + num*2);
		

	}

}
