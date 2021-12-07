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

import com.spring.mongo.api.model.Branch;
import com.spring.mongo.api.repository.BranchRepository;

@RestController
@CrossOrigin("*")
public class BranchController {
	
	@Autowired
	private BranchRepository repository;
	
	@PostMapping("/branch/add")
	public String saveBranch(@RequestBody Branch branch) {
		repository.save(branch);
		return "Consolidado/Sucursal " + branch.getId() + " agregado con éxito!";
	}
	
	@GetMapping("/branch/findAllBranchs")
	public List<Branch> getBranchs(){
		return repository.findAll();
	}
	
	@GetMapping("/branch/findAllBranchs/{id}")
	public Optional<Branch> getBranchs(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/branch/deleteBranch/{id}")
	public String deleteClient(@PathVariable int id) {
		repository.deleteById(id);
		return "Consolidado/Sucursal " + id + " eliminado con éxito!";
	}

}
