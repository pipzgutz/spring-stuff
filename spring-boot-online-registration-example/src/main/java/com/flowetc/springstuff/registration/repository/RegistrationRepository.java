package com.flowetc.springstuff.registration.repository;

import com.flowetc.springstuff.registration.entity.Registration;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @version 1.0
 * @since May 25, 2017
 */
public interface RegistrationRepository extends CrudRepository<Registration, Long> {
    List<Registration> findAll();
}
