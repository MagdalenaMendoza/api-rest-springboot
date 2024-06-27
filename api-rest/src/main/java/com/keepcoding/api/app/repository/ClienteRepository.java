package com.keepcoding.api.app.repository;


import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.keepcoding.api.app.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Long> {
	
	
	List<Cliente> findByNombre(String nombre);
	List<Cliente> findByNombreAndApellido(String nombre, String apellido);
	List<Cliente> findByEmailAndTelefono(String email, int telefono);
	
}
