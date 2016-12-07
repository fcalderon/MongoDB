package com.calderon.database.mongdb.model;

/**
 * Created on 12/7/16.
 */
public class Note {
    private User user;
    private String body;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
