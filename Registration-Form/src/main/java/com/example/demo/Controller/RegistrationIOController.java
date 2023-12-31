package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.RegistrationIO;
import com.example.demo.Service.RegistrationIOService;

//@RestController
@Controller
public class RegistrationIOController {
	
	@Autowired
	private RegistrationIOService registrationIOservice;
	
	
	@RequestMapping("/hi")
	@ResponseBody
	public String hi() {
		return "Welcome...";
	}
	
	@RequestMapping(value="/add" , method= RequestMethod.POST)
	@ResponseBody
	public String addData( @RequestBody RegistrationIO user) throws Exception {
		
		registrationIOservice.savedata(user);
		
		return "Records added successfully";
	}
	
	@ResponseBody
	@RequestMapping("/show")
	public List<RegistrationIO> showAll(){
		return registrationIOservice.showAll();
	}
	
	
	@GetMapping("/showUsers")
	public String showAllUsers(Model model){
		List<RegistrationIO> users=registrationIOservice.showAll();
		model.addAttribute("users", users);
		return "luna"; 
	}
	

	
	@GetMapping("/Register")
	public String registration() {
		return "main";
		
	}
	
	//for adding data into form
	@PostMapping("/addusers")
	public String addUsers(RegistrationIO user)
	{
		registrationIOservice.savedata(user);
		return "redirect:/showUsers" ;
			
	}
		
	
//	@GetMapping("/welcome")
//	public String demo() {
//		return "demo";
//	}
}
