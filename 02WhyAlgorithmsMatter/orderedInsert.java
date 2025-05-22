import java.util.ArrayList;

public class orderedInsert {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(17);
        numbers.add(80);
        numbers.add(202);

        int newValue = 75;
        int index = 0;

        while (index < numbers.size() && numbers.get(index) < newValue) {
            index++;
        }

        numbers.add(index, newValue); // Insert while maintaining order

        System.out.println("Ordered array: " + numbers);
    }
}
