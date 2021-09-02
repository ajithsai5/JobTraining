package com.company.workers;

import java.util.Map;

import com.company.entities.Workers;
import com.company.workers.bo.WorkersBO;
import com.company.workers.bo.WorkersBOImpl;

public class WorkersMain {

	public static void main(String[] args) {
		WorkersBO WorkerBO  = new  WorkersBOImpl();
    	Map<Integer, Workers> list = WorkerBO.createWorker();
    	WorkerBO.printWorker(list);
    	WorkerBO.findWorker(001732451);
    	WorkerBO.deleteWorker(001732451);
    	WorkerBO.updateWorker("Hyd",001732451);

	}

}
