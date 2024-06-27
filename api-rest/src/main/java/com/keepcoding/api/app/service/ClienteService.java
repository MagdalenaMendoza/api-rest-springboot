package com.keepcoding.api.app.service;

import java.util.List;

import com.keepcoding.api.app.entity.Cliente;

public interface ClienteService {

	public List<Cliente> buscarTodos();
	public Cliente guardar(Cliente cliente);
	public Cliente buscarId(Long id);
	public List<Cliente> buscarNombre(String nombre);
	public List<Cliente> buscarNombreApellido(String nombre, String apellido);
	public List<Cliente> buscarEmailTelefono(String email, int telefono);
}
