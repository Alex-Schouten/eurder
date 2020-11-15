package com.alex.eurder.business.repository;

import com.alex.eurder.business.entity.users.Customer;

import javax.swing.undo.CannotUndoException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomerRepository {

    private Map<String, Customer> customers;

    public void addFirstCustomer(){
        Customer customer = new Customer("Alex", "Schouten", "Alex@gmail.com", "Nieuwstraat", 5, 3500, "Hasselt");
        customers.put(customer.getId(), customer);
    }

    public Customer save(Customer customer){
        if(customers.containsValue(customer)) throw new CannotUndoException(customer.getFirstName() + " " + customer.getLastName());
        customers.put(customer.getId(), customer);
    }

    public List<Customer> getCustomers(){
        return new ArrayList<>(customers.values());
    }

    public Map<String, Customer> getCustomerMap()
    {
        return customers;
    }

}
