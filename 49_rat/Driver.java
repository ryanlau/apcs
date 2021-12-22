public class Driver {
  public static void main(String[] args) {
      Rational r = new Rational(2,3); //Stores the rational number 2/3
      Rational s = new Rational(1,2); //Stores the rational number 1/2
      System.out.println(r.compareTo(s));
      s.add(r);
      //tests for compareTo
      System.out.println(r.compareTo(s));
      System.out.println(r.compareTo(r));
      //Below tests cause error
      //System.out.println(r.compareTo(1));
      Integer i = 1;
      //System.out.println(r.compareTo(i));
      //System.out.println(r.compareTo("hi"));
      //System.out.println(r.compareTo(0.1));
      System.out.println("\n\n\n");
      //tests for equals
      System.out.println(r.equals(s));
      System.out.println(r.equals(r));
      System.out.println(r.equals(1));
      System.out.println(r.equals("hi"));
      System.out.println(r.equals(0.1));

      }
}
