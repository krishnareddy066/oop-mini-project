package com.krishna.miniproject;

public class Main {
    public static void main(String[] args) {
        // create library
        // add books
        // create StudentUser + FacultyUser
        // issue and return books
        // show available books
        Library l=new Library();
        Book p=new Book("XYZ","DSA","B01");
        l.addBook(p);
        Book q=new Book("ABC","JAVA","B02");
        l.addBook(q);
        Book r=new Book("KLM","DBMS","B03");
        l.addBook(r);

        User u;
        u=new StudentUser("krishna","S101","CSE");
        l.issueBook("B01",u);
        u=new StudentUser("tharun","S102","EEE");
        l.issueBook("B01",u);
        l.returnBook("B01");

        l.showAvailableBooks();

        u=new FacultyUser("raja","F101","OS");
        Book o=new Book("EFG","OPERATING SYS","B04");
        l.addBook(o);
        l.issueBook("B04",u);


    }
}
