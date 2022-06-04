package pe.edu.upc.gocareer.serviceinterface;

import java.util.List;

import pe.edu.upc.gocareer.entities.Publication;

public interface IPublicationService {
	public void insert(Publication publication);
	public List<Publication> list();
	public void delete(int idPublication);
	public void update(Publication publication);
}
