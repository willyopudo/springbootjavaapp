package com.springjpa.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springjpa.model.Request;

public interface CustomerRepository extends CrudRepository<Request, Long>{
	List<Request> findByName(String name);
}
