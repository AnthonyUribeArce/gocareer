package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Carrera;

public interface ICarreraService {
	public void insert(Carrera a);
	public List<Carrera>list();
	public void delete(int idCarrera);
	public void update(Carrera a);
}
