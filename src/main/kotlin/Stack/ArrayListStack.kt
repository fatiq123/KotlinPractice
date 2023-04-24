package Stack

import java.util.*

class ArrayListStack<E> : Stack<E> {

    private var stack : ArrayList<E> = ArrayList()
    // stack variable will include the properties of arrayList which is used to implement stack
    // also arrayList is Dynamic can be increase and decrease
    // push and pop are constant time in complexity
    override fun push(element: E) {
        stack.add(element)
    }

    override fun pop(): E {
        val poppedElement = top()
        stack.remove(poppedElement)
        return poppedElement
    }

    override fun top(): E {
        if(stack.isEmpty()){
            throw EmptyStackException()
        }
        return stack[stack.lastIndex]
    }

    override fun isEmpty(): Boolean {
        return stack.isEmpty()
    }

    override fun size(): Int {
        return stack.size
    }
}