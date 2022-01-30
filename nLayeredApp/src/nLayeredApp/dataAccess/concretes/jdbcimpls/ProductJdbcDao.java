package nLayeredApp.dataAccess.concretes.jdbcimpls;

import nLayeredApp.core.arrayLists.MyArrayList;
import nLayeredApp.dataAccess.abstracts.ProductDao;

import nLayeredApp.entities.concretes.Product;

public class ProductJdbcDao implements ProductDao {
	MyArrayList<Product> productsList = new MyArrayList<Product>();
	@Override
	public void add(Product product) {
		//jdbc kodlari
		System.out.println("JDBC ile eklendi.");
		productsList.add(product);
	}

	@Override
	public void update(Product product) {
		int index = product.getId();
		productsList.set(index, product);
		System.out.println("JDBC ile guncellendi.");
		
	}

	@Override
	public void delete(Product product) {
		int index = product.getId();
		productsList.remove(index);
		System.out.println("JDBC ile silindi.");
		
	}
	@Override
	public MyArrayList<Product> getAllArray(Product entity) {
		return this.productsList;
	}

	
	
	
}
