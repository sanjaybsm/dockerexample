package com.sanjay.dockerexample.dockerexample.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class RestExample {

	@GetMapping()
	public ResponseEntity<String> getAllUserData(){
		return new ResponseEntity<>("Users", HttpStatus.OK);
	}

}
