import java.util.ArrayList;

public class searching {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apples");
        fruits.add("bananas");
        fruits.add("cherries");
        fruits.add("dates");
        fruits.add("elderberries");

        String searchItem = "dates";

        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals(searchItem)) {
                System.out.println("Found at index " + i);
                break;
            }
        }
    }
}
