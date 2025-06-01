package com.feedback;

public class Feedback {
    private String name;
    private String email;
    private String comments;

    public Feedback(String name, String email, String comments) {
        this.name = name;
        this.email = email;
        this.comments = comments;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getComments() { return comments; }
}
