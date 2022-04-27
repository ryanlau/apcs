// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 91: Deque the Halls
// 2022-04-12
// time spent: 0.5hrs

import java.util.Iterator;

public class MRKPirateBae {
    public static void main(String[] args) {
        QQCandy<String> seventeen = new QQCandy<>();

        seventeen.addFirst("joshua");
        seventeen.addFirst("jun");
        seventeen.addFirst("hoshi");
        seventeen.addFirst("wonwoo");
        seventeen.addFirst("woozi");
        seventeen.addFirst("dk");
        seventeen.addFirst("mingyu");
        seventeen.addFirst("the8");
        seventeen.addFirst("seungkwan");
        seventeen.addFirst("vernon");
        seventeen.addFirst("dino");
        seventeen.addFirst("s.coups");
        seventeen.addLast("jeonghan");

        System.out.println("seventeen: " + seventeen);
        System.out.println("first item: " + seventeen.getFirst() + " ...should be s.coups");
        System.out.println("last item: " + seventeen.getLast() + " ...should be jeonghan");

        System.out.println("size: " + seventeen.size() + " ...should be 13");

        seventeen.removeLast();
        System.out.println("removed last: " + seventeen + " ...should be missing jeonghan");
        seventeen.removeFirst();
        System.out.println("removed first: " + seventeen + " ...should be missing s.coups");
        System.out.println("contains s.coups: " + seventeen.contains("s.coups") + " ...should be false");


        System.out.println("printing and removing the rest of the seventeen members with an iterator");
        Iterator it = seventeen.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            it.remove();
        }

        System.out.println("peeking first: " + seventeen.peekFirst() + " ...should be null");
        System.out.println("peeking last: " + seventeen.peekLast() + " ...should be null");


        System.out.println("getting first: should result in NPE");
        seventeen.getFirst();

    }
}
