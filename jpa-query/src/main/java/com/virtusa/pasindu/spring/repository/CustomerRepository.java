package com.virtusa.pasindu.spring.repository;

import com.virtusa.pasindu.spring.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
