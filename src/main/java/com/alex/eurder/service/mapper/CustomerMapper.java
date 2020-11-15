package com.alex.eurder.service.mapper;

import com.alex.eurder.business.entity.users.Customer;
import com.alex.eurder.service.dto.users.CustomerDTO;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public Customer toEntity(CustomerDTO customerDTO){

        Customer result = new Customer(
                customerDTO.getFirstName(),
                customerDTO.getLastName(),
                customerDTO.getMailAddress(),
                customerDTO.getStreet(),
                customerDTO.getStreetNumber(),
                customerDTO.getPostalCode(),
                customerDTO.getCity()
        );

        return result;
    }

    public CustomerDTO toDTO(Customer customer){
        CustomerDTO result = new CustomerDTO();
        result.setId(customer.getId());
        result.setFirstName(customer.getFirstName());
        result.setLastName(customer.getLastName());
        result.setMailAddress(customer.getMailAddress();
        result.setStreet(customer.getStreet());
        result.setStreetNumber(customer.getStreetNumber());
        result.setPostalCode(customer.getPostalCode());
        result.setCity(customer.getCity());

        return result;
    }

    public CustomerDTO toRestrictedDTO(Customer customer){
        CustomerDTO result = new CustomerDTO();
        result.setId("Nice try Karel, you don't have access!");
        result.setFirstName(customer.getFirstName());
        result.setLastName(customer.getLastName());
        result.setMailAddress(customer.getMailAddress());
        result.setStreet(customer.getStreet());
        result.setStreetNumber(customer.getStreetNumber());
        result.setPostalCode(customer.getPostalCode());
        result.setCity(customer.getCity());

        return result;
    }
}
