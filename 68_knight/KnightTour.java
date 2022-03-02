// Team Gnocchi -- Hugo Jenkins (Boary), Ryan Lau (Jon), and Brian Kang (Vivian)
// APCS pd6
// HW68 -- ...and T-, Tr-, Tri-, Tries Again Until It's Done
// 2022-02-16w
// time spent: 2.0 hrs

/***
 * SKELETON
 * class KnightTour (and supporting class TourFinder)
 * Animates generation of a Knight's Tour on a square chess board.
 *
 * USAGE: (default N value: 8)
 * $ javac KnightTour.java
 * $ java KnightTour
 * $ java KnightTour [N]
 *
 * ALGO
 * Basecase: check if _solved is true, if it is, exit the program
 * Primary basecase: check if there has been n * n + 1 moves, if there is set _solved to true
 * Other basecase: Check if the move is valid by checking if the space's value is 0, if it is not, just return.
 * If none of these basecases are satisfied, attempt to move the knight to every possible location by recursively calling the method with the moves parameter increased by 1 and the x and y positions to the position of the move
 * If all of the recursive calls run without hitting a basecase, reset the current space to 0.
 *
 * DISCO
 * System.exit(0) exits out of the program and doesn't run any other future code even if it's outside the function it was called in.
 * Tests that start from the top left generally run faster than ones that start from a random position.
 *
 * QCC
 * How can we run findTour more than once since it makes use of System.exit()?
 * Is the algorithmn what the code does in English or is the code the algorithmn in code?
 *
 * Mean execution times for boards of size n*n:
 * n=5   1.2198s    across 5 executions
 * n=6   27.8766s   across 5 executions
 * n=7   ~18m       across 5 executions
 * n=8   ~25m       across 5 executions
 *
 * POSIX PROTIP: to measure execution time from BASH, use time program:
 * $ time java KnightTour 5
 *
 ***/


import java.io.*;
import java.util.*;


public class KnightTour
{
  public static void main( String[] args )
  {
    int n = 8;

    try {
      n = Integer.parseInt( args[0] );
    } catch( Exception e ) {
      System.out.println( "Invalid input. Using board size "
                          + n + "..." );
    }

    TourFinder tf = new TourFinder( n );

    //clear screen using ANSI control code
    System.out.println( "[2J" );

    //display board
    System.out.println( tf );

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for fixed starting location, use line below:
    tf.findTour( 2, 2, 1 );
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for random starting location, use lines below:
    //int startX = (int) (Math.random() * n) + 2;
    //int startY = (int) (Math.random() * n) + 2;
    //tf.findTour( startX, startY, 1 );   // 1 or 0 ?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // PUSHING FARTHER...
    // Systematically attempt to solve from every position on the board?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  }//end main()

}//end class KnightTour


class TourFinder
{
  //instance vars
  private int[][] _board;
  private int _sideLength; //board has dimensions n x n
  private boolean _solved = false;

  //constructor -- build board of size n x n
  public TourFinder( int n )
  {
    _sideLength = n;

    //init 2D array to represent square board with moat
    _board = new int[n+4][n+4];

    //SETUP BOARD --  0 for unvisited cell
    //               -1 for cell in moat
    //---------------------------------------------------------
    //for (int k = 0; k <_board.length)
    for (int row = 0; row < _board.length; row++) {
      for (int column = 0; column < _board.length; column++) {
        if ((row < 2) || (row > _board.length - 3) || (column < 2) || (column > _board.length -3)) {
          _board[row][column] = -1;
        }
      }
    }
    //---------------------------------------------------------

  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, then press ESC
    //emacs shortcut: M-x quoted-insert, then press ESC

    int i, j;
    for( i=0; i < _sideLength+4; i++ ) {
      for( j=0; j < _sideLength+4; j++ )
        retStr = retStr + String.format( "%3d", _board[j][i] );
      //"%3d" allots 3 spaces for each number
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
   * helper method to keep try/catch clutter out of main flow
   * @param n      delay in ms
   **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
   * void findTour(int x,int y,int moves) -- use depth-first w/ backtracking algo
   * to find valid knight's tour
   * @param x      starting x-coord
   * @param y      starting y-coord
   * @param moves  number of moves made so far
   **/

  public void findTour( int x, int y, int moves )
  {
    // delay(50); //slow it down enough to be followable

    //if a tour has been completed, stop animation
    if ( _solved == true ) System.exit(0);

    //primary base case: tour completed
    if ( moves == _sideLength * _sideLength + 1) {
      _solved = true;
      System.out.println( this ); //refresh screen
      return;
    }

    //other base case: stepped off board or onto visited cell
    if ( _board[x][y] != 0 ) {
      return;
    }
    //otherwise, mark current location
    //and recursively generate tour possibilities from current pos
    else {

      //mark current cell with current move number
      _board[x][y] = moves;

      System.out.println( this ); //refresh screen

      //delay(1001); //uncomment to slow down enough to view

      /******************************************
       * Recursively try to "solve" (find a tour) from
       * each of knight's available moves.
       *     . e . d .
       *     f . . . c
       *     . . @ . .
       *     g . . . b
       *     . h . a .
      ******************************************/
      findTour(x+1,y+2,moves+1);
      findTour(x+2,y+1,moves+1);
      findTour(x+2,y-1,moves+1);
      findTour(x+1,y-2,moves+1);
      findTour(x-1,y-2,moves+1);
      findTour(x-2,y-1,moves+1);
      findTour(x-2,y+1,moves+1);
      findTour(x-1,y+2,moves+1);


      //If made it this far, path did not lead to tour, so back up...
      // (Overwrite number at this cell with a 0.)
      _board[x][y] = 0;

      System.out.println( this ); //refresh screen
    }
  }//end findTour()

}//end class TourFinder
