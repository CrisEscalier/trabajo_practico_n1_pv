package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nombre;
		int codigo, descuento, cont = 0;
		double precio;
		
		Producto producto1 = new Producto();
		Producto producto2 = new Producto();
		Producto producto3 = new Producto();
		
		do {
			System.out.print("Ingrese el nombre del producto: ");
			nombre = sc.nextLine();
			System.out.print("Ingrese el codigo del producto: ");
			codigo = sc.nextInt();
			sc.nextLine();
			System.out.print("Ingrese el precio del producto: ");
			precio = sc.nextDouble();
			sc.nextLine();
			
			do {
				System.out.print("Ingrese el descuento del producto [0-50]%: ");
				descuento = sc.nextInt();
				sc.nextLine();
			} while (descuento < 0 || descuento > 50);

			if(cont==0)
				producto1 = new Producto(nombre,codigo,precio,descuento);
			if(cont==1)
				producto2 = new Producto(nombre,codigo,precio,descuento);
			if(cont==2)
				producto3 = new Producto(nombre,codigo,precio,descuento);
			
			cont++;
		} while (cont < 3);
		
		producto1.mostrarDatos();
		producto2.mostrarDatos();
		producto3.mostrarDatos();
		
		sc.close();

	}

}
