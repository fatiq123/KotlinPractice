package oop

//Inheritance is a fundamental concept in object-oriented programming that allows a class to inherit
//the properties and behavior of another class. In Kotlin, inheritance is implemented using the : symbol
//after the class name, followed by the name of the parent class. The class that inherits from another
//class is called the subclass, while the class that is inherited from is called the superclass.

// Here's an example of how to use inheritance in Kotlin:
open class Animal(val name: String, val age: Int) {
    open fun makeSound() {
        println("The animal makes a sound")
    }
}

class Dog(name: String, age: Int) : Animal(name, age) {
    override fun makeSound() {
        println("The dog barks")
        //super.makeSound()
    }

}

//In this example, the Animal class is the superclass and has two properties name and age,
//as well as a method makeSound(). The Dog class is the subclass and inherits the properties
//and method of the Animal class. It also overrides the makeSound() method to provide a
//specific implementation for the Dog class.

//To inherit from a class in Kotlin, the superclass must be marked as open, and the methods that can
//be overridden must be marked as open. The subclass can override the open methods using the override keyword.
//In addition, the subclass can call the constructor of the superclass using the super() function.

//In summary, inheritance is a powerful mechanism in object-oriented programming that allows for code
//reuse and the creation of hierarchical relationships between classes. Kotlin supports inheritance
//through the use of the : symbol to declare a class as a subclass of another class, and the use of the open,
//override, and super() keywords to control the behavior of inherited properties and methods.