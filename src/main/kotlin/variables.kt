fun main(){

    var bbb:Int = 0
    bbb = 1

    // variables
    val a:Int = 1 // immediate assignment
    val b = 2   // `Int` type is inferred
    val c:Int  // Type required when no initializer is provided
    c = 3   // deferred assignment

    // variables that can be assigned using VAR keyword
    var d = 1
    d += 1  // d=d+1 but it supports this d += 1
    println(a)
    println(c)

    val nonChangeable:Int
    nonChangeable = 4
//    nonChangeable = 3
    // val cannot be resigned again above line gives error if i uncomment it

    var changeAble:Int
    changeAble = 5
    changeAble = 6
    // so we can reassign var again and again


    /////////////////
    val capital = "england" to "london"
    val(country,city) = capital
    val capitals = listOf("england" to "london","poland" to "warsaw")
    capitals.forEach { (country,city) ->
        println("capital of $country is $city")
    }
    // using forEach loop
    capitals.forEach { (country,city) ->
        println("capital of $country is $city") }

    var title:Any = "kotlin"
    title = 12

    for (i in 1..5){
        println(i)
    }
    println("\r")
    for (i in 5 downTo  1){
        println(i)
    }
    println("\r")
    for (i in 3..6 step 2){
        println(i)
        // 3 5
    }
    println("\r")
    for (i in 9 downTo 1 step 3){
        println(i)
        // 963 each time step down by 3
    }


    val list = mutableListOf(1,2,3,4,5)
    list[0] = 0

}

val PI = 3.14
var x = 0
fun incrementX(){
    x += 1
}



