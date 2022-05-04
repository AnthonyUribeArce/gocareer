package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ICarreraDao;
import pe.edu.upc.entities.Carrera;
import pe.edu.upc.serviceinterfaces.ICarreraService;

@Named
public class CarreraServiceImpl implements ICarreraService{
	
	@Inject
	private ICarreraDao cDao;

	@Override
	public void insert(Carrera a) {
		cDao.insert(a);
		
	}

	@Override
	public List<Carrera> list() {
		
		return cDao.list();
	}

	@Override
	public void delete(int idCarrera) {
		cDao.delete(idCarrera);
		
	}

	@Override
	public void update(Carrera a) {
		cDao.update(a);
		
	}
}
