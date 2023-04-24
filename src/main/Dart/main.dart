
import 'Abstraction.dart';
import 'Class.dart';
import 'Encapsulation.dart';
import 'Inheritance.dart';
import 'Interface.dart';
import 'Ploymorphism.dart';

void main(){

  // simple class
  person p = new person("Fatiq", 20);
  p.printInfo();
  print("\n");

  // encapsulation
  bank b = new bank();
  //setters
  b.setBankName("Punjab Bank");
  b.setBankLocation("Muridke");
  b.setBankAmount(10000);
  //getters
  print("Bank name is: ${b.getBankName()}");
  print("Bank location is: ${b.getBankLocation()}");
  print("Bank totalAmount is: ${b.getBankAmount()}");
  print("\n");

  // inheritance
  human h = new human("man", 0);
  h.printInfo();
  animal a = new animal("Tiger", 5);
  a.printInfo();
  a.country = "pakistan";     // high concept
  a.printInfo();
  print("\n");

  // abstraction
  Rectangle rectangle = Rectangle(10, 20);
  rectangle.area();
  Triangle triangle = Triangle(10, 20);
  triangle.area();
  print("\n");

  // polymorphism
  Manager manager = new Manager();
  Developer developer = new Developer();
  manager.salary();
  developer.salary();
  print("\n");


  // interface
  // student student = new student(90, 80, 70);
  // print('Total marks: ${student.total()}');
  // print('Average marks: ${student.average()}');
  //
  // var macBook = MacBook();
  // macBook.turnOn();
  // macBook.turnOff();         //   implementation in interface file
}