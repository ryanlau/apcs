// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 85: Leon Leonwood Stack
// 2022-03-30h
// time spent: 0.7hrs

/***
 * interface Stack
 * Specifies actions a stack must be able to perform.
 * Allows for generic typing.
 **/

public interface Stack<PANCAKE>
{
    //Return true if this stack is empty, otherwise false.
    public boolean isEmpty();

    //Return top element of stack without popping it.
    public PANCAKE peekTop();

    //Pop and return top element of stack.
    public PANCAKE pop();

    //Push an element onto top of this stack.
    public void push( PANCAKE x );

}//end interface
