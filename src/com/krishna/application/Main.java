package com.krishna.application;

abstract class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void showDetails();

}
class Student extends Person{
    String s_id;
    String course;
    public Student(String name,int age,String s_id, String course){
        super(name,age);
        this.s_id=s_id;
        this.course=course;

    }

    @Override
    public void showDetails(){
        System.out.println(
                "Name: "+super.name +
                "\nAge: "+super.age +
                "\nStudent Id: "+ s_id + "\nCourse : "+ course
        );
    }

}

class Teacher extends  Person{

    String teacher_id;
    String subject;

    public Teacher(String name, int age, String teacher_id, String subject) {
        super(name, age);
        this.teacher_id = teacher_id;
        this.subject = subject;
    }

    @Override
    public void showDetails(){
        System.out.println(
                "Name: "+super.name +
                        "\nAge: "+super.age +
                        "\nTeacher Id: "+ teacher_id + "\nSubject : "+ subject
        );
    }
}

public class Main {
    public static void main(String[] args) {
        Person p;
        p=new Student("Rahul",20,"S101","CSE");
        p.showDetails();
        System.out.println("\n");
        p=new Teacher("Kavya",32,"T208","Mathematics");
        p.showDetails();

    }

}
