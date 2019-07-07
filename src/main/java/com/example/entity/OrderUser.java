package com.example.entity;

public class OrderUser extends Order {
    //一对一
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
