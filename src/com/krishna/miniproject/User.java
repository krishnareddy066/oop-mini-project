package com.krishna.miniproject;

abstract class User {
    protected String name;
    protected String userId;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }
    abstract void showDetails();

}
