package com.lontra.crediario.controller;

import com.lontra.crediario.entity.Customer;
import com.lontra.crediario.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/user")
    public Customer getCustomer(@RequestParam Integer id){
        Optional customer = customerService.getUser(id);
        if(customer.isPresent()){
            return (Customer) customer.get();
        }
        return null;
    }
}
