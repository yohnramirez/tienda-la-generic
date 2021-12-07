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

import com.spring.mongo.api.model.Client;
import com.spring.mongo.api.repository.ClientRepository;

@RestController
@CrossOrigin("*")
public class ClientController {
	
	@Autowired
	private ClientRepository repository;
	
	@PostMapping("/client/add")
	public String saveClient(@RequestBody Client client) {
		repository.save(client);
		return "Cliente " + client.getId() + " agregado con éxito!";
	}
	
	@GetMapping("/client/findAllClients")
	public List<Client> getClients(){
		return repository.findAll();
	}
	
	@GetMapping("/client/findAllClients/{id}")
	public Optional<Client> getClients(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/client/deleteClient/{id}")
	public String deleteClient(@PathVariable int id) {
		repository.deleteById(id);
		return "Cliente " + id + " eliminado con éxito!";
	}
}
