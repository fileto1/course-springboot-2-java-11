package com.fileto.coursespring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fileto.coursespring.entities.User;
import com.fileto.coursespring.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService userService;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> listUsers = userService.findAll();
		return new ResponseEntity<List<User>>(listUsers, HttpStatus.OK);
	}

	@GetMapping("{id}")
	public ResponseEntity<Object> findById(@PathVariable Long id) {
		User user = userService.findById(id);
		return new ResponseEntity<Object>(user, HttpStatus.OK);
	}
}
