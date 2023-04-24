private class Rectangle(private var height:Double,private var length:Double){
    var perimeter = (height+length)*2
}
class Person(val name:String,var age:Int){
    // simple class with constructor
}
class Person1(name: String,age: Int){
    val Name:String
    var Age:Int

    init {
        Name = name
        Age = age
        println("name is: $Name")
        println("Age is: $Age")
    }
}
class SecondaryClassExample{
    constructor(id:Int){

    }
    constructor(name: String,id: Int){
        println("Name = $name")
        println("id = $id")
    }
}

//We can also use both primary and secondary constructor in a same class.
//By using primary as well secondary constructor in same class, secondary constructor
// needs to authorize to primary constructor. Authorization to another constructor in
// same class is done using this() keyword.
class Mixture(password:String){
    constructor(name: String,id: Int,password: String):this(password){
        println("name is: $name")
        println("id is: $id")
        println("password is: $password")
    }
}

class SecondaryToSecondary{
    constructor(name: String,id: Int,password: String){
        println("this executes first")
        println("Name = $name")
        println("Id = $id")
        println("Password = $password")
    }

    constructor(name: String,id: Int):this(name,id, password = "123"){
        println("this executes next")
        println("Name = $name")
        println("Id = $id")
    }
}

open class SuperSecondaryToSecondary{
    constructor(name: String,id: Int,password: String){
        println("this executes first")
        println("Name = $name")
        println("Id = $id")
        println("Password = $password")
    }
    constructor(name: String,id: Int):this(name,id,"password"){
        println("this executes third")
        println("Name = $name")
        println("Id = $id")
    }
}
class SuperSecondaryToSecondary2:SuperSecondaryToSecondary{
    constructor(name: String,id: Int):super(name, id){
        println("this executes second")
        println("Name = $name")
        println("Id = $id")
    }
    constructor(name: String,id: Int,password: String):super(name, id, password){
        println("this executes forth")
        println("Name = $name")
        println("Id = $id")
        println("Password = $password")
    }
}
fun main(){
    // Rectangle class
    val rectangle = Rectangle(5.0,2.0)
    println("the perimeter is ${rectangle.perimeter}")
    // Person class
    val person1 = Person("fatiq",19)  // we can also make this in class
    println("Name = ${person1.name}")
    println("Age = ${person1.age}")
    // Person1 class
    val person2 = Person1("Fatiq",19)

    // Secondary class example
    println("\r") // \r return carriage means new line instead of \n
    val sec1 = SecondaryClassExample("fatiq",1)

    // Mixture of both primary and secondary constructors
    println("\r")
    val mix = Mixture("fatiq",1,"123")

    // SecondaryToSecondary constructor example
    println("\r")
    println("SecondaryToSecondary Constructor Example")
    val STS = SecondaryToSecondary("fatiq",10)
//    val STS = SecondaryToSecondary("fatiq",1,"123")   can be used as this

    // Secondary to Secondary constructor with super class
    println("\r")
    val obj1 = SuperSecondaryToSecondary(name = "fatiq", id = 0)

}
// read-only property using keyword val
// read-write property using keyword var