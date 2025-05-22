public class BubbleSortShort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 3};
        int step = 1;

        System.out.print("Original array: ");
        print(arr);

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            System.out.println("\nPassthrough #" + (i + 1) + ":");

            for (int j = 0; j < arr.length - 1 - i; j++) {
                System.out.println("Step #" + step++ + ": Compare " + arr[j] + " and " + arr[j + 1]);
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.print("Swap -> ");
                } else {
                    System.out.print("No swap -> ");
                }
                print(arr);
            }

            if (!swapped) break;
        }

        System.out.print("\nSorted array: ");
        print(arr);
    }

    static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        System.out.println("]");
    }
}
