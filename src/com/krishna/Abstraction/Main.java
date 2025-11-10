package com.krishna.Abstraction;

abstract class Animal{
    void sound(){

    }

}
class dog extends Animal {

    void sound(){
        System.out.println("dog barks");
    }
}
class cat extends Animal {
    void sound(){
        System.out.println("cat meows");
    }
}
class cow extends Animal {

    void sound(){
        System.out.println("cow moos");
    }
}
public class Main {

    public static void main(String[] args) {
        Animal a;
        a = new dog();
        a.sound();
        a=new cat();
        a.sound();
        a=new cow();
        a.sound();
    }



}

