package com.alex.eurder.api;

import com.alex.eurder.business.entity.users.Customer;
import com.alex.eurder.service.CustomerService;
import com.alex.eurder.service.dto.users.CustomerDTO;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(path= "/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path= "/admin", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<CustomerDTO> getAllCustomersByID(){return customerService.getAllCustomersByID();}

    @GetMapping(path= "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public CustomerDTO getOneCustomerByID(@PathVariable String id){
        return customerService.getOneCustomerByID(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDTO save(@RequestBody CustomerDTO customerDTO) {return customerService.save(customerDTO);}

}
