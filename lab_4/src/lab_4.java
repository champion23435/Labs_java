import java.util.Arrays;

        public class lab_4 {

            // Метод 1: Bubble Sort
            public static void bubbleSort(float[] array) {
                int n = array.length;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (array[j] > array[j + 1]) {
                            // Обмін елементів
                            float temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        }
                    }
                }
            }

            // Метод 2: Selection Sort
            public static void selectionSort(float[] array) {
                int n = array.length;
                for (int i = 0; i < n - 1; i++) {
                    // Знаходимо індекс мінімального елемента
                    int minIndex = i;
                    for (int j = i + 1; j < n; j++) {
                        if (array[j] < array[minIndex]) {
                            minIndex = j;
                        }
                    }
                    // Обмін елементів
                    float temp = array[minIndex];
                    array[minIndex] = array[i];
                    array[i] = temp;
                }
            }

            public static void main(String[] args) {
                // Приклад масиву float
                float[] array = {5.6f, 2.3f, 8.1f, 1.4f, 3.9f};

                // Копія масиву для другого сортування
                float[] arrayForSelectionSort = Arrays.copyOf(array, array.length);

                // Bubble Sort
                System.out.println("Оригінальний масив: " + Arrays.toString(array));
                bubbleSort(array);
                System.out.println("Після Bubble Sort: " + Arrays.toString(array));

                // Selection Sort
                selectionSort(arrayForSelectionSort);
                System.out.println("Після Selection Sort: " + Arrays.toString(arrayForSelectionSort));
            }
        }
