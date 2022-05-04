package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IAlumnoDao;
import pe.edu.upc.entities.Alumno;

public class AlumnoDaoImpl implements IAlumnoDao {
	@PersistenceContext(unitName = "gocareer")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Alumno a) {

		try {
			em.persist(a);
		} catch (Exception e) {
			System.out.println("Error al insertar en alumno dao");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Alumno> list() {
		List<Alumno> listaAlumno = new ArrayList<Alumno>();
		try {
			Query jpql1 = em.createQuery("from Alumno a");
			listaAlumno = (List<Alumno>) jpql1.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar alumno en el dao");
		}
		return listaAlumno;
	}

	@Transactional
	@Override
	public void delete(int idAlumno) {
		try {
			Alumno a = em.find(Alumno.class, idAlumno);
			em.remove(a);
		} catch (Exception e) {
			System.out.println("Error al eliminar alumno en el dao");
		}
	}
	@Transactional
	@Override
	public void update(Alumno a) {
		try {
			em.merge(a);
		} catch (Exception e) {
			System.out.println("Error al modificar alumno en el dao");
		}
		
	}
}
