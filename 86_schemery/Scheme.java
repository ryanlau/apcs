// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 86: What a Racket
// 2022-03-31f
// time spent: 1.0hrs

/***
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Split expression into tokens.
 *   2. Create two stacks, one for operations, and one for numbers and closing parentheses.
 *   3. Parse over tokens from right to left, adding the tokens to their respective stacks.
 *   4. If we get a opening parentheses, check the most recent operation and call unload() with the corresponding op number and numAndParens as the numbers parameter.
 *   5. Return the remaining number/answer in the stack.
 *
 * STACK OF CHOICE: ALStack by TiNPiG?
 * b/c we don't believe that ALStack has any benefit over LLStack or "ArrayStack", we just choose it at random.
 **/


/*
 * DISCO
 * Remove closing parenthesis from stack when the inner operation is performed.
 * It was more beneficial to parse the expression from the right.
 *
 * QCC
 * Is there actually an advantage over choosing one of the implementations of Stack?
 */

public class Scheme
{
  /***
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and 
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   **/
  public static String evaluate( String expr )
  {
    String[] stuff = expr.split("\\s+");
    Stack<String> ops = new ALStack<String>();
    Stack<String> numAndParens = new ALStack<String>();

    for (int i = stuff.length - 1; i >= 0; i--) {
        // System.out.println("stuff[i] " + stuff[i]);

        if (stuff[i].equals("+") || stuff[i].equals("-") || stuff[i].equals("*")) {
            ops.push(stuff[i]);
        } else {
            if (stuff[i].equals("(")) {
                String op = ops.pop();
                if (op.equals("+")) numAndParens.push(unload(1, numAndParens));
                else if (op.equals("-")) numAndParens.push(unload(2, numAndParens));
                else if (op.equals("*")) numAndParens.push(unload(3, numAndParens));
            } else {
                numAndParens.push(stuff[i]);
            }
        }
    }

    /*
    System.out.println("PRINTING OUT NUM AND PARENS CONTENTS:");
    while ( !numAndParens.isEmpty() ) {
      System.out.println( numAndParens.pop() );
    }
    */

    return numAndParens.pop(); 
  }//end evaluate()


  /***
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   **/
  public static String unload( int op, Stack<String> numbers )
  {
      int answer = Integer.parseInt(numbers.pop());

      if (op == 1) {
          while (!numbers.peekTop().equals(")")) {
              answer += Integer.parseInt(numbers.pop());
          }
      } else if (op == 2) {
          while (!numbers.peekTop().equals(")")) {
              answer -= Integer.parseInt(numbers.pop());
          }
      } else if (op == 3) {
          while (!numbers.peekTop().equals(")")) {
              answer *= Integer.parseInt(numbers.pop());
          }
      }

      if (numbers.peekTop().equals(")")) numbers.pop();

      // System.out.println("UNLOAD: " + answer);

      return answer + "";
  }//end unload()


  /*
  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
  try {
  Integer.parseInt(s);
  return true;
  }
  catch( NumberFormatException e ) {
  return false;
  }
  }
  */


  //main method for testing
  public static void main( String[] args )
  {

      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7

      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17

      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29

      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      //...-4
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main()

}//end class Scheme
