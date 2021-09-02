package com.company.workers.bo;

import java.util.Map;

import com.company.entities.Workers;

public interface WorkersBO {

	Map<Integer, Workers> createWorker();

	Workers printWorker(Map<Integer, Workers> list);

	Workers findWorker(Integer empid);

	Workers deleteWorker(Integer empid);

	Workers updateWorker(String Location,Integer empid);

}
