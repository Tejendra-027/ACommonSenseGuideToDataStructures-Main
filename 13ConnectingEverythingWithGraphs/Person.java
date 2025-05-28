import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Person {
    String name;
    List<Person> friends;
    boolean visited;

    public Person(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
        this.visited = false;
    }

    public void addFriend(Person friend) {
        friends.add(friend);
    }

    public void displayNetwork() {
        List<Person> toReset = new ArrayList<>();
        Queue<Person> queue = new LinkedList<>();

        this.visited = true;
        queue.add(this);
        toReset.add(this);

        while (!queue.isEmpty()) {
            Person current = queue.poll();
            System.out.println(current.name);

            for (Person friend : current.friends) {
                if (!friend.visited) {
                    friend.visited = true;
                    queue.add(friend);
                    toReset.add(friend);
                }
            }
        }

        
        for (Person person : toReset) {
            person.visited = false;
        }
    }

    public static void main(String[] args) {
        Person alice = new Person("Alice");
        Person bob = new Person("Bob");
        Person carol = new Person("Carol");
        Person dave = new Person("Dave");

        alice.addFriend(bob);
        bob.addFriend(alice);
        bob.addFriend(carol);
        carol.addFriend(bob);
        carol.addFriend(dave);
        dave.addFriend(carol);

        alice.displayNetwork();
    }
}
