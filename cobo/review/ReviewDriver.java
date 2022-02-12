// Team Gnocchi -- Hugo Jenkins (Boary), Ryan Lau (Jon), and Brian Kang (Vivian)
// APCS pd6
// L06 -- Read/Review/Expand
// 2022-02-11f
// time spent: .5hrs

public class ReviewDriver {
    public static void main(String[] args) {
        // activity uno
        System.out.println(Review.sentimentVal("hello"));
        System.out.println(Review.sentimentVal("bob"));
        System.out.println(Review.sentimentVal("ryan"));

        // activity dos
        System.out.println(Review.totalSentiment("SimpleReview.txt"));
        System.out.println(Review.starRating("SimpleReview.txt"));

        // activity tres
        System.out.println("team gnocchi !".indexOf(" "));
        System.out.println(Review.fakeReview("SimpleReview.txt"));
    }
}
