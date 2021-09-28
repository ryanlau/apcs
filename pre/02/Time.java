public class Time {
    public static void main(String[] args) {
        int hour = 19;
        int minute = 31;
        int second = 26;

        int secondsSinceMidnight = hour * 60 * 60 + minute * 60 + second;
        System.out.println("it has been " + secondsSinceMidnight + " seconds since midnight");

        int secondsLeft = 24 * 60 * 60 - secondsSinceMidnight;
        System.out.println("there are " + secondsLeft + " seconds left in the day");

        double secondsInADay = 24.0 * 60.0 * 60.0;
        double percentageOfDayPassed = secondsSinceMidnight / secondsInADay;
        System.out.println(percentageOfDayPassed + "% of the day has passed");

        hour = 19;
        minute = 56;
        second = 54;
        int elapsedSeconds = hour * 60 * 60 + minute * 60 + second - secondsSinceMidnight;
        System.out.println(elapsedSeconds + " seconds have elapsed while working on this exercise");
    }
}
