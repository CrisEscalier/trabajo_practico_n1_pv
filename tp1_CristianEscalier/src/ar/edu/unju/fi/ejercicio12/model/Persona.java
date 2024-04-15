package ar.edu.unju.fi.ejercicio12.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {

	private String nombre;
	private Calendar fechaNacimiento;

	public Persona() {
	}

	public Persona(String nombre, Calendar fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Meotodo que calcula la edad de la persona
	 * 
	 * @return la edad de la persona
	 */
	public int calcularEdad() {
		Calendar fechaActual = Calendar.getInstance();
		int edad = fechaActual.get(Calendar.YEAR) - getFechaNacimiento().get(Calendar.YEAR);
		if (fechaActual.get(Calendar.DAY_OF_YEAR) < getFechaNacimiento().get(Calendar.DAY_OF_YEAR)) {
			edad--;
		}
		return edad;
	}

	/**
	 * Determinar el signo del zodiaco de la persona segun su fecha de nacimiento
	 * 
	 * @return el signo del zodiaco
	 */
	public String determinarSignoZodiaco() {
		int mes = getFechaNacimiento().get(Calendar.MONTH) + 1; // Se suma 1 porque los meses en Calendar van de 0 a 11
		int dia = getFechaNacimiento().get(Calendar.DAY_OF_MONTH);

		if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
			return "Aries";
		} else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
			return "Tauro";
		} else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
			return "Géminis";
		} else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
			return "Cáncer";
		} else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
			return "Leo";
		} else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
			return "Virgo";
		} else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
			return "Libra";
		} else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
			return "Escorpio";
		} else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
			return "Sagitario";
		} else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
			return "Capricornio";
		} else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
			return "Acuario";
		} else {
			return "Piscis";
		}
	}

	/**
	 * Metodo para determinar la estacion de la fecha del nacimiento de la persona
	 * 
	 * @return la estacion del año
	 */
	public String determinarEstacion() {
		int mes = getFechaNacimiento().get(Calendar.MONTH) + 1;
		int dia = getFechaNacimiento().get(Calendar.DAY_OF_MONTH);
		String estacion = "";
		
		if((mes==9 && dia>20) || (mes==10 && dia>0) || (mes==11 && dia>0) || (mes==12 && dia<=20))
			estacion = "Primavera";
		if((mes==12 && dia>20) || (mes==1 && dia>0) || (mes==2 && dia>0) || (mes==3 && dia<=20))
			estacion = "Verano";
		if((mes==3 && dia>20) || (mes==4 && dia>0) || (mes==5 && dia>0) || (mes==6 && dia<=20))
			estacion = "Otoño";
		if((mes==6 && dia>20) || (mes==7 && dia>0) || (mes==8 && dia>0) || (mes==9 && dia<=20))
			estacion = "Invierno";
		return estacion;
	}

	/**
	 * Metodo para mostrar los datos de la persona
	 */
	public void mostrarDatos() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String fechaFormateada = dateFormat.format(getFechaNacimiento().getTime());

		System.out.println("Nombre: " + getNombre());
		System.out.println("Fecha de nacimiento: " + fechaFormateada);
		System.out.println("Edad: " + calcularEdad() + " años");
		System.out.println("Signo del zodiaco: " + determinarSignoZodiaco());
		System.out.println("Estación: " + determinarEstacion());
	}

}
