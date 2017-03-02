package org.hudas.controllers.lettersend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 *  It is single admin user app. We should not be afraid of session.
 */
@Controller
public class LetterController {

    @RequestMapping("/skrajutes")
    public String getLetters(Model model, HttpSession session) throws IOException {
        NewsLetterForm letterForm = new NewsLetterForm();

        UploadedNewsLetter file = (UploadedNewsLetter) session.getAttribute("newsletter-to-send");

        if (file != null) {
            letterForm.setFilename(file.getFilename());
            letterForm.setContent(new String(file.getContent()));
        }

        model.addAttribute("letterForm", letterForm);

        return "newsletter";
    }
}