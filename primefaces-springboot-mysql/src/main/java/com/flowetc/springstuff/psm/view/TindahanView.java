package com.flowetc.springstuff.psm.view;

import org.springframework.stereotype.Component;

/**
 *
 * @author pgutierrez
 * @version 1.0
 * @since October 17, 2016
 */
@Component
public class TindahanView {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
