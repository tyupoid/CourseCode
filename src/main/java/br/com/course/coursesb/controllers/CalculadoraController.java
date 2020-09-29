package br.com.course.coursesb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@GetMapping("/{num1}/{num2}")
	public double somar(@PathVariable double num1, @PathVariable double num2) {
		return num1+num2;
	}
	
	@GetMapping("/subtrair")
	public  double subtrair(@RequestParam(name = "num1") double num1,@RequestParam(name = "num2") double num2) {
		return num2 - num1;
	}
	
}
