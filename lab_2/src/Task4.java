package tasks;

public class Task4 {
    public static void main(String[] args) {
        try {
            System.out.println("Result: " + calculateSum(2, 4, 30)); // Valid input
            System.out.println("Result: " + calculateSum(1, 2, 10)); // Valid input
            System.out.println("Result: " + calculateSum(-1, 2, 5)); // Invalid 'a'
            System.out.println("Result: " + calculateSum(1, -2, 5)); // Invalid 'b'
            System.out.println("Result: " + calculateSum(1, 2, 31)); // Invalid 'k'
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

    public static double calculateSum(double a, double b, int k) {
        if (a <= 0 || b <= 0 || k <= 0 || k > 30) {
            throw new IllegalArgumentException("Invalid input parameters: a=" + a + ", b=" + b + ", k=" + k);
        }
        double sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += a * i * Math.sqrt(b / i);
        }
        return sum;
    }
}
