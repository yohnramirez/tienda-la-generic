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

import com.spring.mongo.api.model.Sale;
import com.spring.mongo.api.repository.SalesRepository;

@RestController
@CrossOrigin("*")
public class SalesController {
	
	@Autowired
	private SalesRepository repository;
	
	@PostMapping("/sales/add")
	public String saveSales(@RequestBody Sale sale) {
		repository.save(sale);
		return "Venta " + sale.getId() + " agregada con éxito!";
	}
	
	@GetMapping("/sales/findAllSales")
	public List<Sale> getSales(){
		return repository.findAll();
	}
	
	@GetMapping("/sales/findAllSales/{id}")
	public Optional<Sale> getSales(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/sales/deleteSale/{id}")
	public String deleteSale(@PathVariable int id) {
		repository.deleteById(id);
		return "Venta " + id + " eliminada con éxito!";
	}
}
