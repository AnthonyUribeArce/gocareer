package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Especialista;

public interface IEspecialistaDao {
	public void insert(Especialista es);
	public List<Especialista>list();
	
	public void delete(int idEspecialista);
	public void update(Especialista es);
}
