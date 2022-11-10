package Repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Models.Producto1Model;

@Repository
public class Producto1Repository {

	private static List<Producto1Model> listaProducto1 = new ArrayList<Producto1Model>();
	
	static {
		listaProducto1.add(new Producto1Model("ordenador1", 200));
		listaProducto1.add(new Producto1Model("ordenador2", 350));
		listaProducto1.add(new Producto1Model("ordenador3", 652));
	}
	
	public List<Producto1Model> listarProductos(){
		return listaProducto1;
	}
	
	public void insertarProducto(Producto1Model producto1) {
		listaProducto1.add(producto1);
	}
	
}
