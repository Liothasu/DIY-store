package com.bricolage.main;

import java.math.BigInteger;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Blog {
    @Id
    @GeneratedValue
    private BigInteger id;

    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name = "TYPE_ID")
    private Type type;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;
    
    public Blog(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
