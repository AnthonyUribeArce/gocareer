package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IPublicacionDao;
import pe.edu.upc.entities.Publicacion;
import pe.edu.upc.serviceinterfaces.IPublicacionService;
@Named
public class PublicacionServiceImpl implements IPublicacionService{

	@Inject
	private IPublicacionDao pubDao;
	@Override
	public void insert(Publicacion pub) {
		pubDao.insert(pub);
	}

	@Override
	public List<Publicacion> list() {
		return pubDao.list();
	}

	@Override
	public void delete(int idPubli) {
		pubDao.delete(idPubli);
	}

	@Override
	public void update(Publicacion pub) {
		pubDao.update(pub);
		
	}

}
