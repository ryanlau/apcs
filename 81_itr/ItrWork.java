// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 81: Thank You, Next
// 2022-03-24r
// time spent: 0.5 hrs

/*
 * DISCO
 * Iterators are cool.
 * .remove() can only be called once per call of .next().
 *
 * Q/C/C
 * What other Lists other than ArrayLists exist?
 * Why do we need to typecast the return value of .next()?
 * What is an optional operation?
 */

/***
 * class ItrWork
 *  SKELETON
 * Facilitates familiarization with iterators
 **/

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItrWork
{

  //using FOREACH loop
  //returns a boolean to indicate whether key is present in L
  public static boolean foundA( Integer key,
                                List<Integer> L )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    for (Integer i: L) {
        if (key.equals(i)) {
            return true;
        }
    }
    return false;
  }

  //explicitly using an iterator
  //returns a boolean to indicate whether key is present in L
  public static boolean foundB( Integer key,
                                List<Integer> L )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    Iterator it = L.iterator();
    while (it.hasNext()) {
        if (it.next().equals(key)) {
            return true;
        }
    }
    return false;
  }

  //using FOREACH loop
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsA( List<Integer> L )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    ArrayList<Integer> odds = new ArrayList<Integer>();
    for (Integer i: L) {
        if (i % 2 == 1) {
            odds.add(i);
        }
    }
    return odds;
  }

  //explicitly using an iterator
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsB( List<Integer> L )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    ArrayList<Integer> odds = new ArrayList<Integer>();
    Iterator it = L.iterator();
    while (it.hasNext()) {
        Integer i = (Integer) it.next();
        if (i % 2 == 1) {
            odds.add(i);
        }
    }
    return odds;
  }


  //explicitly using an iterator
  //modifies L s.t. it contains no evens
  public static void removeEvens( List<Integer> L )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    Iterator it = L.iterator();
    while (it.hasNext()) {
        if ((Integer) it.next() % 2 == 0) {
            it.remove();
        }
    }
  }


  public static void main( String [] args )
  {

    //var type: ArrayList   obj type: Integer
    ArrayList<Integer> L = new ArrayList<Integer>();

    for( int i = 0; i < 10; i++ )
      L.add(i);


    // TASK: write code to print the contents of L...

    // a) using a FOREACH loop
    System.out.println("printing L with a FOREACH loop");
    for (Integer i: L) System.out.println(i);

    // b) explicitly using an iterator
    System.out.println("\nprinting L with an iterator");
    Iterator it = L.iterator();
    while (it.hasNext()) {
        Integer i = (Integer) it.next();
        System.out.println(i);
    }

    System.out.println("\nTesting foundA...");
    System.out.println("9 in L? -> " + foundA(9,L) );
    System.out.println("13 in L? -> " + foundA(13,L) );

    System.out.println("\nTesting foundB...");
    System.out.println("9 in L? -> " + foundB(9,L) );
    System.out.println("13 in L? -> " + foundB(13,L) );

    System.out.println("\nTesting oddsA...");
    List<Integer> A = oddsA(L);
    for( int n : A ) System.out.println(n);

    System.out.println("\nTesting oddsB...");
    List<Integer> B = oddsB(L);
    for( int n : B ) System.out.println(n);

    System.out.println("\nTesting removeEvens...");
    removeEvens(L);
    for( int n : L ) System.out.println(n);
    /*~~~~~~~~~~~~~~~m~o~v~e~~m~e~~d~o~w~n~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main

}//end class ItrWork
