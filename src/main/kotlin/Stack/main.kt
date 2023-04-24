package Stack

fun main() {

    val stringStack : Stack<String> = ArrayListStack()

    stringStack.push("my name is fatiq")
    stringStack.push("my name is ali")
    println("Top: ${stringStack.top()}") // my name is ali will print
    println("Top: ${stringStack.push("element 1")}")
    println("Top: ${stringStack.top()}")    // now element 1 will be printed

}