// TNPG: ??? (Ryan Lau, Brian Kang, Kaitlin Ho, Jon, Vivian, and Apple)
// APCS
// HW14 -- Customize Your Creation
// 2021-10-07

public class BigSib {
    private String helloMsg;

    public BigSib() {
        helloMsg = "Word up";
    }

    public String greet(String name) {
        return helloMsg + " " + name;
    }

    public void setHelloMsg(String newHelloMsg) {
        helloMsg = newHelloMsg;
    }
}
