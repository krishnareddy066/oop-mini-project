package com.krishna.miniproject;

class StudentUser extends User{
    private String course;

    public StudentUser(String name, String userId, String course) {
        super(name, userId);
        this.course = course;
    }
    @Override
    public void showDetails(){
        System.out.println("Name: "+ name + "\nUser Id: "+ userId + "\nCourse: "+course);
    }
}
