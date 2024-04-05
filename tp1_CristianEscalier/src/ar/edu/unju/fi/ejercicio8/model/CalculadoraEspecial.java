package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	
	private int n;
	
	public CalculadoraEspecial() {
	}

	public int getNumero() {
		return n;
	}

	public void setNumero(int n) {
		this.n = n;
	}
	
	/**
	 * Metodo de que calcula la sumartoria del numero
	 * ingresasdo por el usuario
	 * @return El resutlado de la sumatoria
	 */
	public double calcularSumatoria() {
		int i;
		double resultado=0;
		
		for(i=1;i<=this.getNumero();i++) {
			resultado += Math.pow((i*(i+1))/2.00d, 2.00d);
		}
		return resultado;
	}
	
	/**
	 * Metodo que calcula la productoria del numero
	 * ingresado por el usuario
	 * @return El resultado de la productoria
	 */
	public double calcularProductoria() {
		int i;
		double resultado=1;
		
		for(i=1;i<=this.getNumero();i++) {
			resultado *= i*(i+4);
		}
		
		return resultado;
	}

}
