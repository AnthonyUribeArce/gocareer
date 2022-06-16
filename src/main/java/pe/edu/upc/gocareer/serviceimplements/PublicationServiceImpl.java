package pe.edu.upc.gocareer.serviceimplements;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.gocareer.entities.Publication;
import pe.edu.upc.gocareer.repositories.IPublicationRepository;
import pe.edu.upc.gocareer.serviceinterface.IPublicationService;

@Service
public class PublicationServiceImpl implements IPublicationService{

	@Autowired
	private IPublicationRepository pRepository;
	
	@Override
	public void insert(Publication publication) {
		// TODO Auto-generated method stub
		pRepository.save(publication);
	}

	@Override
	public List<Publication> list() {
		// TODO Auto-generated method stub
		return pRepository.findAll();
	}

	@Override
	public void delete(int idPublication) {
		// TODO Auto-generated method stub
		pRepository.deleteById(idPublication);
	}

	@Override
	public Optional<Publication> listId(int idPublication) {
		// TODO Auto-generated method stub
		return pRepository.findById(idPublication);
	}

	@Override
	public void update(Publication publication) {
		// TODO Auto-generated method stub
		pRepository.save(publication);
	}

}
