package com.keepcoding.api.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.keepcoding.api.app.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Long> {

}
