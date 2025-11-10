import 'User.dart';

class StudentUser extends User{

  String _course;

  StudentUser(String name, String userId,String course) :
        _course=course,
        super(name,userId);

  @override
  void showDetails(){
    print("Name: $name");
    print("User Id: $userId");
    print("Course: $_course");
  }


}