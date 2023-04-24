fun main(args: Array<String>) {
   println("this is main file no code here")

   var fruits = listOf<String>("apple","banana","guava","orange")
   // we cannot add to listOf as it is immutable by default
   var fruits1 = mutableListOf<String>("apple","banana","guava","orange")
   //we can add to mutable lists
   fruits1.add("mango")


   var person = arrayOf("name","age","address")
   // we cannot add to arrayOf as it is Static
   // it can be of any type -> can be mixture of int or sting together

   var person1 = arrayListOf<String>("name","age","address")
   person1.add("country")
   // so we can add in arrayListOf as it is Dynamic
   // array list should be specified for some purpose -> string or int


   // Iteration
   fruits.forEach { println(it) }



   // create a hashmap in kotlin
   val map = HashMap<String,Int>()
   // add elements to hashmap
   map["one"] = 1
   map["two"] = 2
   map["three"] = 3
   // retrieve elements from hashmap
   val value = map["two"]
   println(value)
   //Iterate over a hashmap
   for ((key,value ) in map){
      println("$key -> $value")
   }


   //Sets in kotlin
   val set = setOf("apple","banana","orange")
   // add an element to a set
   val newSet = set.plus("kiwi")
   // check if element exists in the set
   val check = set.contains("orange")
   //Iterate over the set
   for (item in set){
      println(item)
   }
}


// 1. Primary Constructor: A primary constructor is declared in the class header and initializes the
// properties of the class. Here's an example of a class with a primary constructor:
   //class Person(val name: String, val age: Int)

// 2. Secondary Constructor: A secondary constructor is declared inside the class body and provides
// additional ways to create objects of the class. Here's an example of a class
// with a secondary constructor:
//class Person {
//   var name: String = ""
//   var age: Int = 0
//
//   constructor(name: String, age: Int) {
//      this.name = name
//      this.age = age
//   }
//}

// 3.Constructor Delegation: Constructor delegation is a way to call one constructor from
// another constructor in the same class. Here's an example of a class that uses constructor delegation:

//class Person(val name: String, val age: Int) {
//   constructor(name: String) : this(name, 0)
//}


//In summary, Kotlin provides primary constructors for initializing the properties of a class,
// secondary constructors for providing additional ways to create objects,
// and constructor delegation for calling one constructor from another constructor in the same class.

