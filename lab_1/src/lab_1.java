public class lab_1 {
    public static void main(String[] args) {
        // Завдання 9
        double a9 = -2.98;
        double b9 = 5.55;
        double c9 = 0.045;
        double d9 = 0.129;

        double y9 = (Math.sin(Math.abs(a9)) + Math.cos(Math.sqrt(b9))) /
                (2 * Math.tan(c9)) + Math.exp(d9);
        System.out.println("Результат для завдання 9: y = " + y9);

        // Завдання 19
        double a19 = 1.234;
        double b19 = -3.12;
        double c19 = 5.45;
        double d19 = 2.0;

        double y19 = (Math.sqrt(Math.tan(a19)) /
                (1 + Math.sinh(b19))) / (Math.log(Math.abs(d19 + c19)));
        System.out.println("Результат для завдання 19: y = " + y19);

        // Завдання 29
        double a29 = -2.86;
        double b29 = 1.62;
        double c29 = 10.874;
        double d29 = 2.91;

        double y29 = Math.pow(
                2 * Math.cos(Math.sqrt(Math.abs(a29 / b29))) +
                        4 * Math.log(d29 + Math.sqrt(d29 * d29 - 1)),
                c29);
        System.out.println("Результат для завдання 29: y = " + y29);
    }
}
