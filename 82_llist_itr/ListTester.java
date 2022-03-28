// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 82: Roll Your Own Iterator
// 2022-03-28m
// time spent: 0.8 hrs

import java.util.Iterator;
import java.util.ArrayList;

public class ListTester {
    public static void main(String[] args) {
        ArrayList<String> wu = new ArrayList<>();

        System.out.println("more testing .remove()");
        wu.add("RZA");
        wu.add("GZA");
        wu.add("ODB");
        wu.add("Inspectah Deck");
        wu.add("Raekwon the Chef");
        wu.add("U-God");
        wu.add("Ghostface");
        wu.add("Method Man");
        Iterator it2 = wu.iterator();

        System.out.println(wu);
        it2.next();
        it2.next();
        it2.remove();
        System.out.println(wu + "\t should be missing GZA");
        it2.next();
        it2.next();
        it2.next();
        it2.next();
        it2.next();
        it2.next();
        it2.remove();
        System.out.println(wu + "\t should be missing Method Man");
    }
}
