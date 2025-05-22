import java.util.ArrayList;

public class Reading {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apples");
        fruits.add("bananas");
        fruits.add("cherries");
        fruits.add("dates");
        fruits.add("elderberries");

        System.out.println(fruits.get(3)); // prints "dates"
    }
}
