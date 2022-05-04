package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Pregunta;

public interface IPreguntaDao {
	public void insert(Pregunta pre);

	public List<Pregunta> list();
	
	public void delete(int idPregunta);
	public void update(Pregunta pre);
}
