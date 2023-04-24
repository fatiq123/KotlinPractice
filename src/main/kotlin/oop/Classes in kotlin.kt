package oop

//In Kotlin, a class is a blueprint or template for creating objects that have common properties and behaviors.
//It consists of data members (fields or properties) and member functions (methods). Constructors are special
//functions that are called when an object is created from a class. They are used to initialize
//the properties of the object.

//Kotlin has two types of constructors: primary constructor and secondary constructor.

//---> 1. Primary Constructor
//The primary constructor is defined in the class header and is part of the class declaration.
//It is used to initialize the properties of the class. Here's an example:


//              class Person(val name: String, var age: Int) {        // this is simple class
//                           // code goes here
//               }


//In this example, the Person class has a primary constructor that takes two parameters:
//name of type String (a read-only property) and age of type Int (a mutable property).
//The primary constructor is defined in the class header after the class name.


//----->Initializing Properties in Primary Constructor
//We can initialize the properties of the class in the primary constructor by declaring them
//as constructor parameters. Here's an example:

class Person(private val name: String, private var age: Int){
    init {
        println("Person object created with name $name and age $age")
    }
}

//In this example, the properties name and age are declared as constructor parameters
//in the primary constructor. The init block is used to execute the code that initializes
//the properties when an object is created from the class.


// -----> 2. Secondary Constructor
//The secondary constructor is defined inside the class body and is used to provide additional ways
//of creating objects from the class. Here's an example:

//                    class Person(val name: String, var age: Int) {
//                        constructor(name: String) : this(name, 0) {
//                            println("Person object created with name $name and age $age")
//                        }
//                    }

//In this example, the Person class has a secondary constructor that takes one parameter name of type String.
//It calls the primary constructor using the this keyword with name as the first argument and 0 as
//the default value for age. The secondary constructor also includes an initialization code that
//prints a message to the console.


// ----->Calling a Secondary Constructor
//We can call a secondary constructor from another constructor of the same class using the
//this keyword followed by the required parameters. Here's an example:

//                        class Person(val name: String, var age: Int){
//                            constructor(name: String): this(name,0){
//                                println("Person object created with name $name and age $age")
//                            }
//
//                            constructor(): this("fatiq hussnain"){
//                                println("Object created with default values")
//                            }
//                        }

//In this example, the Person class has another secondary constructor that takes no parameters.
//It calls the secondary constructor with one parameter using the this keyword and the default value for age.
//It also includes an initialization code that prints a message to the console.



//  ------> SUMMARY
//In summary, Kotlin classes are used to create objects that have common properties and behaviors.
//They can have a primary constructor and/or one or more secondary constructors.
//Primary constructors are defined in the class header and are used to initialize the properties of the class.
//Secondary constructors are defined in the class body and provide additional ways of creating objects from the class.
//We can call a secondary constructor from another constructor of the same
//class using the this keyword followed by the required parameters.

