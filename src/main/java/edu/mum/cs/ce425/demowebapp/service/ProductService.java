package edu.mum.cs.ce425.demowebapp.service;

import java.util.List;


import org.springframework.stereotype.Service;

 
import edu.mum.cs.ce425.demowebapp.model.Product;

@Service
public interface ProductService {
	
	public List<Product> getProducts();
	public Product addProduct(Product product);

}
