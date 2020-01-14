package com.ceocho.kakaotalk.Model;

public class User {

    private String id;
    private String username;
    private String imageURL;
    private String status;

    public User(String id, String username, String imageURL, String Status) {
        this.id = id;
        this.username = username;
        this.imageURL = imageURL;
    }

    public User() {

    }

    public String getId() {
        return id;
    }
    public void setId() {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername() {
        this.username = username;
    }

    public String getImageURL() {
        return imageURL;
    }
    public void setImageURL() { this.imageURL = imageURL; }


    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
