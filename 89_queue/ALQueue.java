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

import java.util.ArrayList;

public class ALQueue<QUASAR> implements Queue<QUASAR> {

  ArrayList<QUASAR> _queue;

  public ALQueue() {
    _queue = new ArrayList<QUASAR>();
  }

  public QUASAR dequeue() {
    return _queue.remove(0);
  }

  public void enqueue(QUASAR x) {
    _queue.add(_queue.size(), x);
  }

  public boolean isEmpty() {
    return _queue.isEmpty();
  }

  public QUASAR peekFront() {
    return _queue.get(0);
  }
  public static void main(String[] args) {
    Queue<String> seventeen = new ALQueue<String>();

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
    //System.out.println( seventeen.dequeue() );

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n");
    System.out.println( seventeen.dequeue() );
  }

}
