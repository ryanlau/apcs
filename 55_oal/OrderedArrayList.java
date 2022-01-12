// Chrysanthemum Tea: Melody Lew, Ryan Lau, Anthony Sun
// APCS pd06
// HW55: Never Fear, Big Oh Is Here!
// 2022-12-01w

/*
DISCO:
0. The types of big-O classification don't depend on the values themselves, but rather how they grow (linearly, quadratically, or logarithmically)
1. A process is "data-insensitive" if the arrangement of its data does not affect the runtime

QCC:
0. Are there any more big-O classifications other than the ones we know?

*/

import java.util.ArrayList;

public class OrderedArrayList
{


  private ArrayList<Integer> _data;


  public OrderedArrayList()
  {
    _data = new ArrayList<Integer>();
  }

  /*
  BEST CASE: The element you want to remove is at the end of the list, so no elements have to be shifted over.
  WORST CASE: The element you want to remove is the start of the list, which means that all the elements have to be shifted over.
  Runtime: O(n)
  */
  public Integer remove( int index )
  {
    return _data.remove(index);
  }

  /*
  There is no best or worst case because the method accesses a size variable.
  Runtime: O(1)
  */
  public int size()
  {
    return _data.size();
  }

  /*
  There is no best or worst case because the method gets the value at a specified index, which is not dependent on the size of the ArrayList.
  Runtime: O(1)
  */
  public Integer get( int index )
  {
    return _data.get(index);
  }

  
  public boolean add( Integer newVal )
  {
    //call exactly 1 of the helper methods below...  your favorite?

    addLinear(newVal);
    //addBinary(newVal);
    return true;
  }


  /*
  BEST CASE: The element you want to add is greater than or equal to the current greatest element in the list, so no elements have to be shifted over.
  WORST CASE: The element you want to add is the less than the current smallest element in the list, which means that all the elements have to be shifted over.
  Runtime: O(n)
  */
  public void addLinear(Integer newVal)
  {
    for( int p = 0; p < _data.size(); p++ ) {
      if ( newVal.compareTo( _data.get(p) ) < 0 ) {
        //newVal < oal[p]
        _data.add( p, newVal );
        return; //Q:why not break?
      }
    }
    _data.add( newVal ); //newVal > every item, so add to end
  }

  /*
  BEST CASE: The element you want to add is at the middle of the list, so no elements have to be shifted over.
  WORST CASE: The element you want to add is adjacent to the element in the middle (applies recursively), which means that all the elements have to be shifted over.
  Runtime: O(log<sub>2</sub>n)
  */
  public void addBinary(Integer newVal)
  {
    //initialize high, low, midpt indices
    int lo = 0;
    int med = 0;
    int hi = _data.size()-1;

    while ( lo <= hi ) { //running until target is found or bounds cross

      med = (lo + hi) / 2;
      int x = _data.get(med).compareTo( newVal );

      if ( x == 0 ) {
        //equal value found, insert here
        _data.add( med, newVal );
        return;
      }
      else if ( x > 0 )
        //newVal < med, so look at lower half of data
        hi = med - 1;
      else
        //newVal > med, so look at upper half of data
        lo = med + 1;
    }
    // If you made it this far, newVal is not present.
    // So insert at lo.
    _data.add( lo, newVal );
    //Q: How do you know lo is correct insertion index?
  }

}//end class OrderedArrayList
