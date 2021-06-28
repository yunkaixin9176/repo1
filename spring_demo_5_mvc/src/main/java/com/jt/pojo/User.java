package com.jt.pojo;

public class User {
    private Integer  id;
    private String  username;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
