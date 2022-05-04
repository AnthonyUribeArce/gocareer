package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IAlumnoDao;
import pe.edu.upc.entities.Alumno;
import pe.edu.upc.serviceinterfaces.IAlumnoService;

@Named
public class AlumnoServiceImpl implements IAlumnoService {
	@Inject
	private IAlumnoDao aDao;

	@Override
	public void insert(Alumno a) {
		aDao.insert(a);
	}

	@Override
	public List<Alumno> list() {

		return aDao.list();
	}

	@Override
	public void delete(int idAlumno) {
		aDao.delete(idAlumno);
	}

	@Override
	public void update(Alumno a) {
		aDao.update(a);
		
	}

}
