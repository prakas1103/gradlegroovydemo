package com.prakash.gradlegroovydemo.repository;

import com.prakash.gradlegroovydemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findCustomerByCustomerId(int id);
//    Set<OrderEntity> findOrdersByCustomerId(int id);
}
