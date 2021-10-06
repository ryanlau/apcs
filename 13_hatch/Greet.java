// TNPG: Orion (Ryan Lau and Brian Kang)
// APCS
// HW13 -- Where do BigSibs Come From?
// 2021-10-06

/*
DISCOVERIES

UNRESOLVED QUESTIONS
*/

public class Greet {
    public static void main(String[] args) {
        String greeting;

        BigSib richard = new BigSib();

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
