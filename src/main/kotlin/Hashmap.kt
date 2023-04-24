fun main() {
    val myName = hashMapOf<String,String>("Fatiq" to "Hussnain")
    var names = hashSetOf<String>("ali","fatiq","hamid")

    myName.forEach { println(it.key) }
    println()
    myName.forEach { println(it.value)  }
    println()
    for (name in myName){
        println(name.key)
        println(name.value)
    }

    println()
    names.removeIf { element -> element != "ali" } // is ma only ali hi aya ga if found in set
    for (name in names){            // remove elements from set except from ali i.e if they are not ali
        println(name)
    }



    println()
    val hash = hashMapOf<Int,String>(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    for (printValues in hash){
        println(printValues.key)
        println(printValues.value)
    }
    hash.remove(1)
    println()
    for ((key,value) in hash){
        println("$key to $value")
    }
}