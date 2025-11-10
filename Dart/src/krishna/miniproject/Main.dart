import 'Book.dart';
import 'FacultyUser.dart';
import 'Library.dart';
import 'StudentUser.dart';
import 'User.dart';

void main(){
  Library l=Library();
  Book b1=Book("DSA", "XYZ", "B01");
  l.addBook(b1);
  Book b2=Book("JAVA", "ABC", "B02");
  l.addBook(b2);
  Book b3=Book("DBMS", "PQR", "B03");
  l.addBook(b3);
  Book b4=Book("OS", "KLM", "B04");
  l.addBook(b4);
  User u;
  u=StudentUser("krishna", "S101", "CSE");
  l.issueBook("B01", u);
  u=FacultyUser("raja", "F101", "OS");
  l.issueBook("B04", u);

  l.returnBook("B01");
  l.returnBook("B04");

  l.showAvailableBooks();

}