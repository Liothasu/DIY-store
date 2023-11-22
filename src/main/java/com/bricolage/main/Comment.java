package com.bricolage.main;

import java.math.BigInteger;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private BigInteger id;

    private String content;
    private LocalDate timeCom;


    @ManyToOne
    @JoinColumn(name = "BLOG_ID")
    private Blog blog;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;
    
    public Comment(String content, LocalDate timeCom) {
        this.content = content;
        this.timeCom = timeCom;
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

    public LocalDate getTimeCom() {
        return timeCom;
    }

    public void setTimeCom(LocalDate timeCom) {
        this.timeCom = timeCom;
    }

}
