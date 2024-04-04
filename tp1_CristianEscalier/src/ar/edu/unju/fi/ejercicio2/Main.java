package ar.edu.unju.fi.ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		String nombrePais = "Argentina";
		byte edad = 18;
		double alturaEdificio = 130.5d;
		double precio = 2404.35d;
		String numeroTelefono = "0810 444 9256";
		double angulo = 0.5d;
		double coseno = Math.cos(angulo);
		
		System.out.println("Pais: " + nombrePais);
		System.out.println("Edad de la persona: " + edad);
		System.out.println("La altura del edificio Madero Office es de: " + alturaEdificio + "m");
		System.out.println("El precio de una lata de atun La campagnola de 170g es: $" + precio);
		System.out.println("Numero de telefono de atencion al cliente: " + numeroTelefono);
		System.out.println("Coseno de " + angulo +" es: " + coseno);
		
	}

}
