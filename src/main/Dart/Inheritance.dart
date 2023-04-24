class human{
  String? name = null;
  int? age = 0;
  String? _country = null;

  human(String name, int age){
    this.name = name;
    this.age = age;
  }

  void printInfo(){
    print("Name of Person is: $name");
    print("Age of Person is: $age");
  }
}


class animal extends human{
  animal(super.name, super.age);    // simple is constructor sa hi kam ho gaye ga bas parameters pas karna han main function ma sa
  //animal(String name,int age) : super('Pigeon', 1);

  // String? name = null;
  // int? age = 0;
  String? origin;

  // animal(String name,int age) : super('', 0){
  //   this.name = name;
  //   this.age = age;
  // }
  set country(String? __country) {
    // TODO: implement _country
    super._country = __country;
  }


  void printInfo(){
    print("Name of animal is: $name");
    print("Age of animal is: $age");
    print("Country name is: $_country");
  }
}