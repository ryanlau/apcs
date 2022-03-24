// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 80: Generically Speaking
// 2022-03-24r
// time spent: 0.5 hrs

/***
 * class DLLNode v1
 * Implements a node, for use in lists and other container classes.
 * Stores a T as cargo.
 **/

public class DLLNode<T>
{
  private T _cargo;    //cargo may only be of type T
  private DLLNode<T> _nextNode, _prevNode; //pointers to next, prev DLLNodes


  // constructor -- initializes instance vars
  public DLLNode( T value, DLLNode prev, DLLNode next )
  {
    _cargo = value;
    _nextNode = next;
    _prevNode = prev;
  }


  //--------------v  ACCESSORS  v--------------
  public T getCargo() { return _cargo; }

  public DLLNode<T> getNext() { return _nextNode; }

  public DLLNode<T> getPrev() { return _prevNode; }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public T setCargo( T newCargo )
  {
    T foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public DLLNode<T> setNext( DLLNode newNext )
  {
    DLLNode<T> foo = getNext();
    _nextNode = newNext;
    return foo;
  }

  public DLLNode<T> setPrev( DLLNode newPrev )
  {
    DLLNode<T> foo = getPrev();
    _prevNode = newPrev;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString() { return _cargo.toString(); }


  //main method for testing
  public static void main( String[] args )
  {
    //Below is an exercise in creating a linked list...

 /*********************
    //Create a node
    DLLNode first = new DLLNode( "cat", null );

    //Create a new node after the first
    first.setNext( new DLLNode( "dog", null ) );

    //Create a third node after the second
    first.getNext().setNext( new DLLNode( "cow", null ) );

    DLLNode temp = first; 
    while( temp != null ) {
      System.out.println( temp );
      temp = temp.getNext();
    }
   ***********************/
  }//end main

}//end class DLLNode
