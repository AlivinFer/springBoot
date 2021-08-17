package com.alivin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class Springboot05MailApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("test");
        message.setText("hello ");
        message.setFrom("5149092@qq.com");
        message.setTo("609059@qq.com");

        mailSender.send(message);

    }

    @Test
    void contextLoads2() throws MessagingException {
        // 发送一个复杂的邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        // 组装
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        helper.setSubject("test 复杂邮件");
        helper.setText("<p style='color:red'> cool baby</p>", true);

        // 附件
        helper.addAttachment("1.jpg", new File("C:\\Users\\Administrator\\Pictures\\Saved Pictures\\1.jpg"));

        helper.setFrom("942122009@qq.com");
        helper.setTo("942122009@qq.com");

        mailSender.send(mimeMessage);
    }

}
