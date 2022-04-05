// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 88: BPC Kiddies Do Not Wait in Line Either
// 2022-04-05t
// time spent: 0.5hrs

public class LLNode<QUASAR> {
    //instance vars
    private QUASAR _cargo;
    private LLNode<QUASAR> _nextNode;

    // constructor
    public LLNode( QUASAR value, LLNode<QUASAR> next )
    {
        _cargo = value;
        _nextNode = next;
    }


    //--------------v  ACCESSORS  v--------------
    public QUASAR getCargo()
    {
        return _cargo;
    }

    public LLNode<QUASAR> getNext()
    {
        return _nextNode;

    }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public QUASAR setCargo( QUASAR newCargo )
    {
        QUASAR foo = getCargo();
        _cargo = newCargo;
        return foo;
    }

    public LLNode setNext( LLNode<QUASAR> newNext )
    {
        LLNode foo = getNext();
        _nextNode = newNext;
        return foo;
    }
    //--------------^  MUTATORS  ^--------------

    public String toString(){
        return _cargo.toString();
    }
}
