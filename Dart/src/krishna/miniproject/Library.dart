import 'Book.dart';
import 'User.dart';

class Library {
  List<Book> _books = [];

 Library(){
   
 }
 
 void addBook(Book book){
   _books.add(book);
   print("Book added: ${book.title}");
 }

 void removeBook(String bookId){
   for(int i=0;i<_books.length;i++){
     if(_books[i].bookId==bookId){
       print("Book removed: ${_books[i].title}");
       _books.removeAt(i);
       return;
     }
   }
   print("Book not found");
 }

 void issueBook(String bookId, User u){

   for(int i=0;i<_books.length;i++){
     if(_books[i].bookId==bookId){
       if(_books[i].isAvailable==true){
         print("Bood issued to ${u.userId} : ${_books[i].title}");
         _books[i].issueBook();
         return;
       }
       else{
         print("Book already issued");
         return;
       }
     }
   }
   print("Book not found");
 }

 void returnBook(String bookId){
   
   for(int i=0;i<_books.length;i++){
     if(_books[i].bookId==bookId){
       if(_books[i].isAvailable==false){
         print("Book returned: ${_books[i].title}");
         _books[i].returnBook();
         return;
       }
       else{
         print("Book was not issued");
         return;
       }
     }
   }
   print("Book not found");
 }

  void showAvailableBooks() {
   bool found=false;
    for(int i=0;i<_books.length;i++){
      if(_books[i].isAvailable){
        found=true;
        print("Title: ${_books[i].title}, Author: ${_books[i].author}, ID: ${_books[i].bookId}");
      }
    }
    if(found==false){
      print("No Books Available");
    }
  }


}
