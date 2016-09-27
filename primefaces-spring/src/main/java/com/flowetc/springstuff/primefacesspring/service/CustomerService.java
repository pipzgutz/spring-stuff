package com.flowetc.springstuff.primefacesspring.service;

import com.flowetc.springstuff.primefacesspring.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Created by pgutierrez on 06/07/2016.
 */
@Service
public class CustomerService {
    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Pedro", 11));
        customers.add(new Customer("Juan", 22));
        customers.add(new Customer("Maria", 33));
        return customers;
    }
}
