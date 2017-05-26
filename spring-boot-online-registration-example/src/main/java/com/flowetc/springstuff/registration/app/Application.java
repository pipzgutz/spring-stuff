package com.flowetc.springstuff.registration.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @version 1.0
 * @since May 25, 2017
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {
        "com.flowetc.springstuff.registration.repository"})
@EntityScan(basePackages = "com.flowetc.springstuff.registration.entity")
@ComponentScan(basePackages = {
        "com.flowetc.springstuff.registration.controller",
        "com.flowetc.springstuff.registration.service",
        "com.flowetc.springstuff.registration.view"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
