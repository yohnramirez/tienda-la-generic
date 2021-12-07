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

import com.spring.mongo.api.model.User;
import com.spring.mongo.api.repository.UserRepository;

@RestController
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@PostMapping("/user/add")
	public String saveUser(@RequestBody User user) {
		repository.save(user);
		return "Usuario " + user.getId() + " agregado con éxito!";
	}
	
	@GetMapping("/user/findAllUsers")
	public List<User> getUsers(){
		return repository.findAll();
	}
	
	@GetMapping("/user/findAllUsers/{id}")
	public Optional<User> getUsers(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/user/deleteUser/{id}")
	public String deleteUser(@PathVariable int id) {
		repository.deleteById(id);
		return "Usuario " + id + " eliminado con éxito!";
	}

}
