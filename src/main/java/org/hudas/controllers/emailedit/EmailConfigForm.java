package org.hudas.controllers.emailedit;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EmailConfigForm {

    private String sftpURL;

    @NotNull(message = "Nurodykite el. pašto adresą")
    @Size(min = 1, message = "Nurodykite el. pašto adresą")
    @Pattern(regexp = "^\\S+@{1}\\S+$", message = "Įveskite validų el pašto adresą")
    private String senderEmail;

    @NotNull(message = "Nurodykite slaptažodį")
    @Size(min = 1, message = "Nurodykite slaptažodį")
    private String senderPassword;

    public EmailConfigForm() {
    }

    public String getSftpURL() {
        return sftpURL;
    }

    public void setSftpURL(String sftpURL) {
        this.sftpURL = sftpURL;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getSenderPassword() {
        return senderPassword;
    }

    public void setSenderPassword(String senderPassword) {
        this.senderPassword = senderPassword;
    }
}
