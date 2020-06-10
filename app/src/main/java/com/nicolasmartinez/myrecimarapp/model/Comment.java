package com.nicolasmartinez.myrecimarapp.model;

public class Comment {

    private String uid;
    private Integer id;
    private String client;
    private String comment;
    private String state;

    public Comment() {
    }

    public Comment(String uid, Integer id, String client, String comment, String state) {
        this.uid = uid;
        this.id = id;
        this.client = client;
        this.comment = comment;
        this.state = state;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
