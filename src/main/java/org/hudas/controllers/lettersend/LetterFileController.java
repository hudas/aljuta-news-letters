package org.hudas.controllers.lettersend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/newsletter")
public class LetterFileController {

    @RequestMapping("/upload")
    public String upload(@RequestParam("newsletter-file") MultipartFile file,
                       HttpSession session) {
        session.setAttribute("newsletter-to-send", file);

        return "newsletter";
    }
}
