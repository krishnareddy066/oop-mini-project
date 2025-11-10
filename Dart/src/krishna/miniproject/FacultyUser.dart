import 'User.dart';

class FacultyUser extends User{

  String _subject;

  FacultyUser(String name, String userId, String subject)
      : _subject=subject,
        super(name, userId);

  @override
  void showDetails(){
    print("Name: $name");
    print("User Id: $userId");
    print("Subject: $_subject");
  }

}
