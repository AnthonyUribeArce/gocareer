package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Test;

public interface ITestDao {
	public void insert(Test tst);
	public List<Test> list();
}
