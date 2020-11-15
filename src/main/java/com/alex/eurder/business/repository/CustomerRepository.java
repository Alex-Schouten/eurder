package com.alex.eurder.business.repository;

import com.alex.eurder.business.entity.users.Customer;
import com.alex.eurder.exceptions.users.CustomerAlreadyExistsException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepository {

    private final Map<String, Customer> customers;

    public CustomerRepository(){
        this.customers = new HashMap<>();
        addFirstCustomer();
    }

    public void addFirstCustomer(){
        Customer customer = new Customer("Alex", "Schouten", "Alex@gmail.com", "Nieuwstraat", 5, 3500, "Hasselt");
        customers.put(customer.getId(), customer);
    }

    public Customer save(Customer customer){

        if(customers.containsValue(customer)) throw new CustomerAlreadyExistsException(customer.getId() + " already exists");
        customers.put(customer.getId(), customer);
        return customer;
    }

    public List<Customer> getCustomers(){
        return new ArrayList<>(customers.values());
    }

    public Map<String, Customer> getCustomerMap()
    {
        return customers;
    }

}
