package nLayeredApp.business.abstracts;

import nLayeredApp.core.arrayLists.MyArrayList;
import nLayeredApp.entities.concretes.Category;


public interface CategoryService {
	void add(Category categorys);
	void update(Category categorys );
	void delete(Category categorys);
	MyArrayList<Category> getArrayAll();


}
