package com.krishna.inheritence;

public class Manager extends  Employee{
    String department;

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }
    @Override
    public void showDetails(){
        System.out.println("iam in child class");
        System.out.println("name :" +super.name + "\n salary : "+super.salary + "\n department :" +department);
    }

}
