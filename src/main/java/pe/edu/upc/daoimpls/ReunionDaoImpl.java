package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IReunionDao;
import pe.edu.upc.entities.Reunion;

public class ReunionDaoImpl implements IReunionDao{
	@PersistenceContext(unitName = "gocareer")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Reunion reu) {
		try {
			em.persist(reu);
		} catch (Exception e) {
			System.out.println("Error al insertar reunion en el dao");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reunion> list() {
		List<Reunion> listaReunion=new ArrayList<Reunion>();
		try {
			Query jpql = em.createQuery("from Reunion reu");
			listaReunion=(List<Reunion>)jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar reunion en el dao");
		}
		return listaReunion;
	}

	@Transactional
	@Override
	public void delete(int idReunion) {
		try {
			Reunion r = em.find(Reunion.class, idReunion);
			em.remove(r);
		} catch (Exception e) {
			System.out.println("Error al eliminar reunion en el dao");
		}
	}
	@Transactional
	@Override
	public void update(Reunion reu) {
		try {
			em.merge(reu);
		} catch (Exception e) {
			System.out.println("Error al modificar reunion en el dao");
		}
	}

}