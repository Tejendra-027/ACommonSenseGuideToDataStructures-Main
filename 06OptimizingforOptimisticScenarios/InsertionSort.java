public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 3};

        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }

        System.out.print("Sorted list: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
