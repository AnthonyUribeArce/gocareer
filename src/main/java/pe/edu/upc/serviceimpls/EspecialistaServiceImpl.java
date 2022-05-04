package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IEspecialistaDao;
import pe.edu.upc.entities.Especialista;
import pe.edu.upc.serviceinterfaces.IEspecialistaService;

@Named
public class EspecialistaServiceImpl implements IEspecialistaService {
	@Inject
	private IEspecialistaDao eDao;

	@Override
	public void insert(Especialista es) {
		eDao.insert(es);
	}

	@Override
	public List<Especialista> list() {
		return eDao.list();
	}

	@Override
	public void delete(int idEspecialista) {
		eDao.delete(idEspecialista);
	}

}
