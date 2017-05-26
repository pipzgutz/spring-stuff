package com.flowetc.springstuff.registration.service;

import com.flowetc.springstuff.registration.entity.Registration;
import com.flowetc.springstuff.registration.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @version 1.0
 * @since May 25, 2017
 */
@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepository registrationRepository;

    public void register(Registration registration) {
        registrationRepository.save(registration);
    }

    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }
}
