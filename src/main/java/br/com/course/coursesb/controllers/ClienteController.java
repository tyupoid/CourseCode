package br.com.course.coursesb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.course.coursesb.model.entities.Cliente;



@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28,"pedro","123.442,897-00");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id,"maria","987.654.321-00");
	}
	
	@GetMapping()
	public Cliente obterClientePorId2(
			@RequestParam(name="id",defaultValue = "1") int id) {
		return new Cliente(id,"Joao Augusto","123.485.987-02");
	}
}
