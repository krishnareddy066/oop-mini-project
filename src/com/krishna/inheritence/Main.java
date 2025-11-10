package com.krishna.inheritence;

public class Main {
    public static void main(String[] args) {
        Employee emp=new Employee("randy",500000);
        emp.showDetails();

        Manager manager=new Manager("john",100000,"Testing");
        manager.showDetails();
    }
}
