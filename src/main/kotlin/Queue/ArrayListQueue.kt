package Queue

class ArrayListQueue<E> : Queue<E> {

    private val queue = arrayListOf<E>()

    override val count: Int
        get() = queue.size

    override val isEmpty: Boolean
        get() = count == 0

    override fun dequeue(): E? {
        return if (isEmpty) null
               else queue.removeAt(0)
    }

    override fun enqueue(element: E): Boolean {
        return queue.add(element)
    }

    override fun peek(): E? = queue.getOrNull(0)    // like top function of stack
}