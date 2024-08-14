import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek the top element
        System.out.println("Top element: " + stack.peek()); // Output: 30

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop()); // Output: 30
        System.out.println("Popped element: " + stack.pop()); // Output: 20

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false

        // Get the size of the stack
        System.out.println("Size of stack: " + stack.size()); // Output: 1
    }
}
