package org.hudas.controllers.lettersend;

import java.util.List;

public class NewsLetterForm {

    private String filename;
    private TargetForm target;

    public NewsLetterForm() {
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public TargetForm getTarget() {
        return target;
    }

    public void setTarget(TargetForm target) {
        this.target = target;
    }
}
