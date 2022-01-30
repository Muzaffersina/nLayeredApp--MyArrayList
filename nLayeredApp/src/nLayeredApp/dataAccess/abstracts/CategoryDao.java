package nLayeredApp.dataAccess.abstracts;

import nLayeredApp.core.dataAccess.CrudRepository;
import nLayeredApp.entities.concretes.Category;

// bir interface bir interface � extend edebilir.
public interface CategoryDao extends CrudRepository<Category>{
	
}
