// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 88: BPC Kiddies Do Not Wait in Line Either
// 2022-04-05t
// time spent: 0.5hrs

/*
 * DISCO
 *  0. We needed to create a "normal" dequeue method for sample() or else we would get a StackOverflowError since sample() calls dequeue() which calls sample().
 *  1. The runtime of sample() ranges from O(1) to O(n) depending on the random number.
 *  2. Jing likes Joshua, Ryan likes DK, and Corina likes Woozi.
 *
 * QCC
 *  0. Is there a way to use the same dequeue method for sample?
 */

/***
 * class RQueue
 * SKELETON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/


public class RQueue<SWASHBUCKLE> implements Queue<SWASHBUCKLE>
{
  //instance variables
  private LLNode<SWASHBUCKLE> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue()
  {
      _front = _end = null;
      _size = 0;
  }


  public void enqueue( SWASHBUCKLE enQVal )
  {
        LLNode<SWASHBUCKLE> newVal = new LLNode<SWASHBUCKLE>(enQVal, null);
        if (_end == null){
            _end = newVal;
            _front = newVal;
        }
        else{
            _end.setNext(newVal);
            _end = _end.getNext();
        }
        _size++;
  }//O(1)


  // remove and return thing at front of queue
  // assume _queue ! empty
  public SWASHBUCKLE dequeue()
  {
      sample();
      SWASHBUCKLE retVal = _front.getCargo();
      _front = _front.getNext();
      if (_front == null){
          _end = null;
      }

      _size--;
      return retVal;
  }//O(1) best case, O(n) worst case


  public SWASHBUCKLE peekFront()
  {
    return _front.getCargo();
  }//O(1)


  // remove and return thing at front of queue
  // assume _queue ! empty
  public SWASHBUCKLE normalDequeue()
  {
      SWASHBUCKLE retVal = _front.getCargo();
      _front = _front.getNext();
      if (_front == null){
          _end = null;
      }

      _size--;
      return retVal;
  }//O(1)

  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   0. Generate a random number in the range [0, _size)
   *   1. For that random number of times, dequeue an element and instantly requeue it.
   **/
  public void sample ()
  {
      int rand = (int) (Math.random() * (_size - 1));
      for (int i = 0; i < rand; i++)
          this.enqueue(this.normalDequeue());
  }//O(1) best case, O(n) worst case


  public boolean isEmpty()
  {
    return _front == null;
  } //O(1)


  // print each node, separated by spaces
  public String toString()
  {
        String ret = "FRONT ";
        LLNode<SWASHBUCKLE> tmp = _front;

        while (tmp != null) {
            ret += tmp.getCargo() + " ";
            tmp = tmp.getNext();
        }

        return ret + " BACK";
  }//end toString()



  //main method for testing
  public static void main( String[] args )
  {

    Queue<String> seventeen = new RQueue<String>();

    System.out.println("\nnow enqueuing..."); 
    seventeen.enqueue("s.coups");
    seventeen.enqueue("jeonghan");
    seventeen.enqueue("joshua");
    seventeen.enqueue("jun");
    seventeen.enqueue("hoshi");
    seventeen.enqueue("wonwoo");
    seventeen.enqueue("woozi");
    seventeen.enqueue("dk");
    seventeen.enqueue("mingyu");
    seventeen.enqueue("the8");
    seventeen.enqueue("seungkwan");
    seventeen.enqueue("vernon");
    seventeen.enqueue("dino");

    System.out.println("\nnow testing toString()..."); 
    System.out.println( seventeen ); //for testing toString()...

    System.out.println("\nnow dequeuing..."); 
    System.out.println( seventeen.dequeue() );
    System.out.println( seventeen.dequeue() );
    System.out.println( seventeen.dequeue() );
    System.out.println( seventeen.dequeue() );
    System.out.println( seventeen.dequeue() );
    System.out.println( seventeen.dequeue() );
    System.out.println( seventeen.dequeue() );
    System.out.println( seventeen.dequeue() );
    System.out.println( seventeen.dequeue() );
    System.out.println( seventeen.dequeue() );
    System.out.println( seventeen.dequeue() );
    System.out.println( seventeen.dequeue() );
    System.out.println( seventeen.dequeue() );

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n"); 
    System.out.println( seventeen.dequeue() );

      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    
    Queue<String> PirateQueue = new RQueue<String>();

    System.out.println("\nnow enqueuing..."); 
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");

    System.out.println("\nnow testing toString()..."); 
    System.out.println( PirateQueue ); //for testing toString()...

    System.out.println("\nnow dequeuing..."); 
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n"); 
    System.out.println( PirateQueue.dequeue() );

      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue
