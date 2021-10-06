// TNPG: Orion (Ryan Lau and Brian Kang)
// APCS
// HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
// 2021-10-05

/*
DISCOVERIES

UNRESOLVED QUESTIONS
    0. Why does the property helloMsg need to be static in BigSib.java?
    1. If a property doesn’t have a public or private signature, then what signature does it have?
*/

public class Greet {
    public static void main(String[] args) {
        String greeting;

        BigSib richard = new BigSib();

        richard.setHelloMsg("Word up");
        greeting = richard.greet("freshman");
        System.out.println(greeting);

        richard.setHelloMsg("Salutations");
        greeting = richard.greet("Dr. Spaceman");
        System.out.println(greeting);

        richard.setHelloMsg("Hey ya");
        greeting = richard.greet("Kong Fooey");
        System.out.println(greeting);

        richard.setHelloMsg("Sup");
        greeting = richard.greet("mom");
        System.out.println(greeting);
    }
}
