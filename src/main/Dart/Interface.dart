//In dart there is no keyword interface but you can use class or abstract class to declare an interface.
//All classes implicitly define an interface. Mostly abstract class is used to declare an interface.

// abstract class as interface
abstract class CalculateTotal {
  int total();
}
// abstract class as interface
abstract class CalculateAverage {
  double average();
}
// implements multiple interfaces
class Student implements CalculateTotal, CalculateAverage {
// properties
  int marks1, marks2, marks3;
// constructor
  Student(this.marks1, this.marks2, this.marks3);
// implementation of average()
  @override
  double average() {
    return total() / 3;
  }
// implementation of total()
  @override
  int total() {
    return marks1 + marks2 + marks3;
  }
}



// creating an interface using concrete class   <------
class Laptop {
  // method
  turnOn() {                      //  these are dynamic functions
    print('Laptop turned on');
  }
  // method
  turnOff() {
    print('Laptop turned off');
  }
}

class MacBook implements Laptop {
  // implementation of turnOn()
  @override
  turnOn() {
    print('MacBook turned on');
  }

  // implementation of turnOff()
  @override
  turnOff() {
    print('MacBook turned off');
  }
}



void main() {
  Student student = new Student(90, 80, 70);
  print('Total marks: ${student.total()}');
  print('Average marks: ${student.average()}');


  var macBook = MacBook();
  macBook.turnOn();
  macBook.turnOff();
}