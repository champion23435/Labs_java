import java.util.Arrays;

public class Task19 {
    public static int countNegativeElements(int[] array) {
        if (array == null) {
            throw new NullPointerException("Масив не може бути null.");
        }
        int count = 0;
        for (int num : array) { // Використовується for-each
            if (num < 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array1 = {-3, 5, -1, 0, -7};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = null; // Викликає NullPointerException

        System.out.println(countNegativeElements(array1)); // Результат: 3
        System.out.println(countNegativeElements(array2)); // Результат: 0

        try {
            System.out.println(countNegativeElements(array3)); // Помилка
        } catch (NullPointerException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
