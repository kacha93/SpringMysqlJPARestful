package com.kach.web;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kach.domain.Customer;
import com.kach.domain.CustomerRepository;


@RestController

public class CustomerController {

	
	@Autowired
	CustomerRepository customerRepository;
	
	@RequestMapping(path="/customer",
			method = RequestMethod.GET)
	
	public void add(@RequestParam(value="name")String name) {
		
		Customer customer= new Customer(name);
		customerRepository.save(customer);
		
	}
}
