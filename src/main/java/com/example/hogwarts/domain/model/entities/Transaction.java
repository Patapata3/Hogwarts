package com.example.hogwarts.domain.model.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {
    @ManyToOne
    private User author;
    private int points;
    @ManyToOne
    private User recipient;

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }
}
