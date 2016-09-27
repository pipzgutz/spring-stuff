package com.flowetc.springstuff.primefacesspring.view;

import com.flowetc.springstuff.primefacesspring.model.Customer;
import com.flowetc.springstuff.primefacesspring.service.CustomerService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

/**
 * @author Created by pgutierrez on 06/07/2016.
 */
@Component("customer")
@Getter
public class CustomerView implements Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
    private CustomerService service;
    private List<Customer> customers;

    @PostConstruct
    public void init() {
        customers = service.getAll();
    }
}
