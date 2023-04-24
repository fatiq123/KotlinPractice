package oop

//In Kotlin, a lambda expression is a way to define a block of code that can be passed around and executed
// later. It is a shorthand notation for creating an anonymous function, which is a function without a name.

//Here's an example of a lambda expression in Kotlin:
val sum = { a: Int, b: Int -> a + b }
//In this example, the sum variable is assigned a lambda expression that takes two integer
// parameters a and b and returns their sum.


//Lambda expressions can be used in various ways in Kotlin, such as:

//1. As function parameters:
fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

val result = performOperation(10, 5) { a, b -> a - b }

//In this example, the performOperation function takes two integer parameters a and b and a lambda expression
// parameter operation of type (Int, Int) -> Int, which is a function that takes two integers and returns
// an integer. The function returns the result of executing the operation lambda expression on the a and b
// parameters. The result variable is assigned the value of calling performOperation with the a and b
// parameters and a lambda expression that subtracts b from a.


//2. As a variable or constant:
val printMessage = { message: String -> println(message) }

//printMessage("Hello, world!")

//In this example, the printMessage variable is assigned a lambda expression that takes a string parameter
//message and prints it to the console. The lambda expression is then executed by calling the printMessage
//variable with the "Hello, world!" parameter.


//3. As a member of a class:
class Calculator1 {
    val add: (Int, Int) -> Int = { a, b -> a + b }
    val sub: (Int, Int) -> Int = { a, b -> a - b }
}

val calculator1 = Calculator()
val result1 = calculator1.add(10, 5)
//val result2 = calculator1.sub(10, 5)


//In this example, the Calculator class has two lambda expression properties add and subtract of
// type (Int, Int) -> Int, which are functions that take two integers and return an integer.
// The calculator variable is assigned an instance of the Calculator class.
// The result1 variable is assigned the value of calling the add lambda expression on the calculator instance
// with the 10 and 5 parameters, while the result2 variable is assigned the value of calling
// the sub lambda expression on the calculator instance with the 10 and 5 parameters.

//In summary, a lambda expression in Kotlin is a shorthand notation for creating an anonymous function.
// It can be used in various ways, such as function parameters, variables or constants, and members of a class.


