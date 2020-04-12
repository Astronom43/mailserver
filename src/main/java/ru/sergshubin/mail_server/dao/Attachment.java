package ru.sergshubin.mail_server.dao;

import javax.persistence.Embeddable;

@Embeddable
public class Attachment {
    private String name;
    private byte[] body;
    private Type type;
}
