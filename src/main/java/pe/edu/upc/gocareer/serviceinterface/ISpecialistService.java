package pe.edu.upc.gocareer.serviceinterface;

import java.util.List;

import pe.edu.upc.gocareer.entities.Specialist;

public interface ISpecialistService {
	public void insert(Specialist specialist);
	public List<Specialist> list();
	public void delete(int idSpecialist);
	public void update(Specialist specialist);
}
