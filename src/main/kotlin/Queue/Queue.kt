package Queue

interface Queue<E> {

    val count : Int

    val isEmpty : Boolean

    fun peek() : E?

    fun enqueue(element: E) : Boolean

    fun dequeue() : E?
}