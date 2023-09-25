package com.exercises.interview.setup.service;

import com.exercises.interview.setup.entities.Customer;
import com.exercises.interview.setup.entities.Order;
import com.exercises.interview.setup.repositories.CustomerRepository;
import com.exercises.interview.setup.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DatabaseInitializer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderRepository orderRepository;

    @PostConstruct
    public void initData() {
        // Initialize your data here
        Customer customer = new Customer();
        customer.setName("John Doe");
        customerRepository.save(customer);

        Order order = new Order();
        order.setCustomer(customer);
        order.setProduct("Laptop");
        orderRepository.save(order);

        Order order2 = new Order();
        order2.setCustomer(customer);
        order2.setProduct("Mobile");
        orderRepository.save(order2);
    }
}
