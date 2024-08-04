package org.example.appcicd.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheeseController {
	@GetMapping("/say/cheese")
	public ResponseEntity<String> sayCheese() {
		return new ResponseEntity<>("CHEESE", HttpStatus.OK);
	}
}
