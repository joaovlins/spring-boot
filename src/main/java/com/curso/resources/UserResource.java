package com.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User user1 = new User(1, "joao", "joao@lins.com", "234344", "1234");
		
		
		return ResponseEntity.ok().body(user1);
		
		
		 	
		
	}
	
}
