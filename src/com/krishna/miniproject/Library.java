package com.krishna.miniproject;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(){
        books=new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added: "+book.getTitle());

    }
        public void removeBook(String bookId){
            for(int i=0;i<books.size();i++){
                if(books.get(i).getBookId().equals(bookId)){
                    System.out.println("book removed: "+books.get(i).getTitle());
                    books.remove(i);
                    return;
                }
            }
            System.out.println("book not found");
        }

        public void issueBook(String bookId, User user){
            for(int i=0;i<books.size();i++){
                if(books.get(i).getBookId().equals(bookId)){
                    if(books.get(i).isAvailable()){
                        books.get(i).issueBook();
                        System.out.println("Book issued to "+user.name +":" +books.get(i).getTitle());
                        return;
                    }
                    else{
                        System.out.println("Book is already issued");
                        return;
                    }
                }

            }
            System.out.println("Book not found");
        }

    public void returnBook(String bookId) {
        for(int i=0;i<books.size();i++) {
            if (books.get(i).getBookId().equals(bookId)) {
                if (!books.get(i).isAvailable()) {
                    books.get(i).returnBook();
                    System.out.println("Book returned: " + books.get(i).getTitle());
                    return;
                } else {
                    System.out.println("Book was not issued");
                    return;
                }

            }

        }
        System.out.println("Book not found");
    }

    public void showAvailableBooks() {
        boolean found=false;
        for(int i=0;i<books.size();i++){
            if(books.get(i).isAvailable()){
                found=true;
                System.out.println("Title: "+books.get(i).getTitle()+ ",Author:" + books.get(i).getAuthor()+ ",Id: "+books.get(i).getBookId());
            }
        }
        if(found==false){
            System.out.println("no books available");
        }
    }



}
