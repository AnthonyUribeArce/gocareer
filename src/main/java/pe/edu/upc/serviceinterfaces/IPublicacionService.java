package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Publicacion;

public interface IPublicacionService {
	public void insert(Publicacion pub);
	public List<Publicacion>list();
	public void delete(int idPubli);
}
