// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 77: Insert | Remove
// 2022-03-15w
// time spent: 1 hrs
// KtS consumed: 3.5


/**
 QCCS:
 - Why does chaining work????

 DISCOS:
 - We can do `rem = temp1.getNext().getCargo();` --> We can chain stuffs!

 ADD ALGO:
 - if index is 0, then we add at the head
 - else, traverse until index-1 and then insert the added there

 REMOVE ALGO:
 - set temp to index - 1
 - save index of the one you're removing and then link index-1 to index+1

**/

/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 ***/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
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
    LLNode tmp = new LLNode( newVal, _head );
    _head = tmp;
    _size++;
    return true;
  }

  public void add( int index, String newVal ) {
    LLNode temp = _head;

    if ( index == 0 ) {
      add(newVal);
    }
    else {
      for ( int i = 0; i < index - 1; i++ ) {
        temp = temp.getNext();
      }
      temp.setNext( new LLNode( newVal, temp.getNext() ) );
    }
    _size ++;
  }

  public String remove( int index ) {
    LLNode temp1 = _head;
    String rem = "";


    for ( int i = 0; i < index - 1; i++ ) {
      temp1 = temp1.getNext();
    }

    rem = temp1.getNext().getCargo();

    temp1.setNext(temp1.getNext().getNext());

    _size --;

    return rem;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    String retVal;
    LLNode tmp = _head; //create alias to head

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

    LLNode tmp = _head; //create alias to head

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

  //--------------^  List interface methods  ^--------------


  // override inherited toString
  public String toString()
  {
    String retStr = "HEAD->";
    LLNode tmp = _head; //init tr
    while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
    }
    retStr += "NULL";
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

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );

    james.add( 2, "banana" );
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.remove( 2 );
    System.out.println( james );
    System.out.println( "size: " + james.size() );

  }

}//end class LList
