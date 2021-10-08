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

public class Greet {
    public static void main(String[] args) {
        String greeting;

        BigSib richard = new BigSib();
        BigSib grizz = new BigSib();
        BigSib dotCom = new BigSib();
        BigSib tracy = new BigSib();

        greeting = richard.greet("freshman");
        System.out.println(greeting);

        greeting = tracy.greet("Dr. Spaceman");
        System.out.println(greeting);

        greeting = grizz.greet("Kong Fooey");
        System.out.println(greeting);

        greeting = dotCom.greet("mom");
        System.out.println(greeting);
    }
}
