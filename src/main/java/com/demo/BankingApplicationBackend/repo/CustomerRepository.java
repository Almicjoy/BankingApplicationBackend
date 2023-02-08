package com.demo.BankingApplicationBackend.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.BankingApplicationBackend.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	public Optional<Customer> findByUsername(String username);
}
