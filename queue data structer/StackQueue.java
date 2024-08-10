import java.util.Stack;

public class StackQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item) {
        stack1.push(item);
    }

    public void dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()) {
            stack2.pop();
        } else {
            System.out.println("Underflow\nProgram Terminated");
        }
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()) {
            return stack2.peek();
        }
        System.out.println("Queue is empty");
        return -1;
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Method to display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        // Print elements in stack2 first (as they are in correct queue order)
        for (int i = stack2.size() - 1; i >= 0; i--) {
            System.out.print(stack2.get(i) + " ");
        }

        // Then print elements in stack1 (in reverse order)
        for (int i = 0; i < stack1.size(); i++) {
            System.out.print(stack1.get(i) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        StackQueue queue = new StackQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display(); // Should print: 10 20 30

        queue.dequeue();
        queue.display(); // Should print: 20 30

        queue.enqueue(40);
        queue.display(); // Should print: 20 30 40

        queue.dequeue();
        queue.display(); // Should print: 30 40

        queue.dequeue();
        queue.dequeue();
        queue.display(); // Should print: Queue is empty
    }
}
