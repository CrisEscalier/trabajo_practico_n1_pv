package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion;
		ArrayList<DestinoTuristico> listaDeDestinos = new ArrayList<>();
		ArrayList<Pais> listaDePaises = new ArrayList<>();
		Pais pais1 = new Pais("Argentina", generarCodigo());
		Pais pais2 = new Pais("Brazil", generarCodigo());
		Pais pais3 = new Pais("Chile", generarCodigo());
		Pais pais4 = new Pais("Bolivia", generarCodigo());
		Pais pais5 = new Pais("Alemania", generarCodigo());
		Pais pais6 = new Pais("Portugal", generarCodigo());
		Pais pais7 = new Pais("Mexico", generarCodigo());
		Pais pais8 = new Pais("Francia", generarCodigo());
		Pais pais9 = new Pais("Canada", generarCodigo());
		listaDePaises.add(pais1);
		listaDePaises.add(pais2);
		listaDePaises.add(pais3);
		listaDePaises.add(pais4);
		listaDePaises.add(pais5);
		listaDePaises.add(pais6);
		listaDePaises.add(pais7);
		listaDePaises.add(pais8);
		listaDePaises.add(pais9);
		mostrarPaises(listaDePaises);
		do {
			menu();
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				registrarDestinoTuristico(sc, listaDeDestinos, listaDePaises);
				break;
			case 2:
				mostrarDestinos(listaDeDestinos);
				break;
			case 3:
				modificarPais(sc, listaDeDestinos, listaDePaises);
				break;
			case 4:
				limpiarLista(listaDeDestinos);
				break;
			case 5:
				eliminarDestino(sc, listaDeDestinos);
				break;
			case 6:
				ordenarPorNombre(listaDeDestinos);
				break;
			case 7:
				mostrarPaises(listaDePaises);
				break;
			case 8:
				mostrarDestinosPorCodigoPais(listaDeDestinos, sc, listaDePaises);
				break;
			case 9:
				System.out.println("Saliendo del Programa");
				break;
			default:
				System.out.println("Opcion Incorrecta!");
			}

		} while (opcion != 9);

		sc.close();

	}

	public static void menu() {
		System.out.println("\n**** MENU DE OPCIONES ****");
		System.out.println("1- Registrar destino turistico");
		System.out.println("2- Mostrar los destinos turisticos");
		System.out.println("3- Modificar el pais de un destino turistico");
		System.out.println("4- Limpiar el listado de destinos turisticos");
		System.out.println("5- Eliminar un destino turistico");
		System.out.println("6- Mostrar los destinos turisticos ordenados por nombre");
		System.out.println("7- Mostrar todos los paises");
		System.out.println("8- Mostrar los destinos turisticos de un pais");
		System.out.println("9- Salir del Programa");
		System.out.println("Ingrese una opcion: ");
	}

	// OPCION 1

	public static void registrarDestinoTuristico(Scanner sc, ArrayList<DestinoTuristico> destinos,
			ArrayList<Pais> paises) {

		try {
			System.out.print("Ingrese el codigo de un pais: ");
			int codigo = sc.nextInt();
			int indice = buscarPais(paises, codigo);
			Pais pais = new Pais(paises.get(indice).getNombre(), codigo);
			sc.nextLine();
			System.out.println("Ingrese el nombre del destino turistico: ");
			String nombre = sc.nextLine();
			int codigoDelDestino = generarCodigo();
			System.out.println("Codigo del destino: " + codigoDelDestino);
			System.out.println("Ingrese el precio del destino: ");
			double precio = sc.nextDouble();
			System.out.println("Ingrese la cantidad de dias: ");
			int dias = sc.nextInt();

			DestinoTuristico destino = new DestinoTuristico(codigoDelDestino, nombre, precio, pais, dias);
			destinos.add(destino);
			System.out.println("Registro del destino turistico a sido exitoso!");
		} catch (Exception e) {
			System.out.println("Codigo de pais inexistente!");
		}

	}

	public static int buscarPais(ArrayList<Pais> paises, int codigo) {
		for (Pais pais : paises) {
			if (codigo == pais.getCodigo())
				return paises.indexOf(pais);
		}
		return -1;
	}

	public static int generarCodigo() {
		Random rand = new Random();
		return rand.nextInt(9999) + 1;
	}

	// OPCION 2

	public static void mostrarDestinos(ArrayList<DestinoTuristico> destinos) {
		for (DestinoTuristico destino : destinos) {
			System.out.println(destino.mostrarDatos());
		}
		if (destinos.size() < 0)
			System.out.println("El listado de destinos esta Vacio");
	}

	// OPCION 3

	public static void modificarPais(Scanner sc, ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises) {

		try {
			System.out.println("Ingrese el codigo del desitno: ");
			int codigo = sc.nextInt();
			sc.nextLine();
			int indice = buscarDestino(destinos, codigo);
			DestinoTuristico destino = destinos.get(indice);
			Pais nuevoPais = new Pais();
			String nuevoNombre;
			boolean band = true;
			do {
				System.out.println("Ingrese el nuevo nombre del pais del destino " + destino.getNombre().toUpperCase());
				nuevoNombre = sc.nextLine();
				for (Pais pais : paises) {
					if (pais.getNombre().equals(nuevoNombre)) {
						nuevoPais = pais;
						band = false;
						break;
					}
				}
				if (band == true) {
					System.out.println("Ingrese un nombre de pais valido");
				}
			} while (band);

			destino.setPais(nuevoPais);

			destinos.set(indice, destino);
			System.out.println("Modificacion exitosa!");
		} catch (Exception e) {
			System.out.println("Ingreso de datos invalido!");
		}

	}

	public static int buscarDestino(ArrayList<DestinoTuristico> destinos, int codigo) {
		for (DestinoTuristico destino : destinos) {
			if (codigo == destino.getCodigo()) {
				return destinos.indexOf(destino);
			}
		}
		return -1;
	}

	// OPCION 4

	public static void limpiarLista(ArrayList<DestinoTuristico> destinos) {
		destinos.clear();
		System.out.println("Lista limpiada!");
	}

	// OPCION 5

	public static void eliminarDestino(Scanner sc, ArrayList<DestinoTuristico> destinos) {
		try {
			Iterator<DestinoTuristico> iterador = destinos.iterator();
			boolean band = destinos.size() >= 0;
			boolean band2 = false;
			System.out.println("Ingrese el codigo de un destino a eliminar: ");
			int codigo = sc.nextInt();

			while (iterador.hasNext()) {
				DestinoTuristico elemento = iterador.next();
				if (elemento.getCodigo() == codigo) {
					iterador.remove();
					band2 = true;
				}
			}
			if (!band) {
				System.out.println("El listado esta vacio!");
			}
			if (band2) {
				System.out.println("Elemento eliminado exitosamente!");
			}
		} catch (Exception e) {
			System.out.println("Ingreso de datos invalidos!");
		}
	}

	// OPCION 6

	public static void ordenarPorNombre(ArrayList<DestinoTuristico> destinos) {
		ArrayList<DestinoTuristico> arregloOrdenado = new ArrayList<>(destinos);
		boolean band = destinos.size() >= 0;
		Collections.sort(arregloOrdenado, new Comparator<DestinoTuristico>() {
			@Override
			public int compare(DestinoTuristico destino1, DestinoTuristico destino2) {
				return destino1.getNombre().compareTo(destino2.getNombre());
			}
		});
		if (!band) {
			System.out.println("El listado esta vacio!");
		} else {
			mostrarDestinos(arregloOrdenado);
		}
	}

	// OPCION 7
	public static void mostrarPaises(ArrayList<Pais> paises) {
		for (Pais pais : paises) {
			System.out.println(pais.mostrarDatos());
		}
	}

	// OPCION 8

	public static void mostrarDestinosPorCodigoPais(ArrayList<DestinoTuristico> destinos, Scanner sc,
			ArrayList<Pais> paises) {

		try {
			System.out.print("Ingrese el codigo de un pais: ");
			int codigo = sc.nextInt();
			int indice = buscarPais(paises, codigo);
			for (DestinoTuristico destino : destinos) {
				if (destino.getPais().getCodigo() == paises.get(indice).getCodigo()) {
					System.out.println(destino.mostrarDatos());
				}
			}
		} catch (Exception e) {
			System.out.println("Codigo de pais inexistente!");
		}

	}

}
