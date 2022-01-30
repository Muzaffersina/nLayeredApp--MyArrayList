package nLayeredApp;

import java.util.ArrayList;
import java.util.Locale.Category;


import nLayeredApp.business.abstracts.ProductService;
import nLayeredApp.business.concretes.ProductManager;
import nLayeredApp.core.arrayLists.MyArrayList;
import nLayeredApp.dataAccess.concretes.hibernateimpls.ProductHibernateDao;
import nLayeredApp.dataAccess.concretes.jdbcimpls.ProductJdbcDao;
import nLayeredApp.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		ProductService productService = new ProductManager(new ProductHibernateDao());
		Product product1 = new Product(1,"çilek",3);
		Product product2 = new Product(2,"muz",4);
		Product product3 = new Product(3,"armut",5);
		productService.add(product1);
		productService.add(product2);
		productService.add(product3);			
		// VERIYE YAZMA KISMI DUZELTILECEK.
		
		
		
		
		
		/*
		MyArrayList<String> list1 = new MyArrayList<String>();
		list1.add("istanbul");
		list1.add("ankara");
		list1.add("istanbul");	
		

		
		MyArrayList<Integer> list2 = new MyArrayList<Integer>();
		list2.add(34);
		list2.add(06);
		list2.add(35);
		list2.add(25);
		
		list1.get(1);
		list1.set(1, "Çanakkale");
		list1.get(1);
		
		
		
		System.out.println("List2 size: " +list2.size());
		list2.getArrayAll();
		System.out.println("--------------silim işlemi");
		list2.remove(1); 
		list2.getArrayAll();
		System.out.println("List2 size: "+ list2.size());
		*/
		
				
		
		
		
		
	}

}

//8.35-9.05
//RentACar uygulamasını bu şekilde yapacagız. Pair8
