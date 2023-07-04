package org.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entities.College;
import org.tnsif.placementmanagement.entities.User;
import org.tnsif.placementmanagement.repository.UserRepository;
@Service
public class UserService {

	
	/*to inject the dependency automatically*/
	@Autowired
	private UserRepository repo;
	
	//create and update
	public void create(User user)
	{
		repo.save(user);
	}
	//retrieve with Specific ID
	public User retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	//retrieve all records
	public  List<User> retriveAll()
	{
		return repo.findAll();
	}
	
	
	
	
}
