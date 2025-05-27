
class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}


public class LinkedList {
    Node head;

    
    public void append(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("None");
    }

    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append("a");
        list.append("b");
        list.append("c");
        list.append("d");

        list.printList();  
    }
}
