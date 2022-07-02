package pe.edu.upc.gocareer.serviceimplements;

import java.util.List;
import java.util.Optional;

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
		specialistRepository.deleteById(idSpecialist);
	}

	@Override
	public void update(Specialist specialist) {
		specialistRepository.save(specialist);
	}

	@Override
	public Optional<Specialist> listId(int idSpecialist) {
		// TODO Auto-generated method stub
		return specialistRepository.findById(idSpecialist);
	}

	@Override
	public List<String[]> reporte2() {
		return specialistRepository.reporte2();
	}
	
	@Override
	public List<String[]> reporte3() {
		return specialistRepository.reporte3();
	}
}
