// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 84: Stack: What Is It Good For?
// 2022-03-29w
// time spent: 0.7hrs

/*
 * DISCO
 * Stacks are useful for reversing Strings.
 *
 * QCC
 * Is there a "smarter" way to implement match?
 * What other applications is the Stack used for?
 */


/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

public class LatKtS
{

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    Latkes stack = new Latkes(s.length());
    for (int i = 0; i < s.length(); i++) {
        stack.push(s.substring(i, i+1));
    }

    String flipped = "";

    while (!stack.isEmpty()) {
        flipped += stack.pop();
    }

    return flipped;
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/
  public static boolean allMatched( String s )
  {
    Latkes stack = new Latkes(s.length());
    for (int i = 0; i < s.length(); i++) {
        String letter = s.substring(i, i+1);
        if (letter.equals("(") || letter.equals("{") || letter.equals("[")) {
            stack.push(letter);
        } else {
            String open = stack.pop();
            if (open == null) return false;
            if (!match(open, letter)) return false;
        }
    }

    return stack.isEmpty();
  }

  public static boolean match(String open, String close) {
      if (open.equals("{")) {
          return close.equals("}");
      } else if (open.equals("(")) {
          return close.equals(")");
      } else if (open.equals("[")) {
          return close.equals("]");
      }
      return false;
  }


  //main method to test
  public static void main( String[] args )
  {
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class
