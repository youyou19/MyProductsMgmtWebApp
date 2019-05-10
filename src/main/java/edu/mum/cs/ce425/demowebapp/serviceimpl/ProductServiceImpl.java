package edu.mum.cs.ce425.demowebapp.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.ce425.demowebapp.model.Product;
import edu.mum.cs.ce425.demowebapp.repository.ProductRepository;
import edu.mum.cs.ce425.demowebapp.service.ProductService;


@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired 
	ProductRepository productRepository;

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return (List<Product>)productRepository.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

}
