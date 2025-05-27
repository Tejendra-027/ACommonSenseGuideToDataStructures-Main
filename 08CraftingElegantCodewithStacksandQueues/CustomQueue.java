import java.util.LinkedList;
import java.util.Queue;

public class CustomQueue {
    private Queue<Integer> queue;

    public CustomQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(int value) {
        queue.add(value);
        System.out.println(value + " enqueued to the queue");
    }

    public void dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue underflow");
        } else {
            int value = queue.poll(); // Removes and returns the head
            System.out.println(value + " dequeued from the queue");
        }
    }

    public void peek() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element is " + queue.peek());
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements: " + queue);
        }
    }

    public static void main(String[] args) {
        CustomQueue q = new CustomQueue();

        q.enqueue(32);
        q.enqueue(40);
        q.enqueue(60);
        q.enqueue(12);
        q.enqueue(18);
        q.enqueue(56);
        q.enqueue(87);

        q.display();

        q.peek();
        q.dequeue();
        q.display();

        if (q.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }
    }
}
