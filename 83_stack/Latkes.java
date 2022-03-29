// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 83: Stacks on Stacks
// 2022-03-29t
// time spent: 0.7hrs

/***
 * class Latkes
 * v1
 * SKELETON
 * Implements a stack of Strings using an encapsulated array
 **/

/***
    DISCO
    - Expanding the array is necessary so borrowed from ArrayList functions

    QCC
    - Is there any other necessary functions?
 **/


public class Latkes
{
  private String [] _stack;
  private int _stackSize;


  //constructor
  public Latkes( int initCapacity )
  {
    _stackSize = 0;
    _stack = new String[initCapacity];
  }// O(1)

  //helper for expanding array
  private void expand()
  {
    String[] temp = new String[ _stack.length * 2 ];
    for( int i = 0; i < _stack.length; i++ )
      temp[i] = _stack[i];
    _stack = temp;
  }


  //means of insertion
  public void push( String s )
  {
    if ( isFull() ) {
      expand();
    }
    _stack[_stackSize] = s;
    _stackSize += 1;
  }// O(1)


  //means of removal
  public String pop( )
  {
    if ( isEmpty() ) {
      return null;
    }
    String temp = _stack[_stackSize - 1];
    _stack[_stackSize - 1] = null;
    _stackSize -= 1;
    return temp;
  }// O(1)


  //chk for emptiness
  public boolean isEmpty()
  {
    return _stackSize == 0;
  }// O(1)


  //chk for fullness
  public boolean isFull()
  {
    return _stackSize == _stack.length;
  }// O(1)


  //main method for testing
  public static void main( String[] args )
  {
    Latkes tastyStack = new Latkes(10);
    tastyStack.push("aoo");
    tastyStack.push("boo");
    tastyStack.push("coo");
    tastyStack.push("doo");
    tastyStack.push("eoo");
    tastyStack.push("foo");
    tastyStack.push("goo");
    tastyStack.push("hoo");
    tastyStack.push("ioo");
    tastyStack.push("joo");
    tastyStack.push("coocoo");
    tastyStack.push("cachoo");
    //cachoo
    System.out.println( tastyStack.pop() );
    //coocoo
    System.out.println( tastyStack.pop() );
    //joo
    System.out.println( tastyStack.pop() );
    //ioo
    System.out.println( tastyStack.pop() );
    //hoo
    System.out.println( tastyStack.pop() );
    //goo
    System.out.println( tastyStack.pop() );
    //foo
    System.out.println( tastyStack.pop() );
    //eoo
    System.out.println( tastyStack.pop() );
    //doo
    System.out.println( tastyStack.pop() );
    //coo
    System.out.println( tastyStack.pop() );
    //boo
    System.out.println( tastyStack.pop() );
    //aoo
    System.out.println( tastyStack.pop() );
    //stack empty by now; SOP(null)
    System.out.println( tastyStack.pop() );
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main()

}//end class Latkes
