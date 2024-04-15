package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();

		int opcion;
		do {

			menu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				registrarJugador(sc, listaJugadores);
				break;
			case 2:
				mostrarDatosJugadores(sc, listaJugadores);
				break;
			case 3:
				mostrarJugadoresOrdenadosPorApellido(listaJugadores);
				break;
			case 4:
				modificarDatosJugador(sc, listaJugadores);
				break;
			case 5:
				eliminarJugador(sc, listaJugadores);
				break;
			case 6:
				mostrarCantidadTotalJugadores(listaJugadores);
				break;
			case 7:
				mostrarCantidadJugadoresPorNacionalidad(sc, listaJugadores);
				break;
			case 8:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("OPCION INCORRECTA!");

			}

		} while (opcion != 8);

		sc.close();

	}

	public static void menu() {
		System.out.println("\n**** MENU DE OPCIONES *****");
		System.out.println("1 - Alta de jugador");
		System.out.println("2 - Mostrar los datos del jugador");
		System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
		System.out.println("4 - Modificar los datos de un jugador");
		System.out.println("5 - Eliminar un jugador");
		System.out.println("6 - Mostrar la cantidad total de jugadores");
		System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
		System.out.println("8 - Salir");
		System.out.print("Seleccione una opción: ");
	}

	// OPCION 1
	public static void registrarJugador(Scanner sc, ArrayList<Jugador> jugadores) {
		try {
			System.out.println("Ingrese los datos del jugador:");
			System.out.print("Nombre: ");
			String nombre = sc.next();
			System.out.print("Apellido: ");
			String apellido = sc.next();
			System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
			sc.nextLine();
			LocalDate fechaNacimiento = LocalDate.parse(sc.next());
			System.out.print("Nacionalidad: ");
			String nacionalidad = sc.next();
			System.out.print("Estatura: ");
			double estatura = sc.nextDouble();
			System.out.print("Peso: ");
			double peso = sc.nextDouble();
			System.out.print("Posición (delantero, medio, defensa, arquero): ");
			String posicion = sc.next();

			Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
			jugadores.add(jugador);
			System.out.println("Jugador agregado con éxito.");
		} catch (Exception e) {
			System.out.println("Ingreso de datos invalido");
		}
	}

	// OPCION 2
	public static void mostrarDatosJugadores(Scanner sc, ArrayList<Jugador> jugadores) {
		System.out.println("Ingrese el nombre y apellido del jugador:");
		System.out.print("Nombre: ");
		String nombre = sc.next();
		System.out.print("Apellido: ");
		String apellido = sc.next();
		int cont = 0;

		for (Jugador jugador : jugadores) {
			if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
				jugador.mostrarDatos();
				cont++;
			}
		}
		if (cont == 0)
			System.out.println("No se encontró un jugador con ese nombre y apellido.");
	}

	// OPCION 3
	private static void mostrarJugadoresOrdenadosPorApellido(ArrayList<Jugador> jugadores) {
		ArrayList<Jugador> jugadoresOrdenados = new ArrayList<>(jugadores);
		Collections.sort(jugadoresOrdenados, (j1, j2) -> j1.getApellido().compareToIgnoreCase(j2.getApellido()));

		System.out.println("Jugadores ordenados por apellido:");
		for (Jugador jugador : jugadoresOrdenados) {
			System.out.println(jugador.getApellido() + ", " + jugador.getNombre());
		}
	}

	// OPCION 4
	private static void modificarDatosJugador(Scanner sc, ArrayList<Jugador> jugadores) {
		try {
			System.out.println("Ingrese el nombre y el apellido del jugador a modificar");
			System.out.print("Nombre: ");
			String nombre = sc.next();
			System.out.print("Apellido: ");
			String apellido = sc.next();
			for(Jugador jugador : jugadores) {
				if(jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
					System.out.println("Ingrese los nuevos datos del jugador: ");
					System.out.print("Nombre: ");
					nombre = sc.next();
					System.out.print("Apellido: ");
					apellido = sc.next();
					System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
					sc.nextLine();
					LocalDate fechaNacimiento = LocalDate.parse(sc.next());
					System.out.print("Nacionalidad: ");
					String nacionalidad = sc.next();
					System.out.print("Estatura: ");
					double estatura = sc.nextDouble();
					System.out.print("Peso: ");
					double peso = sc.nextDouble();
					System.out.print("Posición (delantero, medio, defensa, arquero): ");
					String posicion = sc.next();
					jugador.setNombre(nombre);
					jugador.setApellido(apellido);
					jugador.setEstatura(estatura);
					jugador.setFechaNacimiento(fechaNacimiento);
					jugador.setNacionalidad(nacionalidad);
					jugador.setPeso(peso);
					jugador.setPosicion(posicion);
					System.out.println("Datos del jugador modificado exitosamente!");
					break;
				}
			}

		} catch (Exception e) {
			System.out.println("Ingreso de datos invalidos");
		}
	}

	// OPCION 5
	private static void eliminarJugador(Scanner sc, ArrayList<Jugador> jugadores) {
		try {
			Iterator<Jugador> iterador = jugadores.iterator();
			boolean band = jugadores.size() >= 0;
			boolean band2 = false;
			System.out.println("Ingrese el nombre y el apellido del jugador a eliminar: ");
			String nombre = sc.next();
			String apellido = sc.next();
			while (iterador.hasNext()) {
				Jugador elemento = iterador.next();
				if (elemento.getNombre().equals(nombre) && elemento.getApellido().equals(apellido)) {
					iterador.remove();
					band2 = true;
				}
			}

			if (!band) {
				System.out.println("El listado esta vacio!");
			}
			if (band2) {
				System.out.println("Jugador eliminado exitosamente!");
			} else {
				System.out.println("No existe jugador con dicho nombre y apellido");
			}
		} catch (Exception e) {
			System.out.println("Ingreso de datos invalidos!");
		}
	}

	// OPCION 6
	private static void mostrarCantidadTotalJugadores(ArrayList<Jugador> jugadores) {
		System.out.println("Cantidad total de jugadores: " + jugadores.size());
	}

	// OPCION 7
	private static void mostrarCantidadJugadoresPorNacionalidad(Scanner sc, ArrayList<Jugador> jugadores) {
		try {
			int cont = 0;
			System.out.println("Ingrese la nacionalidad a buscar: ");
			String nacionalidad = sc.next();
			for (Jugador jugador : jugadores) {
				if (jugador.getNacionalidad().equals(nacionalidad)) {
					cont++;
				}
			}
			if(cont!=0) {
				System.out.println("Cantidad de jugadores de nacionalidad " + nacionalidad + ": " + cont);
			} else {
				System.out.println("No hay jugadores de nacionalidad " + nacionalidad + ".");
			}
		} catch (Exception e) {
			System.out.println("Ingreso de datos invalidos!");
		}
	}
}
