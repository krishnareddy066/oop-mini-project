class Book{

  String _title;
  String _author;
  String _bookId;
  bool _isAvailable=true;

  Book(this._title, this._author, this._bookId);

  String get title => _title;
  String get author => _author;
  String get bookId => _bookId;
  bool get isAvailable => _isAvailable;

  void issueBook(){
   _isAvailable=false;
  }
  void returnBook(){
    _isAvailable=true;
  }



}
