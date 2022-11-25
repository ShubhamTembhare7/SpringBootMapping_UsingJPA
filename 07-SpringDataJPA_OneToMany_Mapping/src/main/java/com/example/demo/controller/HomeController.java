package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.ProductRepository;

@RestController
public class HomeController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	
	@PostMapping("/save")
	public Customer addCustomer(@RequestBody Customer customer) {
		 return customerRepository.save(customer);
		
		
	}
	
	@GetMapping("/getAll")
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}
}

/*{
	 "name":"Tejas",
	 "email":"teja@gmail.com",
	 "gender":"male",
	 "product":[
	                    {
	                        "pid":"107",
	                        "name":"Bottle",
	                        "qty":"4",
	                        "price":"500"   
	                    } , {
	                        "pid":"108",
	                        "name":"Bags",
	                        "qty":"2",
	                        "price":"5000"   
	                    }    
	     ]
	  }*/


