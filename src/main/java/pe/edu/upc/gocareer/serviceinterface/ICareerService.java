package pe.edu.upc.gocareer.serviceinterface;

import java.util.List;

import pe.edu.upc.gocareer.entities.Career;

public interface ICareerService {
	public void insert(Career career);
	public List<Career> list();
	public void delete(int idCareer);
	public void update(Career career);
}
