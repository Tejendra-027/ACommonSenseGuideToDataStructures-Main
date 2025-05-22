import java.util.ArrayList;

public class Deletion {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        groceries.add("apples");
        groceries.add("bananas");
        groceries.add("cucumbers");
        groceries.add("dates");
        groceries.add("elderberries");

        groceries.remove(2); 
        System.out.println(groceries);
    }
}
