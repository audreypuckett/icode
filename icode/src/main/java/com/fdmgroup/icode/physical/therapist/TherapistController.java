package com.fdmgroup.icode.physical.therapist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
// Full mapping will be /physical/therapist/<Whatever is defined in mapping below>
@RequestMapping("therapist")
public class TherapistController {
	
	private String baseFolder = "physical/therapist";
	private TherapistService service;
	
	public TherapistController(TherapistService service) {
		super();
		this.service = service;
	}

	@GetMapping("/login")
	public String goToLoginPage(HttpSession session) {
		if(session.getAttribute("loggedIn") != null){
			if(session.getAttribute("loggedIn").equals(true)){
				return baseFolder + "/home";
			}
		}
		return baseFolder + "/login";
	}

	@PostMapping("/login")
	public String processTherapistLogin(@RequestParam String username, @RequestParam String password, HttpSession session) {
		boolean isSuccessful = service.loginUser(username, password);
		if(!isSuccessful){
			String message = "Your username or password is not correct";
			session.setAttribute("message", message);
			return "redirect:/therapist/login";
		}
		session.setAttribute("loggedIn", true);
		session.setAttribute("username", username);
		return baseFolder + "/home";
	}
	
	//TODO - logout

	
	//TODO - view clients
	
	//TODO - other client tasks
	
	//TODO redirect to method in Exercises controller
}
