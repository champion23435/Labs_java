package tasks;

public class Task15 {
    public static void main(String[] args) {
        try {
            System.out.println("Sum (epsilon=0.01): " + calculateInfiniteSum(0.01)); // Valid
            System.out.println("Sum (epsilon=0.0001): " + calculateInfiniteSum(0.0001)); // Valid
            System.out.println("Sum (epsilon=-0.01): " + calculateInfiniteSum(-0.01)); // Invalid epsilon
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

    public static double calculateInfiniteSum(double epsilon) {
        if (epsilon <= 0) {
            throw new IllegalArgumentException("Epsilon must be positive: " + epsilon);
        }
        double sum = 0;
        int i = 1;
        double term;
        do {
            term = (double) i * Math.pow(-1, i + 1) / ((i + 1) * (i + 2));
            sum += term;
            i++;
        } while (Math.abs(term) >= epsilon);
        return sum;
    }
}

