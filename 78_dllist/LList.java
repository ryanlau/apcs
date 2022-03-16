// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 78: Double Up
// 2022-03-16r
// time spent: 0.5 hrs
// KtS consumed: 2


/**
 * DISCO:
 * - The add and remove methods work without modification
 * - For loops with a one line body do not need {}s
 *
 * QCC:
 * - Do we need to use doubly-linked nodes for add and remove? Is it necessary?
 * - In what circumstances would we need to use a doubly linked list rather than a singly linked one?
 *
 * ADD ALGO:
 * - if index is 0, then we add at the head
 * - else, traverse until index-1 and then insert the added there
 *
 * REMOVE ALGO:
 * - set temp to index - 1
 * - save index of the one you're removing and then link index-1 to index+1
 */


/*****************************************************
 * class LList
 * Implements a linked list of DLLNodes, each containing String data
 * new in v2: add-at-index, remove
 *****************************************************/

public class LList implements List //your List interface must be in same dir
{ 

  //instance vars
  private DLLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = null; //at birth, a list has no elements
    _size = 0;
  }


  //--------------v  List interface methods  v--------------
    
  public boolean add( String newVal )
  {
    DLLNode tmp = new DLLNode( newVal, _head , null);
    _head = tmp;
    _size++;
    return true;
  }

    
  public String get( int index )
  {
    if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();

    String retVal;
    DLLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
	    tmp = tmp.getNext();

    //check target node's cargo hold
    retVal = tmp.getCargo();
    return retVal;
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();

    DLLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
	    tmp = tmp.getNext();

    //store target node's cargo
    String oldVal = tmp.getCargo();

    //modify target node's cargo
    tmp.setCargo( newVal );

    return oldVal;
  }


  //return number of nodes in list
  public int size() { return _size; }
    

  //insert a node containing newVal at position index
  public void add( int index, String newVal ) {

    if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();


    //if index==0, insert node before head node
    if ( index == 0 ) 
	    add( newVal );
    else {
	    DLLNode tmp = _head; //create alias to head

	    //walk to node before desired node
	    for( int i=0; i < index-1; i++ )
            tmp = tmp.getNext();
        
        DLLNode newNode = new DLLNode( newVal, null, tmp );

	    //insert new node
	    newNode.setNext( tmp.getNext() );
	    tmp.setNext( newNode );

	    //increment size attribute
	    _size++;
    
      }
  }


  //remove node at pos index, return its cargo
  public String remove( int index ) {

    if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();

    String retVal;
    DLLNode tmp = _head; //create alias to head

    //if index==0, remove head node
    if ( index == 0 ) {
	    //check target node's cargo hold
	    retVal = _head.getCargo();

	    //remove target node
	    _head = _head.getNext();	    
    }
    else {
	    //walk to node before desired node
	    for( int i=0; i < index-1; i++ )
        tmp = tmp.getNext();

	    //check target node's cargo hold
	    retVal = tmp.getNext().getCargo();

	    //remove target node
	    tmp.setNext( tmp.getNext().getNext() );
    }

    //decrement size attribute
    _size--;

    return retVal;
  }

  //--------------^  List interface methods  ^--------------


  // override inherited toString
  public String toString()
  {
    String retStr = "NULL";

    if (_size == 0) {
        return retStr;
    }

    DLLNode tmp = _head; //init tr
    while( tmp != null ) {
	    retStr += "<=>" + tmp.getCargo();
	    tmp = tmp.getNext();
    }
    retStr += "<=>NULL";
    return retStr;
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

    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );
    System.out.println( james );

    james.add(0,"whut");
    System.out.println( "...after add(0,whut): " );
    System.out.println( james );

    james.add(4,"phat");
    System.out.println( "...after add(4,phat): " );
    System.out.println( james );

    System.out.println( "...after remove last: " 
                        + james.remove( james._size-1) );
    System.out.println( james );

    System.out.println( "...after remove(0): " + james.remove(0) );
    System.out.println( james );

    System.out.println( "...after remove(0): " + james.remove(0) );
    System.out.println( james );

    System.out.println( "...after remove(0): " + james.remove(0) );
    System.out.println( james );
  }

}//end class LList


