package com.prakash.gradlegroovydemo.controller;

import com.prakash.gradlegroovydemo.model.Customer;
import com.prakash.gradlegroovydemo.model.OrderEntity;
import com.prakash.gradlegroovydemo.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("orders/{id}")
    public Set<OrderEntity> getOrdersForCustomer(@PathVariable int id) {
        Customer customer = customerRepository.findCustomerByCustomerId(id);

        return customer.getOrdersList();
    }
}
