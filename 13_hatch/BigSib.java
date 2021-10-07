// TNPG: Orion (Ryan Lau, Brian Kang, Jon, and Vivian)
// APCS
// HW13 -- Where do BigSibs Come From?
// 2021-10-06

public class BigSib {
    private static String helloMsg;

    public BigSib() {
        helloMsg = "Word up";
    }

    public static String greet(String name) {
        return helloMsg + " " + name;
    }

    public static void setHelloMsg(String newHelloMsg) {
        helloMsg = newHelloMsg;
    }
}
