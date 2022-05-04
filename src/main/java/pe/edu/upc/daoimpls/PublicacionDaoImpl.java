package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IPublicacionDao;
import pe.edu.upc.entities.Publicacion;

public class PublicacionDaoImpl implements IPublicacionDao {
	@PersistenceContext(unitName = "gocareer")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Publicacion pub) {
		try {
			em.persist(pub);
		} catch (Exception e) {
			System.out.println("Error al insertar publicacion en el dao");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Publicacion> list() {
		List<Publicacion> listaPublicacion = new ArrayList<Publicacion>();
		try {
			Query jpql = em.createQuery("from Publicacion pub");
			listaPublicacion = (List<Publicacion>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar publicacion en el dao");
		}
		return listaPublicacion;
	}

	@Transactional
	@Override
	public void delete(int idPubli) {
		try {
			Publicacion pub = em.find(Publicacion.class, idPubli);
			em.remove(pub);
		} catch (Exception e) {
			System.out.println("Error al eliminar publicacion en el dao");
		}
	}
	@Transactional
	@Override
	public void update(Publicacion pub) {
		try {
			em.merge(pub);
		} catch (Exception e) {
			System.out.println("Error al modificar publicacion en el dao");
		}
		
	}

}
