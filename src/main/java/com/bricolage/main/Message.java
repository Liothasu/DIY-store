package com.bricolage.main;

import java.math.BigInteger;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Message {
    @Id
    @GeneratedValue
    private BigInteger id;

    private String content;
    private LocalDate timeMsg;

    @ManyToMany
    @JoinColumn(name = "USER_ID")
    private User user;
    
    public Message(String content, LocalDate timeMsg) {
        this.content = content;
        this.timeMsg = timeMsg;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getTimeMsg() {
        return timeMsg;
    }

    public void setTimeMsg(LocalDate timeMsg) {
        this.timeMsg = timeMsg;
    }

}
