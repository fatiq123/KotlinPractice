class person{
  String? name = null;
  int? age = 0;

  person(String name, int age){
    this.name = name;
    this.age = age;
  }

  void printInfo(){
    print("Name of Person is: $name");
    print("Age of Person is: $age");
  }
}