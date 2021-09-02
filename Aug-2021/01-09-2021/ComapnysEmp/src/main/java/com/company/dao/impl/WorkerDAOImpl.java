package com.company.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.company.entities.Workers;
import com.company.dao.CrudDAO;

public class WorkerDAOImpl implements CrudDAO<Workers> {
	
	 Map<Integer, Workers> workerMap  = new HashMap<Integer, Workers>();
	

	public Map<Integer, Workers> create() {
		
		workerMap.put(4123, new Workers("John","K.","USA", 4123) );
		workerMap.put(2457, new Workers("Zara","E.","USA", 2457)); 
		workerMap.put(2451, new Workers("Mahnaz","L.","USA",2451)); 
		workerMap.put(2453, new Workers("Ayan","S.","USA",  2453)); 
		workerMap.put(2327, new Workers("Daisy","M.","USA", 2327));
		 
		return workerMap;
	}

	

	public Workers find(Integer empID) {
		System.out.println("T Details is: \n"+workerMap.get(empID));
		return null;
	}

	public Workers delete(Integer empID) {
		Workers returned_value = workerMap.remove(empID);
		System.out.println("Removed Workers: "+ returned_value);
	    System.out.println("New Workers List is: \n"+ workerMap);
		return null;
	}

	public Workers update(String emplToUpdate, Integer empid) {
		Workers emp=workerMap.get(empid);
		emp.setLocation("Hyd");
		workerMap.put(empid, emp);
		return emp;
	}



	public Workers print(Map<Integer, Workers>  list) {
		System.out.println("Workers List is: \n"+ list );
		return null;
	}
	
	
	}