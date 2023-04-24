package oop

//Abstraction is a fundamental concept in object-oriented programming that allows the essential features
// of an object to be represented without exposing the details of its implementation. In other words,
// it provides a way to define an interface for a class or group of classes without specifying the
// implementation details.

//In Kotlin, abstraction is implemented through the use of abstract classes and interfaces.
// Abstract classes are classes that cannot be instantiated and may contain one or more abstract methods,
// which are methods without an implementation. Abstract classes can also have non-abstract methods
// with an implementation. On the other hand, interfaces are like abstract classes but only contain
// abstract methods and cannot have any implementation.

//Here's an example of an abstract class in Kotlin:

abstract class Animal2 {
    abstract fun makeSound()

    fun sleep() {
        println("The animal is sleeping")
    }
}

class Dog2 : Animal2() {
    override fun makeSound() {
        println("The dog barks")
    }

}


//In this example, the Animal class is an abstract class with an abstract method makeSound()
// and a non-abstract method sleep(). The Dog class extends the Animal class and provides an
// implementation for the makeSound() method.

//Here's an example of an interface in Kotlin:

interface Animal3 {
    fun makeSound()
}

class Dog3 : Animal3 {
    override fun makeSound() {
        println("The dog barks")
    }
}

//In this example, the Animal interface defines an abstract method makeSound().
//The Dog class implements the Animal interface and provides an implementation for the makeSound() method.

//In summary, abstraction is a fundamental concept in object-oriented programming that allows the
// essential features of an object to be represented without exposing the details of its implementation.
// In Kotlin, abstraction is implemented through the use of abstract classes and interfaces.
// Abstract classes are classes that cannot be instantiated and may contain one or more abstract methods,
// while interfaces are like abstract classes but only contain abstract methods and cannot have any implementation.
