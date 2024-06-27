package com.keepcoding.api.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.keepcoding.api.app.entity.Cliente;
import com.keepcoding.api.app.service.ClienteService;

@RestController
public class CLienteRestController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> index(){
		return clienteService.buscarTodos();
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente show(@PathVariable Long id){
		return clienteService.buscarId(id);
	}
	
	@GetMapping("/cliente/{nombre}")
	public List<Cliente> show(@PathVariable String nombre){
		return clienteService.buscarNombre(nombre);
	}

	@GetMapping("/cliente/{nombre}/{apellido}")
	public List<Cliente> show(@PathVariable String nombre, @PathVariable String apellido){
		return clienteService.buscarNombreApellido(nombre,apellido);
	}
	
	@GetMapping("/cliente2/{email}/{telefono}")
	public List<Cliente> show(@PathVariable String email, @PathVariable int telefono){
		return clienteService.buscarEmailTelefono(email,telefono);
	}
	
	@PostMapping("/clientes")
	public Cliente creat(@RequestBody Cliente cliente) {
		return clienteService.guardar(cliente);
	}
	
	
}
