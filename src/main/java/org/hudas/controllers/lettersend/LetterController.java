package org.hudas.controllers.lettersend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 *  It is single admin user app. We should not be afraid of session.
 */
@Controller
public class LetterController {

    @RequestMapping("/skrajutes")
    public String getLetters(Model model, HttpSession session) {
        NewsLetterForm letterForm = new NewsLetterForm();

        MultipartFile file = (MultipartFile) session.getAttribute("newsletter-to-send");

        if (file != null) {
            letterForm.setFilename(file.getOriginalFilename());
        }

        letterForm.setTarget((TargetForm) session.getAttribute("mail-target"));

        return "newsletter";
    }
}