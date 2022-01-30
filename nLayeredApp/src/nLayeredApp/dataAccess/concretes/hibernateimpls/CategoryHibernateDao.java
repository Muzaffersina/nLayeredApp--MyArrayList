package nLayeredApp.dataAccess.concretes.hibernateimpls;

import nLayeredApp.core.arrayLists.MyArrayList;
import nLayeredApp.dataAccess.abstracts.CategoryDao;
import nLayeredApp.entities.concretes.Category;

public class CategoryHibernateDao implements CategoryDao{

	MyArrayList<Category> categorysList = new MyArrayList<Category>();
	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile eklendi");
		categorysList.add(category);
	}

	@Override
	public void update(Category category) {
		System.out.println("Hibernate ile guncellendi");
		int index = category.getId();
		categorysList.set(index, category);
	}

	@Override
	public void delete(Category category) {
		System.out.println("Hibernate ile silindi");
		int index = category.getId() - 1;
		categorysList.remove(index); 
	}

	@Override
	public MyArrayList<Category> getAllArray(Category entity) {
		return this.categorysList;
	}
	
	

}
