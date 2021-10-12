package com.optum.product;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
	
	
	 static Map<Integer, Product> productMap  = new HashMap<Integer, Product>();
	 
		static {
			productMap.put(123, new Product("Dell Laptop","Electronics", 123,500000) );
			productMap.put(2457, new Product("Mike Cap","Clothes",2457,500000)); 
			productMap.put(2451, new Product("Milk","Food",2451,500000)); 
			productMap.put(2453, new Product("Cake","Food",  2453,500000)); 
			productMap.put(2327, new Product("Eggs","Food", 2327,500000));
		}
		
		public static Map<Integer, Product> createProduct() {
			return productMap;
		}
		
		public static Map<Integer, Product> print() {
			System.out.println("Product List is: \n"+ productMap );
			return productMap;
		}

		public static Product find(Integer productId) {
			System.out.println("Product List Details is: \n"+productMap.get(productId));
			return productMap.get(productId);
		}

		public static Map<Integer, Product> delete(Integer productId) {
			Product returned_value = productMap.remove(productId);
			System.out.println("Removed Product: "+ returned_value);
		    System.out.println("New Product List is: \n"+ productMap);
			return productMap;
		}

		@RequestMapping(value = "/update/{productId}/{productprice}" ,method = RequestMethod.PUT)
		public static Map<Integer, Product> update(int productId,int price) {
			Product pro=productMap.get(productId);
			pro.setProductprice(price);
			productMap.put(productId, pro);
			System.out.println("New Product List is: \n"+ productMap);
			return productMap;
		}
		
}
