package com.demo.BankingApplicationBackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.BankingApplicationBackend.model.Customer;
import com.demo.BankingApplicationBackend.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer insertCustomer(Customer c) {
		return customerRepository.save(c);
	}

	@Override
	public List<Customer> fetchAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public void deleteCustomerById(Integer id) {
		customerRepository.deleteById(id);
		
	}

	@Override
	public Optional<Customer> fetchCustomerById(Integer id) {
		return customerRepository.findById(id);
	}

	@Override
	public Customer updateCustomer(Customer c) {
		Optional<Customer> customer = customerRepository.findByUsername(c.getUsername());
		Customer customerMod = customer.stream().findFirst().orElse(null);
		customerMod.setFullname(c.getFullname());
		customerMod.setPassword(c.getPassword());
		
		return customerRepository.save(customerMod);
	}

}
