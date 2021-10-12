package com.udemy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;
import com.udemy.entities.Student;
import com.udemy.repos.StudentRepository;

@SpringBootTest
class H2ApplicationTests {
	
	@Autowired
	private StudentRepository rep;

	@Test
	void testStudent() {
		
		Student student = new Student();
		student.setId(1l);
		student.setName("Lara");
		student.setTest(100);
		rep.save(student);
		
		
		Student pr=rep.findById(1l).get();
		System.out.println(pr);
		assertNotNull(pr);
	}

}
