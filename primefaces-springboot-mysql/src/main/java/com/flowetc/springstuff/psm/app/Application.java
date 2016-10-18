package com.flowetc.springstuff.psm.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author pgutierrez
 * @version 1.0
 * @since October 17, 2016
 */
@SpringBootApplication
public class Application {

    @Configuration
    @ComponentScan("com.flowetc.springstuff.psm.view")
    public class ViewConfig {

    }

    @Configuration
    @ComponentScan("com.flowetc.springstuff.psm.controller")
    public class ControllerConfig {
        
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
