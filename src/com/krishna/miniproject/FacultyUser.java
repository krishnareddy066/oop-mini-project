package com.krishna.miniproject;

public class FacultyUser extends User {
    private String subject;

    public FacultyUser(String name, String userId, String subject) {
        super(name, userId);
        this.subject = subject;
    }
    @Override
    public void showDetails(){
        System.out.println("Name: "+ name);
        System.out.println("User Id: "+ userId );
        System.out.println("Subject: "+subject);
    }

}
