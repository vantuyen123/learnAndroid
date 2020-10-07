package com.example.demoandroid.adapter.user;

public class User {
    private String username,name,password,address;
    private int avatar;

    public User(String username,String name,String password,String address,int avatar){
        this.username = username;
        this.name = name;
        this.password = password;
        this.address = address;
        this.avatar = avatar;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public int getAvatar() {
        return avatar;
    }
}
