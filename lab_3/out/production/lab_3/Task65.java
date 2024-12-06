import java.util.Arrays;

public class Task65 {
    public static int[] reverseArray(int[] array) {
        if (array == null) {
            throw new NullPointerException("Масив не може бути null.");
        }
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) { // Використовується for
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {};
        int[] array3 = null;

        System.out.println(Arrays.toString(reverseArray(array1))); // Результат: [5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(reverseArray(array2))); // Результат: []

        try {
            System.out.println(Arrays.toString(reverseArray(array3))); // Помилка
        } catch (NullPointerException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
