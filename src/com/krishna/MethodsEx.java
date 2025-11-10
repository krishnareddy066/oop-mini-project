package com.krishna;

public class MethodsEx {

    void display(){
        greet();
        System.out.println("HELLO WORLD");
    }
    static void greet(){

        System.out.println("iam in greet method");

    }
    void hello(){
        System.out.println("welcome krishna");

    }

    public static void main(String[] args) {

        MethodsEx obj= new MethodsEx();
        obj.display();

    }
}
