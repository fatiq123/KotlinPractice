fun main(args: Array<String>) {
    println("Hello World!")
    sum(1,2)    // this line will not print as we are not printing the function value
    println(sum(1,2))
    println("sum of 5+5 is: ${sum1(5,5)}")
    sum2(-1,8)
    println("\r")
    println("max of two numbers is ${maxOf(-2,-1)}")

}
fun sum(a: Int,b:Int): Int {
    return a+b
}
fun sum1(a: Int,b: Int) = a + b

fun sum2(a: Int,b: Int){
    println("sum of $a and $b is ${a+b}")
}
fun maxOf(a:Int,b: Int):Int{    // function to find maximum of two values
    return if (a > b){
        a   // latest suggested technique from intelli J idea
    }
    else{
        b
    }
}