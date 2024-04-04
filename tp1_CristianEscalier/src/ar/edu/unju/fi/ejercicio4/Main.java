package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int calculo,cont;
		calculo=1;
		cont=1;
		int num;
		boolean band;
		
		System.out.println("Ingrese un numero, entre el 0 y el 10, para calcular su factorial: ");
		num = sc.nextInt();
		band=num>=0 && num<=10;
			
		while(band){
			calculo=calculo*cont;
			cont++;
			band=cont<=num;
		}
		
		if(num>=0 && num<=10)
			System.out.println(num + "! = " + calculo);
		else
			System.out.println("Numero fuera del rango");
			
		sc.close();

	}

}
