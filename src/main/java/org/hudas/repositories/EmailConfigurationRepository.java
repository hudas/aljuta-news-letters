package org.hudas.repositories;

import org.hudas.entities.EmailConfiguration;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface EmailConfigurationRepository extends CrudRepository<EmailConfiguration, Long> {

    @Query(value = "select * from mail.email_configuration order by id desc limit 1", nativeQuery = true)
    EmailConfiguration getCurrentConfig();
}
