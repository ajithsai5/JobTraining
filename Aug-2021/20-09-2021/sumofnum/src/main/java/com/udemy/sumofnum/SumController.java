package com.udemy.sumofnum;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

	@RequestMapping("/Hello")
	public String Sum() {
		
		int num1 = 5, num2 = 15; 
				int sum;
	      sum = num1 + num2;
	return "Sum of the Number"+sum;
}
}