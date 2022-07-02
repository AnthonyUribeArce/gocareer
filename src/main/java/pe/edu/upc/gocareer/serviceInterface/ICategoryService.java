package pe.edu.upc.gocareer.serviceInterface;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.gocareer.entity.Category;


public interface ICategoryService {
	public Integer insert(Category categoria);

	public void delete(long idCategoria);

	List<Category> list();

	Optional<Category> listarId(long idCategory);

	List<Category> findByName(String name);

	List<Category> findByNameLikeIgnoreCase(String name);

}
