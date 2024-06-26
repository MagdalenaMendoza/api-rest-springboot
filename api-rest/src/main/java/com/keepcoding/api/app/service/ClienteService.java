package com.keepcoding.api.app.service;

import java.util.List;

import com.keepcoding.api.app.entity.Cliente;

public interface ClienteService {

	public List<Cliente> buscarTodos();
	public Cliente guardar(Cliente cliente);
	public Cliente buscarId(Long id);
}
