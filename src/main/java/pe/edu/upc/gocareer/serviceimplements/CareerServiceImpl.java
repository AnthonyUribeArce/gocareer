package pe.edu.upc.gocareer.serviceimplements;

import java.util.List;

import org.springframework.stereotype.Service;

import pe.edu.upc.gocareer.entities.Career;
import pe.edu.upc.gocareer.repositories.ICareerRepository;
import pe.edu.upc.gocareer.serviceinterface.ICareerService;

@Service
public class CareerServiceImpl implements ICareerService {

	private ICareerRepository careerRepository;

	@Override
	public void insert(Career career) {
		careerRepository.save(career);

	}

	@Override
	public List<Career> list() {

		return careerRepository.findAll();
	}

	@Override
	public void delete(int idCareer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Career career) {
		// TODO Auto-generated method stub

	}

}
