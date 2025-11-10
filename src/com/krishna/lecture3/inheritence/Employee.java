package com.krishna.lecture3.inheritence;

public class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public void showDetails(){
        System.out.println("iam in super class");
        System.out.println("name :" + name + "\n salary : "+salary);
    }
}
