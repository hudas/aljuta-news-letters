package org.hudas.repositories;

import org.hudas.entities.EmailConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;



public interface EmailConfigurationRepository extends CrudRepository<EmailConfiguration, Long> {

}
