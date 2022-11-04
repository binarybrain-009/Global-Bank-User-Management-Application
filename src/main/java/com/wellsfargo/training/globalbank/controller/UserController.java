package com.wellsfargo.training.globalbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.training.globalbank.model.User;
import com.wellsfargo.training.globalbank.service.UserService;

@RestController // generate & manage REST API in json format
@RequestMapping(value="/api")
public class UserController {

	@Autowired
	private UserService uservice;
	
	/* http://localhost:8082/globalbank/api/User */
	
	/* Request -- Client(React/PostMan) --> Controller ---> Service ---> Repository --> DB*/
	
	/* Response -- DB --> Repository --->  Service --> Controller --> Client(React/PostMan) */
	
	/*POST - http://localhost:8082/globalbank/api/User */
	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@Validated @RequestBody User user) {
		
		User u1=uservice.registerUser(user); // invoke service method
		
		 return ResponseEntity.ok(u1);
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return uservice.getAllUsers();
	}
}
