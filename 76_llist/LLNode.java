// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 76: We Got a Little Ol' Convoy
// 2022-03-14t
// time spent: 0.7hrs
// KtS consumed: 3

/***
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

public class LLNode
{
  //instance vars
  private String cargo;
  private LLNode next;

  // constructor
  public LLNode( String value, LLNode next )
  {
    this.cargo = value;
    this.next = next;
  }


  //--------------v  ACCESSORS  v--------------
  public String getCargo()
  {
    return this.cargo;
  }

  public LLNode getNext()
  {
    return next;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public String setCargo( String newCargo )
  {
    String oldCargo = cargo;
    cargo = newCargo;
    return oldCargo;
  }

  public LLNode setNext( LLNode newNext )
  {
    LLNode oldNext = next;
    next = newNext;
    return oldNext;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return "[" + this.cargo + ", " + this.next + "]";
  }


  //main method for testing
  public static void main( String[] args )
  {

    //Below is an exercise in creating a linked list...

    //Create a node
    LLNode first = new LLNode( "cat", null );
    System.out.println(first);

    //Create a new node after the first
    first.setNext( new LLNode( "dog", null ) );
    System.out.println(first);


    //Create a third node after the second
    first.getNext().setNext( new LLNode( "cow", null ) );
    System.out.println(first);

    /* A naive list traversal, has side effects.... ??
       while( first != null ) {
       System.out.println( first );
       first = first.getNext();
       }
    */

    //Q: when head ptr moves to next node in list, what happens to the node it just left?
    // Original node is no longer first because there is nothing point to it anymore.

    //...so better: ?
    LLNode hold = first;

    while( hold != null ) {
      System.out.println( hold );
      hold = hold.getNext();
      System.out.println( hold );
    }
    //System.out.println( hold );

  }//end main

}//end class LLNode
