package org.hudas.controllers.lettersend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/newsletter")
public class LetterFileController {

    @RequestMapping("/upload")
    public String upload(@RequestParam("newsletter-file") MultipartFile file, HttpSession session) throws IOException {
        session.setAttribute("newsletter-to-send", new UploadedNewsLetter(file.getOriginalFilename(), file.getBytes()));

        return "redirect:/skrajutes";
    }

    @RequestMapping("/remove")
    public String remove(HttpSession session) {
        session.setAttribute("newsletter-to-send", null);

        return "redirect:/skrajutes";
    }
}
