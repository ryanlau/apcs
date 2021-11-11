public class Main {
    public static void main(String[] args) {
        Coin drop = new Coin();
        Coin dead = new Coin();
        Coin fred = new Coin();

        System.out.println(drop == dead);
        System.out.println(drop == fred);
        System.out.println(drop.equals(dead));
        System.out.println(drop.equals(fred));
    }
}