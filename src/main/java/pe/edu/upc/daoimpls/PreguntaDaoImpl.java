package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IPreguntaDao;
import pe.edu.upc.entities.Pregunta;

public class PreguntaDaoImpl implements IPreguntaDao {
	@PersistenceContext(unitName = "gocareer")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Pregunta pre) {
		try {
			em.persist(pre);
		} catch (Exception e) {
			System.out.println("Error al insertat pregunta en el dao");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pregunta> list() {
		List<Pregunta> listaPregunta = new ArrayList<Pregunta>();
		try {
			Query jpql = em.createQuery("from Pregunta pre");
			listaPregunta = (List<Pregunta>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar pregunta en el dao");
		}
		return listaPregunta;
	}

	@Transactional
	@Override
	public void delete(int idPregunta) {
		try {
			Pregunta pre = em.find(Pregunta.class, idPregunta);
			em.remove(pre);
		} catch (Exception e) {
			System.out.println("Error al eliminar pregunta en el dao");
		}
	}

}
