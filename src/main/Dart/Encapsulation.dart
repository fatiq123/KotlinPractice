//The reason is that using underscore (_) before a variable or method name makes it library private not
// class private. It means that the variable or method is only visible to the library in which it is declared.
// It is not visible to any other library. In simple words, library is one file. If you write the main method
// in a separate file, this will not work.
//    ------> SOLUTION <-------
//To see private properties in action, you must create a separate file for the class and import it into the main file.
class bank{
  String? _bankName = null;  // Or we can also write as ------> late String _bankName;
  // we use ? and = null to check weather the input is null  ---> null checking other wise
  // we have to add late keyword with name or we should initialize it
  String? _bankLocation = null;
  int? _totalBankAmount = 0;

  String? getBankName(){
    return this._bankName;
  }
  void setBankName(String bankName){
    this._bankName = bankName;
  }


  String? getBankLocation(){
    return this._bankLocation;
  }
  void setBankLocation(String bankLocation){
    this._bankLocation = bankLocation;
  }


  int? getBankAmount(){
    return this._totalBankAmount;
  }
  void setBankAmount(int newBankAmount){
    this._totalBankAmount = newBankAmount;
  }
}



// agar mera main function isi file ma hota to muja class ka priavte members ki bi access thi aur usa ham
// library kahta.  lakin ab ma na new file bnai ha main ka nam sa jis ma main function ha ab hama
// wahan (_) wala private members ki access ni ho gi .
// very important concept ya dart ma hi ha shaid



//Read-only Properties
// You can control the properties’s access and implement the encapsulation in the dart by using the read-only
// properties. You can do that by adding the final keyword before the properties declaration.
// Hence, you can only access its value, but you cannot change it.

//Note: Properties declared with the final keyword must be initialized at the time of declaration.
// You can also initialize them in the constructor.

class Student {
  final _schoolName = "ABC School";

  String getSchoolName() {
    return _schoolName;
  }
}

void main() {
  var student = Student();
  print(student.getSchoolName());
  // This is not possible
  //student._schoolname = "XYZ School";

  // ab ham schoolName access ni kar sakta kyu ka wo final ha aur is bar ham library file ma hi han.
}