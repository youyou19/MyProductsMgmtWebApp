package edu.mum.cs.ce425.demowebapp.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import edu.mum.cs.ce425.demowebapp.model.Product;
import edu.mum.cs.ce425.demowebapp.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping(value = {"/","/products"})
	public String displayProducts(Model model) {
		model.addAttribute("products",productService.getProducts());
		return "home/list-product";
		}
   
	@GetMapping("/product")
	
	public String productPage(Model model,Product product) {
		model.addAttribute("Product",product);
		return "product/page-product";
	}
	@PostMapping("/product")
	public String save (@ModelAttribute("product") Product product, BindingResult bindingResult,Model model) {
		if(bindingResult.hasErrors()) {
			return "product/page-product"; 
		}
		model.addAttribute("product", productService.addProduct(product));
		return "redirect:/products";
	}
}
