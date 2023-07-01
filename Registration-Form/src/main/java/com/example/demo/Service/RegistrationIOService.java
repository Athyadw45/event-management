package com.example.demo.Service;

import java.util.List;
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
//		user.setAddress("AH1/77 n2 thakare nagar");
//		user.setAlternatePhoneNo(45654);
//		user.setCity("Aurangabad");
		Random rand = new Random();
		user.setEmpId(rand.nextInt());
		
		
		
		
		registrationIOrepo.save(user);
		
	}
	
	public List<RegistrationIO> showAll(){
		return registrationIOrepo.findAll();  	
	}
	
	
}
