package com.flowetc.springstuff.primefacesspring.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Created by pgutierrez on 06/07/2016.
 */
@Data
@Builder
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
