public class Main {
    public static void main(String[] args) {
        System.out.println(Math.random()*15);           // double in range [0, 15) 
        System.out.println((int)Math.random()+15);      // 15
        System.out.println((int)Math.random()*5+10);    // 10
        System.out.println((int)(Math.random()*5)+10);  // int in range [10, 15)
    }
}