package org.hudas.entities;

import javax.persistence.*;

@Entity
@Table(schema = "mail", name = "email_configuration")
public class EmailConfiguration {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "config_sequence")
    @SequenceGenerator(name = "config_sequence", sequenceName = "mail.email_config_seq")
    private Long id;

    @Column
    private String senderEmail;

    @Column
    private String senderPassword;

    public EmailConfiguration(String senderEmail, String senderPassword) {
        this.senderEmail = senderEmail;
        this.senderPassword = senderPassword;
    }

    protected EmailConfiguration() {

    }

    public void update(String senderEmail, String senderPassword) {
        this.senderEmail = senderEmail;
        this.senderPassword = senderPassword;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public String getSenderPassword() {
        return senderPassword;
    }
}
