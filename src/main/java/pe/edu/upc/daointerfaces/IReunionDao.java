package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Reunion;

public interface IReunionDao {
	public void insert(Reunion reu);

	public List<Reunion> list();
	
	public void delete(int idReunion);
	public void update(Reunion reu);
}