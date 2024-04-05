package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {

	private static final int ESPECIAL_20 = 500;
	private static final int ESPECIAL_30 = 750;
	private static final int ESPECIAL_40 = 1000;

	private int diametro;
	private int precio;
	private double area;
	private boolean ingredientesEspeciales;
	
	public Pizza() {
	}

	public Pizza(int diametro, boolean ingredientesEspeciales) {
		this.diametro = diametro;
		this.ingredientesEspeciales = ingredientesEspeciales;
		this.precio = calcularPrecio();
		this.area = calcularArea();
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}

	/**
	 * Metodo que calcula el precio de la pizza segun su diametro y segun si lleva
	 * ingredientes especiales
	 * 
	 * @return el precio final de la pizza
	 */
	public int calcularPrecio() {

		int precioFinal = 0;
		
		if (this.getDiametro() == 20)
			precioFinal = 4500;
		if (this.getDiametro() == 30)
			precioFinal = 4800;
		if (this.getDiametro() == 40)
			precioFinal = 5500;

		if (this.isIngredientesEspeciales()==true) {
			if (this.getDiametro() == 20)
				precioFinal += ESPECIAL_20;
			if (this.getDiametro() == 30)
				precioFinal += ESPECIAL_30;
			if (this.getDiametro() == 40)
				precioFinal += ESPECIAL_40;
		}

		return precioFinal;
	}

	/**
	 * Metodo que calcula el area de la pizza
	 * 
	 * @return el area de la pizza
	 */
	public double calcularArea() {
		return Math.PI * Math.pow((getDiametro() / 2.00d), 2.00d);
	}
	
	/**
	 * Metodo para mostrar los datos de la pizza
	 */
	public void mostrarDatos() {
		System.out.println("\nDiametro = " + this.getDiametro());
		System.out.println("Ingredientes especiales = " + this.isIngredientesEspeciales());
		System.out.println("Precio Pizza = " + this.getPrecio() + "$");
		System.out.println("Area de la pizza = " + this.getArea());
		
	}

}
