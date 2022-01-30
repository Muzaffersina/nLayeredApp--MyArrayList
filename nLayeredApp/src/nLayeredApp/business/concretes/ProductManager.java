package nLayeredApp.business.concretes;

import nLayeredApp.business.abstracts.ProductService;
import nLayeredApp.core.arrayLists.MyArrayList;
import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		
		//Business rules
		
		if(product.getUnitPrice()>0) {
			this.productDao.add(product);
			
		}
		
		//call logger
	}

	@Override
	public void update(Product product) {
		System.out.println("Guncellendi");
		this.productDao.update(product);
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("Silindi");
		this.productDao.delete(product);
	}

	@Override
	public MyArrayList<Product> getArrayAll() {
		return this.productDao.getAllArray(null);
	}

	

}