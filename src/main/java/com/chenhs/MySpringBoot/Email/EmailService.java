package com.chenhs.MySpringBoot.Email;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	@Autowired
	private JavaMailSender mailsender;
	@Value("${spring.mail.username}")
	private String from;
	private static Logger logger = LoggerFactory.getLogger(EmailService.class);

	public void send() {
		MimeMessage ms = mailsender.createMimeMessage();
		MimeMessageHelper mh = new MimeMessageHelper(ms);
		logger.error("start send email!!!!!!!!!!!!!!!!");
		try {
			mh.setFrom(from);
			mh.setSubject("aaaaaaaa");
			mh.setTo("513674040@qq.com");
			mh.setText("tttttttttttttttttt");
			mailsender.send(ms);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		logger.error("end send email!!!!!!!!!!!!!!!!");
	}
}
