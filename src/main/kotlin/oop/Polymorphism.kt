package oop

//Polymorphism is a fundamental concept in object-oriented programming that refers to the ability of objects
//of different classes to be used interchangeably. In other words, it allows objects to take on different forms
//or behaviors depending on the context in which they are used.

//There are two main types of polymorphism in object-oriented programming: compile-time polymorphism
//(also known as method overloading) and runtime polymorphism (also known as method overriding).

//1. Compile-time Polymorphism (Method Overloading): Method overloading is a form of compile-time polymorphism
//that allows a class to have multiple methods with the same name but different parameters.
//The appropriate method to call is determined at compile time based on the number and types of arguments passed.

// Here's an example of method overloading in Kotlin:

class Calculator {
    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun add(num1: Double, num2: Double): Double {
        return num1 + num2
    }
}

//In this example, the Calculator class has two methods with the same name add, but different parameter
// types (Int and Double). Depending on the types of arguments passed at compile time, the appropriate method
// will be called.

//1. Runtime Polymorphism (Method Overriding): Method overriding is a form of runtime polymorphism that allows
//a subclass to provide a specific implementation of a method that is already defined in the superclass.
//The subclass must have the same method signature as the superclass method.

// Here's an example of method overriding in Kotlin:

open class Animal1 {
    open fun makeSound() {
        println("The animal makes a sound")
    }
}

class Dog1 : Animal1() {
    override fun makeSound() {
        println("The dog barks")
    }
}

//In this example, the Animal class has a method makeSound() that is marked as open, which allows the
// Dog class to override it with a specific implementation. The Dog class overrides the makeSound() method
// to print "The dog barks" instead of "The animal makes a sound".

//In summary, polymorphism is a powerful concept in object-oriented programming that allows objects of
// different classes to be used interchangeably. Kotlin supports polymorphism through method overloading
// and method overriding. Method overloading allows a class to have multiple methods with the same name
// but different parameters, while method overriding allows a subclass to provide a specific implementation
// of a method that is already defined in the superclass.