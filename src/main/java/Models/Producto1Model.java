package Models;

public class Producto1Model {

	// ATRIBUTOS
	private String nombre;
	private int precio;
	
	
	// CONSTRUCTORES
	public Producto1Model(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto1Model() {
		super();
	}


	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	// ToString
	@Override
	public String toString() {
		return "Producto1Model [nombre=" + nombre + ", precio=" + precio + "]\n";
	}
	
}
