package Repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Models.Producto2Model;

@Repository
public class Producto2Repository {

	private static List<Producto2Model> listaProducto2 = new ArrayList<Producto2Model>();
	
	static {
		listaProducto2.add(new Producto2Model("tablet1", 100));
		listaProducto2.add(new Producto2Model("tablet2", 175));
		listaProducto2.add(new Producto2Model("tablet3", 229));
	}
	
	public List<Producto2Model> listarProductos(){
		return listaProducto2;
	}
	
	public void insertarProducto(Producto2Model producto2) {
		listaProducto2.add(producto2);
	}
}
