package com.alex.eurder.service;

import com.alex.eurder.business.entity.users.Customer;
import com.alex.eurder.business.repository.CustomerRepository;
import com.alex.eurder.service.dto.users.CustomerDTO;
import com.alex.eurder.service.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Autowired
    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper){
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    public CustomerDTO save(CustomerDTO customerDTO){
        Customer customer = customerRepository.save(customerMapper.toEntity(customerDTO));
        return customerMapper.toDTO(customer);
    }


    public List<CustomerDTO> getAllCustomersByID() {
        return customerRepository.getCustomers().stream()
                .map(customerMapper::toRestrictedDTO)
                .collect(Collectors.toList());
    }

    public CustomerDTO getOneCustomerByID(String id) {
        return customerMapper.toDTO(customerRepository.getCustomerMap().get(id));
    }
}
