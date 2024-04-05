package ar.edu.unju.fi.ejercicio9.model;

public class Producto {

	private String nombre;
	private int codigo;
	private double precio;
	private int descuento;
	
	public Producto() {
	}

	public Producto(String nombre, int codigo, double precio, int descuento) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.descuento = descuento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	/**
	 * Metodo que calcula el descuento del producto
	 * 
	 * @return el precio con el descuento aplicado
	 */
	public double calcularDescuento() {
		return this.getPrecio() - this.getPrecio() * this.getDescuento() / 100.00d;
	}

	/**
	 * Metodo que muestra los datos del producto
	 */
	public void mostrarDatos() {
		System.out.println("\nProducto: " + this.getNombre());
		System.out.println("Codigo: " + this.getCodigo());
		System.out.println("Precio: $ " + calcularDescuento());
	}

}
