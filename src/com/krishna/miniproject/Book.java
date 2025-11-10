package com.krishna.miniproject;

public class Book {
    private String author;
    private String title;
    private String book_id;
    private boolean isAvailable=true;

    public Book(String author, String title, String book_id) {
        this.author = author;
        this.title = title;
        this.isAvailable = true;
        this.book_id = book_id;
    }

//    Methods:
//getTitle(), getAuthor(), getBookId()
//isAvailable()
//issueBook() → sets isAvailable = false
//returnBook() → sets isAvailable = true
    public String getAuthor() {
        return author;
    }

    public String getTitle(){
        return title;
    }

    public String getBookId(){
        return book_id;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void issueBook(){
        isAvailable=false;
    }
    public void returnBook(){
        isAvailable=true;
    }

}
