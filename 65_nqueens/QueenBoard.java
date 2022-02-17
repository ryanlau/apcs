// Team Gnocchi -- Hugo Jenkins (Boary), Ryan Lau (Jon), and Brian Kang (Vivian)
// APCS pd6
// HW65 -- How Many Queens Can a Thinker Place, If a Thinker Can Place Queens...
// 2022-02-16w
// time spent: 1.0 hrs

/*
DISCO:
    0. The algorithm solves board sizes of 20x20 instantly, 30x30 in a few moments, and anything above that over a minute
    1. The smallest board other than 1x1 that has a possible solutions is a 4x4

QCC:
    0. How do we generate the other 91 solutions?
*/


public class QueenBoard
{
    private int[][] _board;

    public QueenBoard( int size )
    {
        _board = new int[size][size];
    }


    /***
     * precondition: board is filled with 0's only.
     * postcondition:
     * If a solution is found, board shows position of N queens,
     * returns true.
     * If no solution, board is filled with 0's,
     * returns false.
     */
    public boolean solve()
    {
        if (solveH(0)) {
            printSolution();
            return true;
        }

        return false;
    }


    /**
     *Helper method for solve.
     */
    private boolean solveH( int col )
    {
        if (col == _board.length) {
            return true;
        }

        for (int row = 0; row < _board.length; row++) {
            if (addQueen(row, col)) {
                if (solveH(col + 1) == true) {
                    return true;
                }
                removeQueen(row, col);
            }
        }

        return false;
    }


    /***
     * Print board, a la toString...
     * Except:
     * all negs and 0's replaced with underscore
     * all 1's replaced with 'Q'
     */
    public void printSolution()
    {
        for (int[] row: _board) {
            for (int square: row) {
                if (square == 1) {
                    System.out.print("Q\t");
                } else {
                    System.out.print("_\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }



    //================= YE OLDE SEPARATOR =================


    /***
     * Adds a queen to to a given slot
     * precondition: col starts from the left most column (0) and works up to the right most (_board.length - 1). row has to be between 0 and _board.length - 1
     * postcondition: If a queen can not be placed, return false. Else, the corresponding slot to the col and row is given the value of 1. Marks all slots of the right of the quyeen where the queen can move by decrementing their values by 1.
     */
    private boolean addQueen(int row, int col)
    {
        if(_board[row][col] != 0){
            return false;
        }
        _board[row][col] = 1;
        int offset = 1;
        while(col+offset < _board[row].length){
            _board[row][col+offset]--;
            if(row - offset >= 0){
                _board[row-offset][col+offset]--;
            }
            if(row + offset < _board.length){
                _board[row+offset][col+offset]--;
            }
            offset++;
        }
        return true;
    }

    /***
     * Removes a queen from a given slot
     * precondition: row and col has to be between 0 and _board.length - 1
     * postcondition: If their is no queen, return false. Else, the corresponding slot to the row and col is given the value of 0. Marks all the slots to the right of the queen where the queen can move by incrementing the value of the slots by 1.
     */
    private boolean removeQueen(int row, int col){
        if ( _board[row][col] != 1 ) {
            return false;
        }
        _board[row][col] = 0;
        int offset = 1;

        while( col+offset < _board[row].length ) {
            _board[row][col+offset]++;
            if( row - offset >= 0 ) {
                _board[row-offset][col+offset]++;
            }
            if( row + offset < _board.length ) {
                _board[row+offset][col+offset]++;
            }
            offset++;
        }
        return true;
    }


    /***
     * Prints out the _board as it is
     * precondition: _board is initialized
     * postcondition: _board is printed and left unchanged
     */
    public String  toString()
    {
        String ans = "";
        for( int r = 0; r < _board.length; r++ ) {
            for( int c = 0; c < _board[0].length; c++ ) {
                ans += _board[r][c]+"\t";
            }
            ans += "\n";
        }
        return ans;
    }


    //main method for testing...
    public static void main( String[] args )
    {
        QueenBoard b = new QueenBoard(5);
        //System.out.println(b);
        /** should be...
          0	0	0	0	0
          0	0	0	0	0
          0	0	0	0	0
          0	0	0	0	0
          0	0	0	0	0
          */

        b.addQueen(3,0);
        b.addQueen(0,1);
        //System.out.println(b);
        /** should be...
          0	1	-1	-2	-1
          0	0	-2	0	0
          0	-1	0	-1	0
          1	-1	-1	-1	-2
          0	-1	0	0	0
          */

        b.removeQueen(3,0);
        // System.out.println(b);
        /** should be...
          0	1	-1	-1	-1
          0	0	-1	0	0
          0	0	0	-1	0
          0	0	0	0	-1
          0	0	0	0	0
          */



        QueenBoard x = new QueenBoard(4);
        x.solve();


        QueenBoard c = new QueenBoard(5);
        c.solve();

        QueenBoard d = new QueenBoard(8);
        d.solve();

        QueenBoard f = new QueenBoard(30);
        f.solve();

        QueenBoard e = new QueenBoard(50);
        e.solve();
    }

}//end class
