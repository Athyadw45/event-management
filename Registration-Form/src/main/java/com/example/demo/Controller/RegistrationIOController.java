package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.RegistrationIO;
import com.example.demo.Service.RegistrationIOService;

@RestController
//@Controller
public class RegistrationIOController {
	
	@Autowired
	private RegistrationIOService registrationIOservice;
	
	
	@RequestMapping("/hi")
	public String hi() {
		return "Welcome...";
	}
	
	@RequestMapping(value="/add" , method= RequestMethod.POST)
	public String addData( @RequestBody RegistrationIO user) throws Exception {
		
		registrationIOservice.savedata(user);
		
		return "Records added successfully";
	}
	
	@RequestMapping("/show")
	public List<RegistrationIO> showAll(){
		return registrationIOservice.showAll();
	}
	
	@RequestMapping("/update/{id}")
	@ResponseBody
	public RegistrationIO updateUser (@PathVariable("id")int id) {
		return registrationIOservice.update(id);
	}
	
	@GetMapping("/showUsers")
	public String showAllUsers(Model model){
		List<RegistrationIO> users=registrationIOservice.showAll();
		model.addAttribute("users", users);
		return "demo2";
	}
	
	@RequestMapping("/delete/{id}")
	@ResponseBody
	public String deleteRecord(@PathVariable("id")int id) {
			registrationIOservice.delete(id);
		return "record deleted successfully :"+id;
	}
		
	
//	@GetMapping("/welcome")
//	public String demo() {
//		return "demo";
//	}
}
