package com.sndpwrites.chatapp;

public class chatMessage {
    private String username,message,photoUrl;
    public chatMessage(){}
    public chatMessage(String username, String message, String photoUrl) {
        this.username = username;
        this.message = message;
        this.photoUrl = photoUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getMessage() {
        return message;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
