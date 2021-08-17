package com.alivin.util.mailUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * 工具类
 */
public class SendMail {

    @Autowired
    JavaMailSenderImpl mailSender;

    /**
     *
     * @param html
     * @param subject
     * @param text
     * @param from
     * @param to
     * @throws MessagingException
     */
    public void sendMail(Boolean html, String subject, String text, String from, String to) throws MessagingException {

        MimeMessage mimeMessage = mailSender.createMimeMessage();
        // 组装
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, html);

        helper.setSubject(subject);
        helper.setText(text, html);

        // 附件
        helper.addAttachment("1.jpg", new File("C:\\Users\\Administrator\\Pictures\\Saved Pictures\\1.jpg"));

        helper.setFrom(from);
        helper.setTo(to);

        mailSender.send(mimeMessage);
    }
}
