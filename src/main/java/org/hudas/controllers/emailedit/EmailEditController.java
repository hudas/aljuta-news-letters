package org.hudas.controllers.emailedit;

import org.hudas.entities.EmailConfiguration;
import org.hudas.repositories.EmailConfigurationRepository;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@Controller
@RequestMapping("/pasto-duomenys/koreguoti")
public class EmailEditController {

    @Resource
    private Environment environment;

    @Resource
    private EmailConfigurationRepository emailConfigurationRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String viewCurrent(Model model) {
        model.addAttribute("emailConfigForm", buildFormData());
        return "email-edit";
    }

    @Transactional
    @RequestMapping(method = RequestMethod.POST)
    public String updateConfig(@Valid EmailConfigForm emailConfigForm, BindingResult result) {
        if (result.hasErrors()) {
            return "email-edit";
        }

        // Always create new config, old ones are left for history
        emailConfigurationRepository.save(
                new EmailConfiguration(
                        emailConfigForm.getSenderEmail(),
                        emailConfigForm.getSenderPassword()
                )
        );

        return "redirect:/pasto-duomenys";
    }

    public EmailConfigForm buildFormData() {
        EmailConfiguration config = emailConfigurationRepository.getCurrentConfig();

        EmailConfigForm formData = new EmailConfigForm();

        if (config != null) {
            formData.setSenderEmail(config.getSenderEmail());
            formData.setSftpURL(environment.getProperty("email.sftpUrl"));
        }

        return formData;
    }
}