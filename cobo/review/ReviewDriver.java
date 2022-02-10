public class ReviewDriver {
    public static void main(String[] args) {
        System.out.println(Review.sentimentVal("hello"));
        System.out.println(Review.sentimentVal("bob"));
        System.out.println(Review.sentimentVal("ryan"));

        System.out.println(Review.totalSentiment("SimpleReview.txt"));
    }
}
