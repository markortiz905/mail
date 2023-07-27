package com.mark.mail;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * EmailService is a service class for sending emails.
 * It uses Spring's JavaMailSender interface to send SimpleMailMessage objects.
 * @author markortiz905
 */
@Service
public class EmailService {

    private JavaMailSender javaMailSender;

    /**
     * The constructor accepts a JavaMailSender object and initializes the javaMailSender field.
     *
     * @param javaMailSender a JavaMailSender object used for sending emails.
     */
    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    /**
     * The sendEmail method sends an email message.
     * It creates a SimpleMailMessage object, sets the sender's email, the recipient's email, the subject, and the text of the message,
     * and sends the email using the JavaMailSender object.
     *
     * @param to the recipient's email address.
     * @param subject the subject of the email.
     * @param text the text of the email.
     */
    public void sendEmail(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("your-email@example.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);

        javaMailSender.send(message);
    }
}
