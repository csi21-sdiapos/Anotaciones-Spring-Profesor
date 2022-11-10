package Repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Models.Producto1Model;
import Models.Producto2Model;

@Service("GestionAlmacenFactory")
public class GestionAlmacenFactory {

	@Autowired
	Producto1Repository repositorioProducto1;

	@Autowired
	Producto2Repository repositorioProducto2;
	
	
	public void insertarProducto1(Producto1Model producto1) {
		repositorioProducto1.insertarProducto(producto1);
	}
	
	public void insertarProducto2(Producto2Model producto2) {
		repositorioProducto2.insertarProducto(producto2);
	}
	
	public List<Producto1Model> listarProductos1(){
		return repositorioProducto1.listarProductos();
	}
	
	public List<Producto2Model> listarProductos2(){
		return repositorioProducto2.listarProductos();
	}
}
