package br.com.course.coursesb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class primeiroController {

	@GetMapping(path = { "/ola", "/saudacao" })
	public String ola() {
		return "ola Spring boot!";
	}
	
	@PostMapping(path = "/saudacao")
	public String saudacao() {
		return "ola Spring boot!";
	}

}
