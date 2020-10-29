package com.alex.eurder.business.repository;

import com.alex.eurder.business.entity.users.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomerRepository {

    private Map<String, Customer> customers;

    public void addFirstCustomer(){
        Customer customer = new Customer("Alex", "Schouten", "Alex@gmail.com", "Nieuwstraat", 5, 3500, "Hasselt");
        customers.put(customer.getId(), customer);
    }

    public List<Customer> getCustemors(){
        return new ArrayList<>(customers.values());
    }

    public Map<String, Customer> getMemberMap ()
    {
        return customers;
    }
}
