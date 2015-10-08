package com.huaru.tools.email;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;


public class SendHtmlEmail {

    private String smtpServer;

    private String sendFromEmail;

    private String sendPassword;

    public void sendMessage(String to, String subject, String messageText) throws MessagingException, java.io.UnsupportedEncodingException {

        // Step 1:  Configure the mail session
        java.util.Properties props = new java.util.Properties();
        props.setProperty("mail.smtp.auth", "true");//指定是否需要SMTP验证
        props.setProperty("mail.smtp.host", smtpServer);//指定SMTP服务器
        props.put("mail.transport.protocol", "smtp");
        Session mailSession = Session.getDefaultInstance(props);
        mailSession.setDebug(true);//是否在控制台显示debug信息

        // Step 2:  Construct the message
        InternetAddress fromAddress = new InternetAddress(sendFromEmail);
        InternetAddress toAddress = new InternetAddress(to);

        MimeMessage testMessage = new MimeMessage(mailSession);
        testMessage.setFrom(fromAddress);
        testMessage.addRecipient(javax.mail.Message.RecipientType.TO, toAddress);
        testMessage.setSentDate(new java.util.Date());
        testMessage.setSubject(MimeUtility.encodeText(subject, "utf-8", "B"));

        testMessage.setContent(messageText, "text/html;charset=utf-8");
        System.out.println("Message constructed");

        // Step 3:  Now send the message
        Transport transport = mailSession.getTransport("smtp");
        transport.connect(smtpServer, sendFromEmail, sendPassword);
        transport.sendMessage(testMessage, testMessage.getAllRecipients());
        transport.close();


        System.out.println("Message sent!");
    }

    public String getSmtpServer() {
        return smtpServer;
    }

    public void setSmtpServer(String smtpServer) {
        this.smtpServer = smtpServer;
    }

    public String getSendFromEmail() {
        return sendFromEmail;
    }

    public void setSendFromEmail(String sendFromEmail) {
        this.sendFromEmail = sendFromEmail;
    }

    public String getSendPassword() {
        return sendPassword;
    }

    public void setSendPassword(String sendPassword) {
        this.sendPassword = sendPassword;
    }
}
