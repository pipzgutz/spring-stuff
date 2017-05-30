package com.flowetc.springstuff.registration.view;

import com.flowetc.springstuff.registration.entity.Registration;
import com.flowetc.springstuff.registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import java.util.List;

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @version 1.0
 * @since May 25, 2017
 */
@RequestScoped
@Component
public class RegistrationView {
    private Registration registration;

    @Autowired
    private RegistrationService registrationService;

    private List<Registration> registeredUsers;

    @PostConstruct
    public void init() {
        reset();
    }

    public String save() {
        registrationService.register(registration);

        return "thankyou.xhtml";
    }

    public List<Registration> getRegisteredUsers() {
        return registrationService.findAll();
    }

    private void reset() {
        registration = new Registration();
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }
}
