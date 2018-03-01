package com.springjpa.controller;

import java.util.Arrays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.model.Request;

import com.springjpa.repo.CustomerRepository;

@RestController
public class WebController{
	@Autowired
	CustomerRepository repository;
	
	
	@RequestMapping("/add")
	public String process(@RequestParam("name") String name,@RequestParam("type") String type,@RequestParam("details") String details){
		// save a single Customer
		repository.save(new Request(name, type, details));
		
		return "Requested logged";
	}
	
	@RequestMapping("/findall")
	public String findAll(){
		String result = "";
		
		for(Request req : repository.findAll()){
			result += req.toString() + "<br>";
		}
		
		return result;
	}
	
	@RequestMapping("/findbyid")
	public String findById(@RequestParam("id") long id){
		String result = "";
		result = repository.findOne(id).toString();
		return result;
	}
	
	@RequestMapping("/findbyname")
	public String fetchDataByName(@RequestParam("name") String name){
		String result = "";
		
		for(Request req: repository.findByName(name)){
			result += req.toString() + "<br>"; 
		}
		
		return result;
	}
	
}

