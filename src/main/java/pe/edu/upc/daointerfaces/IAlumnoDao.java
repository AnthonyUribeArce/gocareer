package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Alumno;

public interface IAlumnoDao {
	public void insert(Alumno a);
	public List<Alumno>list();
	
	public void delete(int idAlumno);
	public void update(Alumno a);
}
