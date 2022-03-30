// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 85: Leon Leonwood Stack
// 2022-03-30h
// time spent: 0.7hrs

/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    //Stack<String> cakes = new ALStack<String>();
    Stack<String> cakes = new LLStack<String>();
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    cakes.push("corina");
    cakes.push("jing");
    cakes.push("ryan");
    System.out.println(cakes.peekTop());
    while (!cakes.isEmpty())
        System.out.println(cakes.pop());
    System.out.println(cakes.isEmpty());

    //...

  }//end main

}//end class
