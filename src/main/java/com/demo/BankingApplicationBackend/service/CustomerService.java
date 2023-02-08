package com.demo.BankingApplicationBackend.service;

import java.util.List;
import java.util.Optional;

import com.demo.BankingApplicationBackend.model.Customer;

public interface CustomerService {
	public Customer insertCustomer(Customer c);
	public List<Customer> fetchAllCustomers();
	public void deleteCustomerById(Integer id);
	public Optional<Customer> fetchCustomerById(Integer id);
	public Customer updateCustomer(Customer c);
	
}
