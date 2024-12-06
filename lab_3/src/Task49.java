import java.util.Arrays;

public class Task49 {
    public static int findMaxAbsIndex(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнім або null.");
        }
        int maxIndex = -1;
        int maxAbsValue = 0;

        for (int i = 0; i < array.length; i++) { // Використовується for
            if (i % 3 == 0 && Math.abs(array[i]) > maxAbsValue) {
                maxAbsValue = Math.abs(array[i]);
                maxIndex = i;
            }
        }
        if (maxIndex == -1) {
            throw new IllegalArgumentException("Не знайдено елемента з індексом кратним 3.");
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int[] array1 = {1, -9, 3, 4, -15, 6, -7, 8};
        int[] array2 = {2, 4, 6};
        int[] array3 = {};

        System.out.println(findMaxAbsIndex(array1)); // Результат: 3
        try {
            System.out.println(findMaxAbsIndex(array2)); // Помилка
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        try {
            System.out.println(findMaxAbsIndex(array3)); // Помилка
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}

