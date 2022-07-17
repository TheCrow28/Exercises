package co.develhope.email1.Emails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendTo(String email, String title, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setFrom("development@develhope.co");
        message.setReplyTo("development@develhope.co");
        message.setSubject(title);
        message.setText(text);
        javaMailSender.send(message);
    }
}
