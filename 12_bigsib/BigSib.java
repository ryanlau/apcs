// TNPG: Orion (Ryan Lau and Brian Kang)
// APCS
// HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
// 2021-10-05

public class BigSib {
    static String helloMsg;

    public static String greet(String name) {
        return helloMsg + " " + name;
    }

    public static void setHelloMsg(String newHelloMsg) {
        helloMsg = newHelloMsg;
    }
}
