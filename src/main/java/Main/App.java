package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Repositories.GestionAlmacenFactory;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		
		// Inversión de Control (IoC)
		GestionAlmacenFactory gestionAlmacenFactory = (GestionAlmacenFactory) applicationContext.getBean("GestionAlmacenFactory");
		
		System.out.println(gestionAlmacenFactory.listarProductos1());
		System.out.println("\n");
		System.out.println(gestionAlmacenFactory.listarProductos2());
	}

}
