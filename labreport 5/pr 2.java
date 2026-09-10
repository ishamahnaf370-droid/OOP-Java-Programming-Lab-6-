public class AverageNumber {
    static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        double a = 25;
        double b = 45;
        double c = 65;

        System.out.println("The average value is " + average(a, b, c));
    }
}