package com.bezkoder.spring.login.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Todo")
public class Todo {
    @Id
    private String id;

    @Column
    private String name;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "edate")
    private LocalDateTime edate;

    @Column(name = "comment")
    private String comment;

    @Column
    private Boolean completed;

    @Column
    private String user;

    public Todo() {
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDateTime(LocalDateTime date) {
        this.date = date;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Todo(String id, String name, LocalDateTime date, LocalDateTime edate, String comment, Boolean completed, String user) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.edate = edate;
        this.comment = comment;
        this.completed = completed;
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getEdate() {
        return edate;
    }

    public void setEdate(LocalDateTime edate) {
        this.edate = edate;
    }
}
