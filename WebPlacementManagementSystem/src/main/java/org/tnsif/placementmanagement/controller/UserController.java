package org.tnsif.placementmanagement.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.placementmanagement.entities.User;
import org.tnsif.placementmanagement.services.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	//RESTful API's method
	@PostMapping("/user")
	public void insert(@RequestBody User user)
	{
		service.create(user);
	}
	
	
	
	@GetMapping("/user")
	public List<User>retriveA()
	{
		return service.retriveAll();
	}
	
	@GetMapping("/User/{id}")
	public ResponseEntity<User> retreive(@PathVariable Integer id)
	{
		try {
			User user=service.retrieve(id);
			return new ResponseEntity<User>(user,HttpStatus.OK);

		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	

}
