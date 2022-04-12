// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 89: Queue Two Ways
// 2022-04-11
// time spent: 0.5hrs

/*
DISCO:
0. It takes less work to write when it's a wrapper class of LinkedList and
ArrayList because it inherits many of the already written methods.

QCC:
0. Who invented the word 'queue'? Why is it so hard to spell?
*/

/***
 * interface Queue
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 **/

public interface Queue<QUASAR>
{
  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue();

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x );

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty();

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront();
  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~

}//end interface Queue
