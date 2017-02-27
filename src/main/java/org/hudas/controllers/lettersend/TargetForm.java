package org.hudas.controllers.lettersend;

import java.util.List;

public class TargetForm {

    private String subject;
    private List<String> letterReceivers;

    public TargetForm() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<String> getLetterReceivers() {
        return letterReceivers;
    }

    public void setLetterReceivers(List<String> letterReceivers) {
        this.letterReceivers = letterReceivers;
    }
}
