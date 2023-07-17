package com.example.demo.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.RegistrationIO;
import com.example.demo.Repo.RegistrationIORepo;

@Service
public class RegistrationIOService {
	
	@Autowired
	private RegistrationIORepo registrationIOrepo;
	
	public void savedata(RegistrationIO user) {
//		RegistrationIO user = new RegistrationIO();
//		
//		user.setEmpId(1);
//		user.setAddress("Cannaught Place");
//		user.setAlternatePhoneNo(45654);
//		user.setCity("Delhi");
//		Random rand = new Random();
//		user.setEmpId(rand.nextInt());
		
		
		
		
		registrationIOrepo.save(user);
		
	}
	
	public List<RegistrationIO> showAll(){
		return registrationIOrepo.findAll();  	
	}
	
	//method for updating records
	public RegistrationIO update(int id) {
		//fetching existing records
		Optional<RegistrationIO> updateUser = registrationIOrepo.findById(id);
		RegistrationIO existingUser = updateUser.get();
		
		//setting updated values for entity
		existingUser.setCity("Mumbai");
		existingUser.setFirstName("Rohit");
		
		//save updated records
		
		registrationIOrepo.save(existingUser);
		return existingUser;
	}
	
	//method for deleting records
	
	public String delete(int id) {
		registrationIOrepo.deleteById(id);
		return "deleted successfully";
	}
	
}
