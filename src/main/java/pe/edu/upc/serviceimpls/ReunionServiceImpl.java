package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IReunionDao;
import pe.edu.upc.entities.Reunion;
import pe.edu.upc.serviceinterfaces.IReunionService;

@Named
public class ReunionServiceImpl implements IReunionService{

	@Inject
	private IReunionDao reDao;
	
	
	@Override
	public void insert(Reunion reu) {
		reDao.insert(reu);
	}

	@Override
	public List<Reunion> list() {
		return reDao.list();
	}

	@Override
	public void delete(int idReunion) {
		reDao.delete(idReunion);
	}

}