public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 3};

        for (int i = 0; i < numbers.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        System.out.print("Sorted list: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
