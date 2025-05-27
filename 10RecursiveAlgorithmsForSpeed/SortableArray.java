public class SortableArray {
    private int[] array;

    public SortableArray(int[] array) {
        this.array = array;
    }

    public void swap(int pointer1, int pointer2) {
        int temp = array[pointer1];
        array[pointer1] = array[pointer2];
        array[pointer2] = temp;
    }

    public int partition(int leftPointer, int rightPointer) {
        int pivotPosition = rightPointer;
        int pivot = array[pivotPosition];
        rightPointer--;

        while (true) {
            while (leftPointer < array.length && array[leftPointer] < pivot) {
                leftPointer++;
            }
            while (rightPointer >= 0 && array[rightPointer] > pivot) {
                rightPointer--;
            }
            if (leftPointer >= rightPointer) {
                break;
            } else {
                swap(leftPointer, rightPointer);
            }
        }

        swap(leftPointer, pivotPosition);
        return leftPointer;
    }

    public void printArray() {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int[] input = {0, 5, 2, 1, 6, 3};
        SortableArray arr = new SortableArray(input);
        int pivotIndex = arr.partition(0, input.length - 1);
        arr.printArray();
        System.out.println("Pivot index: " + pivotIndex);
    }
}
