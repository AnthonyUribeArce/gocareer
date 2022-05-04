package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IEspecialistaDao;
import pe.edu.upc.entities.Especialista;

public class EspecialistaDaoImpl implements IEspecialistaDao {
	@PersistenceContext(unitName = "gocareer")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Especialista es) {
		try {
			em.persist(es);
		} catch (Exception e) {
			System.out.println("Error al insertar en especialista dao");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Especialista> list() {
		List<Especialista> listaEspecialista = new ArrayList<Especialista>();
		try {
			Query jpql3 = em.createQuery("from Especialista es");
			listaEspecialista = (List<Especialista>) jpql3.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar especialista en el dao");
		}
		return listaEspecialista;
	}

	@Transactional
	@Override
	public void delete(int idEspecialista) {
		try {
			Especialista es = em.find(Especialista.class, idEspecialista);
			em.remove(es);
		} catch (Exception e) {
			System.out.println("Error al eliminar especialista en el dao");
		}
	}

}
