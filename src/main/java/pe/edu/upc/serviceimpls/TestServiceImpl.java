package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ITestDao;
import pe.edu.upc.entities.Test;
import pe.edu.upc.serviceinterfaces.ITestService;

@Named
public class TestServiceImpl implements ITestService{

	@Inject
	private ITestDao tstDao;
	@Override
	public void insert(Test tst) {
		tstDao.insert(tst);
	}

	@Override
	public List<Test> list() {
		return tstDao.list();
	}

}
