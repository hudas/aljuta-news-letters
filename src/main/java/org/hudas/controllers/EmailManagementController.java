package org.hudas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailManagementController {

    @RequestMapping("/pasto-duomenys")
    public String getLetters() {
        return "email-setup";
    }
}