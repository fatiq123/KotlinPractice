package Queue

fun main() {

    val stringQueue:Queue<String> = ArrayListQueue()
    val intQueue:Queue<Int> = ArrayListQueue()

    intQueue.enqueue(1)
    intQueue.enqueue(2)
    intQueue.enqueue(3)
    println("Top: ${intQueue.peek()}")  // this will display 1 in queue but in stack it will 3
    intQueue.dequeue()
    intQueue.dequeue()
    println("Top: ${intQueue.peek()}")
}