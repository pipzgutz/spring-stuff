package com.flowetc.springstuff.primefacesspring.service;


import com.flowetc.springstuff.primefacesspring.model.Customer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * @author Created by pgutierrez on 08/07/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {
    @Mock
    private CustomerService service;
    private List<Customer> customers;

    @Before
    public void setUp() throws Exception {
        customers = new ArrayList<>();
        customers.add(new Customer("Pedro", 11));
        customers.add(new Customer("Juan", 22));
        customers.add(new Customer("Maria", 33));
    }

    @Test
    public void testGetAll() throws Exception {
        when(service.getAll()).thenReturn(customers);

        List<Customer> customers = service.getAll();

        assertNotNull(customers);
        assertTrue(!customers.isEmpty());
        assertNotNull(customers.get(0).getName());
        assertNotEquals(0, customers.get(0).getAge());
        assertEquals(3, customers.size());
    }
}