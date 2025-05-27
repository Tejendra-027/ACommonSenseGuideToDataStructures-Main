public class QuickSortExample {

    public static int partition(int[] arr, int start, int end) {
        int idx = start - 1;
        int pivot = arr[end];

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                idx++;
               
                int temp = arr[j];
                arr[j] = arr[idx];
                arr[idx] = temp;
            }
        }

        
        int temp = arr[end];
        arr[end] = arr[idx + 1];
        arr[idx + 1] = temp;

        return idx + 1;
    }

    public static void quicksort(int[] arr, int start, int end) {
        if (start < end) {
            int pivIdx = partition(arr, start, end);
            quicksort(arr, start, pivIdx - 1);
            quicksort(arr, pivIdx + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 6, 5};
        quicksort(arr, 0, arr.length - 1);

        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
