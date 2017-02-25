package org.hudas.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "mail", name = "email_configuration")
public class EmailConfiguration {

    @Id
    private Long id;

    @Column(name = "sftp_url", nullable = false)
    private String sftpURL;

    @Column
    private String senderEmail;

    @Column
    private String senderPassword;

    public EmailConfiguration(String sftpURL, String senderEmail, String senderPassword) {
        this.sftpURL = sftpURL;
        this.senderEmail = senderEmail;
        this.senderPassword = senderPassword;
    }

    protected EmailConfiguration() {

    }

    public String getSftpURL() {
        return sftpURL;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public String getSenderPassword() {
        return senderPassword;
    }
}
