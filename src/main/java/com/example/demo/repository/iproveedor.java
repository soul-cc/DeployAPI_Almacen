package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.proveedor;

@Repository
public interface iproveedor extends CrudRepository<proveedor, Integer>{

}
