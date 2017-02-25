package org.hudas.controllers;

import org.hibernate.SessionFactory;
import org.hudas.entities.EmailConfiguration;
import org.hudas.repositories.EmailConfigurationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class EmailManagementController {

    @Resource
    private EmailConfigurationRepository emailConfigurationRepository;

    @RequestMapping("/pasto-duomenys")
    public String getLetters() {
        EmailConfiguration config = emailConfigurationRepository.findOne(1L);

        return "email-setup";
    }
}