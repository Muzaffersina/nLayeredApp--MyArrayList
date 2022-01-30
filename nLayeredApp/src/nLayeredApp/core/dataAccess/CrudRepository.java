package nLayeredApp.core.dataAccess;

import nLayeredApp.core.arrayLists.MyArrayList;
import nLayeredApp.core.entities.Entity;

//genericType
//Repository pattern
public interface CrudRepository<T extends Entity> {
	void add(T entity);
	void update(T entity);
	void delete(T entity);
	MyArrayList<T> getAllArray(T entity);

}
