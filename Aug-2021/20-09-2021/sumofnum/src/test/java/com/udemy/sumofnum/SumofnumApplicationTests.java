package com.udemy.sumofnum;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
class SumofnumApplicationTests {
	
	@Autowired
	SumController sum;

	@Test
	void testSum() {
		
		assertNotNull(sum.Sum());
	}

}
