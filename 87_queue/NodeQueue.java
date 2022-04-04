// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 87: The English Do Not Wait In Line for Soup
// 2022-04-04m
// time spent: 1.0hrs

/*
 * DISCO
 * With a singly linked node implementation, we can only enqueue from the _back since we if we wanted to dequeue from the back, we would need to traverse the whole queue to get a pointer to set the new _back to the current _back's "previous" node.
 * A QUASAR is an extremely luminous active galactic nucleus.
 * 
 * QCC
 * What are some usecases for Queues besides the ones we discussed in class?
 * Advantages for moving Node into it's own file?
 */

public class NodeQueue<QUASAR> implements Queue<QUASAR> {
    private Node<QUASAR> _front, _back;

    //means of removing an element from collection:
    //Dequeues and returns the first element of the queue.
    public QUASAR dequeue() {
        QUASAR retVal = _front.getCargo();
        _front = _front.getNext();
        if (_front == null){
            _back = null;
        }
        return retVal;
    }

    //means of adding an element to collection:
    //Enqueue an element onto the back of this queue.
    public void enqueue( QUASAR x ) {
        Node<QUASAR> newVal = new Node<QUASAR>(x, null);
        if (_back == null){
            _back = newVal;
            _front = newVal;
        }
        else{
            _back.setNext(newVal);
            _back = _back.getNext();
        }
    }

    //Returns true if this queue is empty, otherwise returns false.
    public boolean isEmpty() {
        return _front == null;
    }

    //Returns the first element of the queue without dequeuing it.
    public QUASAR peekFront() {
        return _front.getCargo();
    }

    public String toString() {
        String ret = "FRONT->";
        Node<QUASAR> tmp = _front;

        while (tmp != null) {
            ret += tmp.getCargo() + "->";
            tmp = tmp.getNext();
        }

        return ret + "BACK";
    } 

    public static void main(String[] args) {
        Queue<String> q = new NodeQueue<>();
        System.out.println(q);

        System.out.println("\nqueueing the bangtan boys");
        q.enqueue("RM");
        System.out.println(q);
        q.enqueue("JIN");
        System.out.println(q);
        q.enqueue("SUGA");
        System.out.println(q);
        q.enqueue("JHOPE");
        System.out.println(q);
        q.enqueue("JIMIN");
        System.out.println(q);
        q.enqueue("V");
        System.out.println(q);
        q.enqueue("JUNGKOOK");
        System.out.println(q);
        
        System.out.println("\ndequeueing the bangtan boys");
        while (!q.isEmpty()) {
            q.dequeue();
            System.out.println(q);
        }
    }

}


class Node<QUASAR>
{
    //instance vars
    private QUASAR _cargo;
    private Node<QUASAR> _nextNode;

    // constructor
    public Node( QUASAR value, Node<QUASAR> next )
    {
        _cargo = value;
        _nextNode = next;
    }


    //--------------v  ACCESSORS  v--------------
    public QUASAR getCargo()
    {
        return _cargo;
    }

    public Node<QUASAR> getNext()
    {
        return _nextNode;

    }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public QUASAR setCargo( QUASAR newCargo )
    {
        QUASAR foo = getCargo();
        _cargo = newCargo;
        return foo;
    }

    public Node setNext( Node<QUASAR> newNext )
    {
        Node foo = getNext();
        _nextNode = newNext;
        return foo;
    }
    //--------------^  MUTATORS  ^--------------

    public String toString(){
        return _cargo.toString();
    }

}//end class Node
