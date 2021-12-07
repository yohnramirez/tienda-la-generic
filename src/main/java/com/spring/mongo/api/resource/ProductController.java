package com.spring.mongo.api.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.api.model.Product;
import com.spring.mongo.api.repository.ProductRepository;

@RestController
@CrossOrigin("*")
public class ProductController {
	
	@Autowired
	private ProductRepository repository;
	
	@PostMapping("/product/add")
	public String saveProduct(@RequestBody Product product) {
		repository.save(product);
		return "Producto " + product.getId() + " agregado con éxito!";
	}
	
	@GetMapping("/product/findAllProducts")
	public List<Product> getProducts(){
		return repository.findAll();
	}
	
	@GetMapping("/product/findAllProducts/{id}")
	public Optional<Product> getProducts(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/product/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id) {
		repository.deleteById(id);
		return "Producto " + id + " eliminado con éxito!";
	}
}
