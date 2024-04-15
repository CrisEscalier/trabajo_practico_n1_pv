package ar.edu.unju.fi.ejercicio18.model;

public class Pais {
	
	private String nombre;
	private int codigo;
	
	public Pais() {
		
	}
	
	public Pais(String nombre, int codigo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
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
	
	public String mostrarDatos() {
		return "Pais: " + getNombre() + "\nCodigo Pais: " + getCodigo();
	}
	

}
