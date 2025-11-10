package com.krishna;

public class StaticBlock {

    static int a=5;
    static int b;
// this block only runs once when the first object is created i.e when the class is loaded
    static{
        System.out.println("iam in the static block");
        b=4*a;
    }

    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);

        StaticBlock.b+=3;
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);
        // even after creating the obj2 the static {} method does not executes , hence the "iam in static block prints only once"
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);
    }
}
