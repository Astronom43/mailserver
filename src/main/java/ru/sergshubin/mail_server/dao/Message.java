package ru.sergshubin.mail_server.dao;

import javax.persistence.*;
import java.util.List;

@Entity
public class Message {
    @Id
    @GeneratedValue()
    private long id;
    @Column(name = "email_from")
    private String from;
    @ElementCollection
    @Column(name = "email_to")
    private List<String> to;
    private String subj;
    private String text;
    @ElementCollection
    private List<Attachment> attachments;

    public Message( String from, List<String> to, String subj, String text) {
        this.from = from;
        this.to = to;
        this.subj = subj;
        this.text = text;
    }

    public Message() {
    }
}
