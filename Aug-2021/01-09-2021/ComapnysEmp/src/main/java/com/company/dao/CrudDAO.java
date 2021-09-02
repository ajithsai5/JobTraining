package com.company.dao;

import java.util.Map;

public interface CrudDAO<T> {// What is interface? and Polymophism in Java?
	Map<Integer, T> create();

	T print(Map<Integer, T> list);

	T find(Integer empid);

	T delete(Integer empid);

	T update(String Location, Integer empid);
}
