package com.keepcoding.api.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.keepcoding.api.app.entity.Cliente;
import com.keepcoding.api.app.repository.ClienteRepository;
import com.keepcoding.api.app.service.ClienteService;



@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> buscarTodos() {

		return (List<Cliente>) clienteRepository.findAll();
	}

	@Override
	@Transactional
	public Cliente guardar(Cliente cliente) {
		
		return clienteRepository.save(cliente);
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente buscarId(Long id) {
		// TODO Auto-generated method stub
		return clienteRepository.findById(id).orElse(null);
	}
	
	

}
