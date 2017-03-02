package org.hudas.controllers.lettersend;

import java.util.List;

public class NewsLetterForm {

    private String filename;
    private String content;

    private TargetForm target;

    public NewsLetterForm() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
