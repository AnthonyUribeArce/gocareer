package pe.edu.upc.gocareer.serviceInterface;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.gocareer.entity.Specialist;


public interface ISpecialistService {
	public void insert(Specialist specialist);
	public List<Specialist> list();
	public void delete(int idSpecialist);
	Optional<Specialist>listId(int idSpecialist);
	public void update(Specialist specialist);
}
