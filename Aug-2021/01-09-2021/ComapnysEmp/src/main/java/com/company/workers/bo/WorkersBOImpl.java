package com.company.workers.bo;

import java.util.Map;

import com.company.dao.CrudDAO;
import com.company.dao.impl.WorkerDAOImpl;
import com.company.entities.Workers;

public class WorkersBOImpl implements WorkersBO {
	
	CrudDAO<Workers> crudDAO = new WorkerDAOImpl();

	public Map<Integer, Workers> createWorker() {
		return crudDAO.create();
	}

	public Workers printWorker(Map<Integer, Workers> list) {
		return crudDAO.print(list);
	}

	public Workers findWorker(Integer empid) {
		return crudDAO.find(empid);
	}

	public Workers deleteWorker(Integer empid) {
		return crudDAO.delete(empid);
	}

	public Workers updateWorker(String Location, Integer empid) {
		return crudDAO.update(Location,empid);
	}

}
