fun main() {
    // KOTLIN IS STRICTLY TYPED PROGRAMMING LANGUAGE SO HERE Mutable and Immutable items
    // are of great extent FOR EXAMPLE lists are immutable cannot be changed.
    // But we can make them mutable and can change by list making them mutable
    val items = listOf<String>("apple","banana","mango","orange","grapes")
    for (item in items){
        println(item)
    }
    println("\r")   // for new line
    val num = mutableListOf<Int>(1,2,3,4,5)
    num[0] = 0
    for (numbers in num.indices){

        if (numbers == 3){
            break
        }
        println(numbers)
    }

    println("\r")

    val array = arrayOf("a","b","c")
    for (i in array.indices){
        println(array[i])
    }

    for ((index,value) in array.withIndex()){
        println("the element at $index is $value")
    }

    if (-1 !in (0..array.lastIndex)){
        println("-1 is out of range")
    }
    if (array.size !in  array.indices){
        println("list size is out of valid list indices range, too")
    }

    println("\r")

    for (i in 6 downTo 0 step 2){
        println(i)
    }

    println("\r")

    // While loop

    var index = 0
    while (index < num.size){
        println("item at $index is ${num[index]}")
        index++
    }

    // do while
    var name = 0
    do {
        println("my name is do-while")
        name++
    }while (name < 3)


    //////////////////
    println("\r")
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))

    println("\r")
    println(check(5))

}

// when  expression
fun describe(obj:Any):String =
    when(obj){
        1 -> "one"
        "hello" -> "greeting"
        is Long -> "not a string instead it is long value"
        !is String -> "not a string"
        else    -> "unknown"
    }
fun check(obj:Any){
    when(obj){
        in 1..10 -> println("x is in range")
        !in 10..20 -> println("x is outside of range")
        else -> println("none of the above")
    }
}
