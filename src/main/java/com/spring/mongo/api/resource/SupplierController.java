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

import com.spring.mongo.api.model.Supplier;
import com.spring.mongo.api.repository.SupplierRepository;

@RestController
@CrossOrigin("*")
public class SupplierController {
	
	@Autowired
	private SupplierRepository repository;
	
	@PostMapping("/supplier/add")
	public String saveSupplier(@RequestBody Supplier supplier) {
		repository.save(supplier);
		return "Proveedor " + supplier.getId() + " agregado con éxito!";
	}
	
	@GetMapping("/supplier/findAllSuppliers")
	public List<Supplier> getSuppliers(){
		return repository.findAll();
	}
	
	@GetMapping("/supplier/findAllSuppliers/{id}")
	public Optional<Supplier> getSuppliers(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/supplier/deleteSupplier/{id}")
	public String deleteSupplier(@PathVariable int id) {
		repository.deleteById(id);
		return "Proveedor " + id + " eliminado con éxito!";
	}
}
