package com.zl.Maill;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 * Created by Administrator on 2017/9/22.
 */
public class Maill {

    private String from;
    private String subject;
    private String content;
    private String contentType;
    private String to;
    private String cc;

    public InternetAddress getFrom() {
        try {
            return InternetAddress.parse(from)[0];
        } catch (AddressException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setFrom(String from) {
        this.from=from;
    }

    public String getSubject() {

        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public InternetAddress[] getTo() {
        try {
            return InternetAddress.parse(to);
        } catch (AddressException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public InternetAddress[] getCc() {
        try {
            return InternetAddress.parse(cc);
        } catch (AddressException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public InternetAddress[] getBcc() {
        try {
            return InternetAddress.parse(bcc);
        } catch (AddressException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    private String bcc;
}
