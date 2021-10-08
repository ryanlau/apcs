// TNPG: BARK (Ryan Lau, Brian Kang, Kaitlin Ho, Jon, Vivian, and Apple)
// APCS
// HW14 -- Customize Your Creation
// 2021-10-07

/*
DISCOVERIES
    0. Things in the default constructor can be overwritten 
    1. static before a variable means that it is shared across all instances of the class
        e.g. static String helloMsg would mean that the last new BigSib instance created (in this case it was "Salutations") would be used as the helloMsg for all 4 BigSibs 

UNRESOLVED QUESTIONS
    0. What is the purpose of making a method static versus making it nonstatic?
*/

public class BigSib {
    private String helloMsg;

    public BigSib() {
        helloMsg = "Word up";
    }

    public BigSib(String msg) {
        helloMsg = msg;
    }

    public String greet(String name) {
        return helloMsg + " " + name;
    }

    public void setHelloMsg(String newHelloMsg) {
        helloMsg = newHelloMsg;
    }
}
