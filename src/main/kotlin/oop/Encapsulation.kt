package oop

//Encapsulation is a fundamental concept in object-oriented programming that refers to the practice
//of hiding implementation details and exposing only necessary information through a well-defined interface.
//In Kotlin, encapsulation is achieved through the use of access modifiers.


//Kotlin provides the following access modifiers to control the visibility of properties and methods:
//
//1. public: The default visibility modifier that allows access from anywhere within the same module or package.
//
//2. private: Limits the visibility to the class or file in which the property or method is defined.
//
//3. protected: Limits the visibility to the class and its subclasses.

//4. internal: Allows access from anywhere within the same module.

//Here's an example of how to use access modifiers to encapsulate properties and methods in Kotlin:

class person5{

    var name:String = ""
        private set

    fun setName(name: String){
        this.name = name
    }

    private fun privateMethod(){
        // implementation details
    }
}

//In this example, the Person class has a name property that is publicly accessible, but its setter
//is marked as private to restrict external modification. The setName method is public and allows setting
//the value of name from outside the class. The privateMethod method is marked as private to restrict
//access to the implementation details of the class.

//By using access modifiers, we can control the visibility of properties and methods in a class,
//which helps to maintain a clear separation of concerns and minimize the risk of unintended side
//effects caused by external modification of internal state. This, in turn, leads to more robust
//and maintainable code.