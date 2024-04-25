package com.lontra.crediario.service;

import com.lontra.crediario.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private List<Customer> customers;

    public CustomerService() {
        customers = new ArrayList<>();

        Customer customer = new Customer(1, "Lucas", "lucascardozo73@gmail.com", "45988095546");
        Customer customer2 = new Customer(2, "Lucas2", "lucascardozo74@gmail.com", "45988095546");
        Customer customer3 = new Customer(3, "Lucas3", "lucascardozo75@gmail.com", "45988095546");
        Customer customer4 = new Customer(4, "Lucas4", "lucascardozo76@gmail.com", "45988095546");
        Customer customer5 = new Customer(5, "Lucas5", "lucascardozo7@gmail.com", "45988095546");

        customers.addAll(Arrays.asList(customer, customer2, customer3, customer4, customer5));
    }

    public Optional<Customer> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (Customer customer : customers) {
            if(id == customer.getId()){
                optional = Optional.of(customer);
                return optional;
            }
        }
        return optional;
    }
}
