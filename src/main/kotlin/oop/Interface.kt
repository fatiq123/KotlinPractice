package oop

//In Kotlin, an interface is a blueprint for a class that defines a set of methods and properties that
//a class must implement. It allows multiple classes to share the same interface, which promotes code
// reusability and maintainability. Interfaces provide a way to achieve abstraction and polymorphism.

//Here's an example of an interface in Kotlin:

interface Shape {
    fun getArea(): Double
    fun getPerimeter(): Double
}

class Rectangle(private val width: Double, private val height: Double) : Shape {
    override fun getArea(): Double {
        return width * height
    }

    override fun getPerimeter(): Double {
        return 2 * (width + height)
    }
}

class Circle(private val radius: Double) : Shape {
    override fun getArea(): Double {
        return Math.PI * radius * radius
    }

    override fun getPerimeter(): Double {
        return 2 * Math.PI * radius
    }
}

//In this example, the Shape interface defines two abstract methods getArea() and getPerimeter().
// The Rectangle and Circle classes implement the Shape interface and provide their own implementations
// for the abstract methods.

//Interfaces in Kotlin can also have default implementations for methods.
// This allows interfaces to provide a default behavior for methods that can be overridden by
// implementing classes if needed.

//Here's an example of an interface with a default implementation in Kotlin:
interface Logger {
    fun log(message: String) {
        println("LOG: $message")
    }
}

class MyClass : Logger {
    // no need to implement the log() method since it has a default implementation
}

fun main() {
    val myClass = MyClass()
    myClass.log("Hello, world!")
}

//In this example, the Logger interface defines a method log() with a default implementation that prints
// a message to the console. The MyClass class implements the Logger interface but does not override the
// log() method since it is not necessary. When the log() method is called on an instance of MyClass,
// the default implementation defined in the Logger interface is used.

//In summary, an interface in Kotlin is a blueprint for a class that defines a set of methods and properties
// that a class must implement. It allows multiple classes to share the same interface and provides a way
// to achieve abstraction and polymorphism. Interfaces can also have default implementations for methods.
