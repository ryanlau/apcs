### Interface methods in order of importance and simplicity

**Important**
* void addFirst(E element)
* void addLast(E element)
* E getFirst()
* E getLast()
* E removeFirst()
* E removeLast()
* int size()

**Less important**
* boolean contains(E element)
* E peekFirst()
* E peekLast()
* Iterator\<E\> iterator()

### Design decisions
* We implemented the add methods first so that we can make sure our deque isn't empty when we test it.
* We chose to encapsulate a LinkedList because it provided the same methods that were in our interface.
