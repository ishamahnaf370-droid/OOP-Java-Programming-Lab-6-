public class SmallestNumber {
    static double findSmallest(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        double a = 25;
        double b = 37;
        double c = 29;

        System.out.println("The smallest value is " + findSmallest(a, b, c));
    }
}