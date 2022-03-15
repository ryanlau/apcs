// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 76: We Got a Little Ol' Convoy
// 2022-03-14t
// time spent: 0.7hrs
// KtS consumed: 3

/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/


/*
 * DISCO:
 * We chose to initalize the _head in add since it we were able to directly assign it the right cargo.
 * The keyword throw can only be called on a Throwable.
 *
 * QCC:
 * Is it possible to initalize the _head in the constructor?
 * What is a Throwable?
 */

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    // YOUR CODE HERE
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    // YOUR CODE HERE
    if (_size == 0) {
        _head = new LLNode(newVal, null);
        _size++;
        return true;
    }

    LLNode tmp = _head;
    while (tmp.getNext() != null) {
        tmp = tmp.getNext();
    }
    tmp.setNext(new LLNode(newVal, null));
    _size++;

    return true;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    // YOUR CODE HERE
    LLNode tmp = _head;
    for (int i = 0; i < index; i++) {
        tmp = tmp.getNext();
    }
    return tmp.getCargo();
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    // YOUR CODE HERE
    LLNode nodeAtIndex = _head;
    for (int i = 0; i < index; i++) {
        nodeAtIndex = nodeAtIndex.getNext();
    }

    String ret = nodeAtIndex.getCargo();
    nodeAtIndex.setCargo(newVal);

    return ret;
  }


  //return number of nodes in list
  public int size()
  {
    // YOUR CODE HERE
    return _size;
  }

  //--------------^  List interface methods  ^--------------



  // override inherited toString
  public String toString()
  {
    // YOUR CODE HERE
    if (_size == 0) {
        return "[]";
    }

    String ret = "[";
    LLNode tmp = _head;
    while (tmp != null) {
        ret += tmp.getCargo() + ", ";
        tmp = tmp.getNext();
    }
    return ret.substring(0, ret.length() - 2) + "]";
  }


  //main method for testing
  public static void main( String[] args )
  {
    LList james = new LList();
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class LList
