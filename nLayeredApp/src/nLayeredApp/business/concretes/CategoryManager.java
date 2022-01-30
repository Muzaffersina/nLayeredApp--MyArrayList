package nLayeredApp.business.concretes;

import nLayeredApp.business.abstracts.CategoryService;
import nLayeredApp.core.arrayLists.MyArrayList;
import nLayeredApp.dataAccess.abstracts.CategoryDao;
import nLayeredApp.entities.concretes.Category;

public class CategoryManager implements CategoryService{
	
	CategoryDao categoryDao;
	
	public  CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}
	@Override
	public void add(Category categorys) {
		//Business rules		
		
		this.categoryDao.add(categorys);
			
		
		
		//call logger
	}

	@Override
	public void update(Category categorys) {
		System.out.println("Guncellendi");
		this.categoryDao.update(categorys);
	}

	@Override
	public void delete(Category categorys) {
		System.out.println("Silindi");
		this.categoryDao.delete(categorys);
		
	}

	@Override
	public MyArrayList<Category> getArrayAll() {
		return this.categoryDao.getAllArray(null);
	}

}
