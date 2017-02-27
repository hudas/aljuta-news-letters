package org.hudas.controllers.emailpreview;

import org.hudas.entities.EmailConfiguration;
import org.hudas.repositories.EmailConfigurationRepository;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/pasto-duomenys")
public class EmailPreviewController {

    @Resource
    private Environment environment;

    @Resource
    private EmailConfigurationRepository emailConfigurationRepository;

    @GetMapping
    public String getLetters(Model model) {
        EmailConfigView formData = getCurrentConfig();
        if (formData == null) {
            return "redirect:pasto-duomenys/koreguoti";
        }

        model.addAttribute("test", "testvalue");
        model.addAttribute("emailConfig", formData);

        return "email-preview";
    }

    public EmailConfigView getCurrentConfig() {
        EmailConfiguration config = emailConfigurationRepository.getCurrentConfig();

        if (config == null) {
            return null;
        }

        EmailConfigView formData = new EmailConfigView();
        formData.setSenderEmail(config.getSenderEmail());
        formData.setSftpURL(environment.getProperty("email.sftpUrl"));

        return formData;
    }
}