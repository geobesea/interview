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
        customer.setEmail("john@doe.com");
        customer.setPhone("0744444444");
        customerRepository.save(customer);

        Customer customer2 = new Customer();
        customer2.setName("David Ene");
        customer2.setEmail("david@ene.com");
        customer2.setPhone("0745555555");
        customerRepository.save(customer2);

        Customer customer3 = new Customer();
        customer3.setName("Lia Elene");
        customer3.setEmail("lia@elena.com");
        customer3.setPhone("0744333333");
        customerRepository.save(customer3);


        Order order = new Order();
        order.setCustomer(customer);
        order.setProduct("Laptop");
        orderRepository.save(order);

        Order order2 = new Order();
        order2.setCustomer(customer);
        order2.setProduct("Mobile");
        orderRepository.save(order2);

        Order order3 = new Order();
        order3.setCustomer(customer2);
        order3.setProduct("Laptop");
        orderRepository.save(order3);

        Order order4 = new Order();
        order4.setCustomer(customer2);
        order4.setProduct("Mouse");
        orderRepository.save(order4);

        Order order5 = new Order();
        order5.setCustomer(customer3);
        order5.setProduct("Keyboard");
        orderRepository.save(order5);
    }
}
