import java.util.HashSet;

public class DuplicateChecker {

    public static boolean hasDuplicateValue(String[] array) {
        HashSet<String> existingValues = new HashSet<>();

        for (String item : array) {
            if (existingValues.contains(item)) {
                return true;
            } else {
                existingValues.add(item);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] numbers = {"apple", "banana", "grape", "apple"};
        System.out.println("Has duplicates? " + hasDuplicateValue(numbers));
    }
}
