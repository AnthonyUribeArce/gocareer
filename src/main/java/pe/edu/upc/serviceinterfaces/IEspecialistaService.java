package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Especialista;

public interface IEspecialistaService {
	public void insert(Especialista es);
	public List<Especialista>list();
	public void delete(int idEspecialista);
	public void update(Especialista es);
}
