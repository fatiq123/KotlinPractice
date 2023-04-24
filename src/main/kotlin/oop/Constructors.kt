package oop

// Primary Constructor
class person(val name: String, var age: Int){

}

// Secondary Constructor
class person1{
    private var name: String = ""
    private var age: Int = 0

    // Secondary Constructor ma ham var and val ni lkh sakta
    // And we cannot assign val to this
    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }
}

// Constructor Delegation
class person2(val name: String, val age: Int) {
    constructor(name: String) : this(name, 0)
}
