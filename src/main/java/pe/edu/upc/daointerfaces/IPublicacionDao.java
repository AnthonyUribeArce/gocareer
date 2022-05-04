package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Publicacion;

public interface IPublicacionDao {
	public void insert(Publicacion pub);

	public List<Publicacion> list();

	public void delete(int idPubli);
}
