package edu.mum.cs.ce425.demowebapp.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.cs.ce425.demowebapp.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
