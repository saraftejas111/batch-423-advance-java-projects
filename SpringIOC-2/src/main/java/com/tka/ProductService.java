package com.tka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	protected ProductRepository productRepository;
	
	public String getProduct() {
		return productRepository.getProduct();
	}
	

}
