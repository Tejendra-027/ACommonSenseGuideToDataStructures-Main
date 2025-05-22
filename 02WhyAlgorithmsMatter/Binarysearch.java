public class Binarysearch {
    public static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];

            if (guess == value) {
                return mid;
            } else if (guess < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int[] numbers = {3, 17, 22, 75, 80, 202};
        int result = binarySearch(numbers, 22);

        if (result != -1) {
            System.out.println("Value found at index: " + result);
        } else {
            System.out.println("Value not found");
        }
    }
}
