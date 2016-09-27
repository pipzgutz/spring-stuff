package com.flowetc.springstuff.primefacesspring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @version 1.0
 * @since August 07, 2016
 */
@Configuration
//@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("password").roles("USER")
                .and()
                .withUser("admin").password("password").roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/javax.faces.resource/**").permitAll()
                .antMatchers("/", "index").permitAll()
                .antMatchers("/admin/**").access("hasRole('ADMIN')")
                .and()
                .formLogin()
                .loginPage("/login.jsf")
                .permitAll()
                .and()
                .logout()
                .invalidateHttpSession(true)
                .logoutSuccessUrl("/home.jsf")
                .permitAll()
                .and()
                .exceptionHandling().accessDeniedPage("/access-denied.jsf");
    }
}
