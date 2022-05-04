package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IPreguntaDao;
import pe.edu.upc.entities.Pregunta;
import pe.edu.upc.serviceinterfaces.IPreguntaService;

@Named
public class PreguntaServiceImpl implements IPreguntaService{

	@Inject
	private IPreguntaDao preDao;
	@Override
	public void insert(Pregunta pre) {
		preDao.insert(pre);
	}

	@Override
	public List<Pregunta> list() {
		
		return preDao.list();
	}

	@Override
	public void delete(int idPregunta) {
		preDao.delete(idPregunta);
	}

	@Override
	public void update(Pregunta pre) {
		preDao.update(pre);
		
	}

}
