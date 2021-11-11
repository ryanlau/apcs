// src: https://github.com/ap251/library/blob/7683fdc4335ab2d50ce702825d03f23325f77b7e/23_Coin/Coin.java

/***
 *  class Coin
 *  by Clyde "Thluffy" Sinclair
 ***/

public class Coin {

  //attributes aka instance vars
  private double value;
  private String upFace, name;
  private int flipCtr, headsCtr, tailsCtr;
  private double bias = .5;


  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond: return newly minted Coin
   ***/
  public Coin() {
    reset( "heads", 0.5 );
  }


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin( String s ) {
    this();
    name = s;
    assignValue(s);
  }

  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
    this(s);
    upFace = nowFace;
  }

  
  // Accessors...
  // ----------------------------
  public String getUpFace() {
    return upFace;
  }

  public int getFlipCtr() {
    return flipCtr;
  }

  public double getValue() {
    return value;
  }

  public int getHeadsCtr() {
    return headsCtr;
  }

  public int getTailsCtr() {
    return tailsCtr;
  }
  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
  private double assignValue( String s ) {
    if ( name.equals("penny") ) {
      value = 0.01;
    }
    else if ( name.equals("nickel") ) {
      value = 0.05;
    }
    else if ( name.equals("dime") ) {
      value = 0.1;
    }
    else if ( name.equals("quarter") ) {
      value = 0.25;
    }
    else if ( name.equals("half dollar") ) {
      value = 0.5;
    }
    else if ( name.equals("dollar") ) {
      value = 1;
    }
    return value;
  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {
    flipCtr = 0;
    tailsCtr = 0;
    headsCtr = 0;
    upFace = s;
    bias = d; //add chk for validity
  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  public String flip() {
    double randDbl = Math.random();

    if ( randDbl < bias ) {
      upFace = "heads";
      headsCtr += 1;
    }
    else {
      upFace = "tails";
      tailsCtr += 1;
    }

    flipCtr += 1;

    return upFace;
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
    return upFace.equals( other.upFace );
  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
    return "" + name + " -- " + upFace;
  }

}//end Coin class