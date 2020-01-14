package com.ceocho.kakaotalk.Model;

public class User {

    private String id;
    private String username;
    private String imageURL;
    private String status;
    private String search;

    public User(String id, String username, String imageURL, String Status, String search) {
        this.id = id;
        this.username = username;
        this.imageURL = imageURL;
        this.status = status;
        this.search = search;
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

    public String getSearch() { return search; }
    public void setSearch(String search) { this.search = search; }

}
