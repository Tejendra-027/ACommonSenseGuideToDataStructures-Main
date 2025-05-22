public class LinearSearch {
    public static Integer linearSearch(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return value;
            } else if (element > value) {
                break;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 17, 75, 80, 202};
        Integer result = linearSearch(numbers, 22);

        if (result == null) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value Found: " + result);
        }
    }
}
