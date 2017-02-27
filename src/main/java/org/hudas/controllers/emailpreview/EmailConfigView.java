package org.hudas.controllers.emailpreview;


public class EmailConfigView {

    private String sftpURL;

    private String senderEmail;

    public EmailConfigView() {
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
}
