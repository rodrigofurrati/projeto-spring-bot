package com.softplan.projeto.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.softplan.projeto.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Rodrigo Furrati", "rodrigofurrati95@hotmail.com", "51998868003", "1234");
		User u1 = new User(2L, "Rodrigo Da Silva", "rodrigofurrati95@hotmail.com", "51998868003", "1234");
		return ResponseEntity.ok().body(u1);
	}
}
