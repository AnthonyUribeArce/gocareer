package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ITestDao;
import pe.edu.upc.entities.Test;

public class TestDaoImpl implements ITestDao{

	@PersistenceContext(unitName = "gocareer")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Test tst) {
		try {
			em.persist(tst);
		} catch (Exception e) {
			System.out.println("Error al insertar test en el dao");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Test> list() {
		List<Test> listaTest=new ArrayList<Test>();
		try {
			Query jpql = em.createQuery("from Test tst");
			listaTest=(List<Test>)jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar test en el dao");
		}
		return listaTest;
	}

}
