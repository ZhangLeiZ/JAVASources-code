package com.zl.Maill;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by Administrator on 2017/9/22.
 */
public class MaillUtill {

    public  static void SendMaill(Maill maill) {
        Properties properties = ConfigUtil.bilud("src/main/resources/maill.properties");
        Session session = Session.getInstance(properties,new MailAuthenticator(ConfigUtil.getString("username"),ConfigUtil.getString("password")));
        Message message = new MimeMessage(session);
        maill.setFrom(ConfigUtil.getString("username"));
        try {
            message.setSubject(maill.getSubject());//邮件主题
            message.setContent(maill.getContent(),maill.getContentType());// 邮件正文, 第一个参数是内容，第二个参数是内容的类型
            message.setFrom(maill.getFrom()); // 邮件发送者

            message.setRecipients(Message.RecipientType.TO,maill.getTo());//普通发送
            message.setRecipients(Message.RecipientType.CC,maill.getCc());//抄送
            message.setRecipients(Message.RecipientType.BCC,maill.getBcc());//密送
            Transport transport = session.getTransport();
            transport.connect();
            transport.sendMessage(message,message.getAllRecipients());
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new Thread(new Runnable() {
            public void run() {
                Maill mail = new Maill();
                mail.setSubject("放假啦");
                mail.setContent("8天<a href='http://baidu.com'>进入网站</a>" +
                        "<img src='http://b.hiphotos.baidu.com/zhidao/pic/item/a5c27d1ed21b0ef47a3cc0a7dbc451da80cb3e76.jpg' />");
                mail.setContentType("text/html;charset=utf-8");
                mail.setTo("173321123@qq.com,1281313538@qq.com");
                mail.setCc("173321123@qq.com,1281313538@qq.com");
                mail.setBcc("173321123@qq.com,1281313538@qq.com");
                MaillUtill.SendMaill(mail);
            }
        }).start();
    }
}
