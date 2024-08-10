class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListQueue {
    private Node front, rear;
    private int size;

    public LinkedListQueue() {
        front = rear = null;
        size = 0;
    }

    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Underflow\nProgram Terminated");
            return;
        }
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
    }

    public int peek() {
        if (front != null) {
            return front.data;
        }
        System.out.println("Queue is empty");
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    // Method to display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        
        Node current = front;
        System.out.print("Queue: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display(); // Should print: Queue: 10 20 30

        queue.dequeue();
        queue.display(); // Should print: Queue: 20 30

        queue.enqueue(40);
        queue.display(); // Should print: Queue: 20 30 40

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.display(); // Should print: Queue is empty
    }
}
