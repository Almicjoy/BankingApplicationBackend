package com.demo.BankingApplicationBackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.BankingApplicationBackend.model.Customer;
import com.demo.BankingApplicationBackend.service.CustomerService;

@CrossOrigin(origins ="*", maxAge=3600)
@RestController
public class RestControllerApp {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/create")
	public Customer createEmployee(@RequestBody Customer c) {
		return customerService.insertCustomer(c);
	}
	
	@GetMapping("/findCustomer/{id}")
	public Optional<Customer> findCustomer(@PathVariable int id) {
		return customerService.fetchCustomerById(id);
	}
	
	@GetMapping("/findAllECustomers")
	public List<Customer> findAllCustomers() {
		return customerService.fetchAllCustomers();
	}
	
	@PutMapping("/modifyCustomer")
	public Customer updateEmployee(Customer c) {
		return customerService.updateCustomer(c);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
		customerService.deleteCustomerById(id);
		ResponseEntity<String> res = new ResponseEntity<>("Deleted employee with id: " + id, HttpStatus.OK);
		return res;
	}
	

}
