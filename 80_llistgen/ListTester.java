// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 80: Generically Speaking
// 2022-03-24r
// time spent: 0.5 hrs

/***
 * class ListTester
 * ...for putting your LList through its paces
 *
 * Assumes local List.java (interface),
 *  overriding List interface from standard Java library
 **/

public class ListTester
{
  public static void main( String[] args )
  {

    LList<Integer> lol = new LList<Integer>();
    lol.add(10);
    lol.add(20);
    lol.add(30);
    System.out.println(lol);

    // not Integer, not compilable!
    // lol.add("ten");

    LList<String> jing = new LList<String>();
    jing.add("jing");
    jing.add("corina");
    jing.add("ryan");
    System.out.println(jing);

    LList gangless = new LList();
    gangless.add("hi");
    gangless.add(34);
    System.out.println(gangless);

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class
