package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Pregunta;

public interface IPreguntaService {
	public void insert(Pregunta pre);
	public List<Pregunta>list();
	public void delete(int idPregunta);
}
