import java.util.*;

class Person {
    String name;
    List<Person> friends;

    public Person(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }

    public void addFriend(Person friend) {
        friends.add(friend);
    }
}

class Graph {
    Map<String, Person> nodes;

    public Graph() {
        nodes = new HashMap<>();
    }

    public void addPerson(String name) {
        nodes.put(name, new Person(name));
    }

    public void addFriendship(String name1, String name2) {
        if (nodes.containsKey(name1) && nodes.containsKey(name2)) {
            Person p1 = nodes.get(name1);
            Person p2 = nodes.get(name2);
            p1.addFriend(p2);
            p2.addFriend(p1);
        }
    }

    public void display() {
        for (Map.Entry<String, Person> entry : nodes.entrySet()) {
            Person person = entry.getValue();
            List<String> friendNames = new ArrayList<>();
            for (Person friend : person.friends) {
                friendNames.add(friend.name);
            }
            System.out.println(person.name + ": " + friendNames);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addPerson("Alice");
        graph.addPerson("Bob");
        graph.addPerson("Diana");
        graph.addPerson("Fred");

        graph.addFriendship("Alice", "Bob");
        graph.addFriendship("Alice", "Diana");
        graph.addFriendship("Alice", "Fred");
        graph.addFriendship("Bob", "Diana");
        graph.addFriendship("Diana", "Fred");

        graph.display();
    }
}
