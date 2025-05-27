public class CustomStack {
    private int[] stack;
    private int top;
    private final int MAX_SIZE = 100;

    public CustomStack() {
        stack = new int[MAX_SIZE];
        top = -1;
    }

    public void push(int value) {
        if (top >= MAX_SIZE - 1) {
            System.out.println("Stack overflow");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed to the stack");
        }
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
        } else {
            int popped = stack[top--];
            System.out.println(popped + " popped from the stack");
        }
    }

    public void peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public void display() {
        if (top < 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);

        stack.display();
        stack.peek();
        stack.pop();
        stack.display();

        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}
