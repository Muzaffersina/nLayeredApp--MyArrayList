package nLayeredApp.dataAccess.concretes.hibernateimpls;

import nLayeredApp.core.arrayLists.MyArrayList;
import nLayeredApp.dataAccess.abstracts.ProductDao;

import nLayeredApp.entities.concretes.Product;

public class ProductHibernateDao implements ProductDao {
	private int index = 0;
	MyArrayList<Product> productsList = new MyArrayList<Product>();
	@Override
	public void add(Product product) {
		
		productsList.add(product);
		System.out.println("Hibernate ile kaydedildi.");
	}

	@Override
	public void update(Product product) {
		int index = product.getId();
		productsList.set(index, product);
		System.out.println("Hibernate ile guncellendi.");
	}

	@Override
	public void delete(Product product) {			
		productsList.remove(index); 
		System.out.println("Hibernate ile silindi.");
	}
	@Override
	public MyArrayList<Product> getAllArray(Product entity) {
		return this.productsList;
	}
	
	
}
