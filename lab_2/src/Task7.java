package tasks;

public class Task7 {
    public static void main(String[] args) {
        try {
            System.out.println("x(1, 1): " + calculateX(1, 1)); // ln(1)
            System.out.println("x(2, 2): " + calculateX(2, 2)); // ln(2)
            System.out.println("x(3, 5): " + calculateX(3, 5)); // Sum of sin(3)/k for k=1..5
            System.out.println("x(2, -1): " + calculateX(2, -1)); // Invalid 'i'
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

    public static double calculateX(double t, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Invalid parameter i: " + i);
        }
        if (i == 1 || i == 2) {
            return Math.log(t);
        } else {
            double sum = 0;
            for (int k = 1; k <= i; k++) {
                sum += Math.sin(t) / k;
            }
            return sum;
        }
    }
}

