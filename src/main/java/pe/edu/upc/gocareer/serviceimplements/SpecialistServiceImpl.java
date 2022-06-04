package pe.edu.upc.gocareer.serviceimplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.gocareer.entities.Specialist;
import pe.edu.upc.gocareer.repositories.ISpecialistRepository;
import pe.edu.upc.gocareer.serviceinterface.ISpecialistService;

@Service
public class SpecialistServiceImpl implements ISpecialistService {

	@Autowired
	private ISpecialistRepository specialistRepository;

	@Override
	public void insert(Specialist specialist) {
		specialistRepository.save(specialist);
	}

	@Override
	public List<Specialist> list() {

		return specialistRepository.findAll();
	}

	@Override
	public void delete(int idSpecialist) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Specialist specialist) {
		// TODO Auto-generated method stub

	}

}
