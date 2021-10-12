package com.optum.product;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

	@RequestMapping(value = "/list")
	   public Map<Integer, Product> createProduct() {
	      return ProductController.createProduct();
	   }
	
	@RequestMapping(value = "/print")
	   public Map<Integer, Product> print() {
	      return ProductController.print();
	   }
	
	@RequestMapping(value = "/find" , params = {"productId"})
	   public Product find(@RequestParam("productId") Integer productId) {
	      return ProductController.find(productId);
	   }
	
	@RequestMapping(value = "/delete/{productId}")
	public Map<Integer, Product> delete(@PathVariable Integer productId) {
	      return ProductController.delete(productId);
	   }
	
	
	@RequestMapping(value = "/update/{productId}/{productprice}" ,method = RequestMethod.PUT)
	public Map<Integer, Product> update(@PathVariable Integer productId,Integer productprice ) {
	      return ProductController.update(productId,productprice);
	   }
}
