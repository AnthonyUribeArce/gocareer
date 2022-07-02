package pe.edu.upc.gocareer.serviceinterface;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.gocareer.entities.Publication;

public interface IPublicationService {
	public void insert(Publication publication);
	public List<Publication> list();
	public void delete(int idPublication);
	Optional<Publication>listId(int idPublication);
	public void update(Publication publication);
}
