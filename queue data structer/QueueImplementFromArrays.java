//import java.util.Queue;

public class QueueImplementFromArrays {
    private int[] arr;      // Array to store queue elements
    private int front;      // Front points to the front element in the queue
    private int rear;       // Rear points to the last element in the queue
    private int capacity;   // Maximum capacity of the queue
    private int count;      // Current size of the queue

    // Constructor to initialize a queue
    public QueueImplementFromArrays(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Utility function to remove front element from the queue
    public void dequeue() {
        // check for queue underflow
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Removing " + arr[front]);

        front = (front + 1) % capacity;
        count--;
    }

    // Utility function to add an item to the queue
    public void enqueue(int item) {
        // check for queue overflow
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(1);
        }

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    // Utility function to return front element in the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
        return arr[front];
    }

    // Utility function to return the size of the queue
    public int size() {
        return count;
    }

    // Utility function to check if the queue is empty or not
    public boolean isEmpty() {
        return (size() == 0);
    }

    // Utility function to check if the queue is full or not
    public boolean isFull() {
        return (size() == capacity);
    }

    public static void main(String[] args) {
        // create a queue of capacity 5
        QueueImplementFromArrays queue = new QueueImplementFromArrays(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Front element is: " + queue.peek());
        queue.dequeue();
        System.out.println("Front element is: " + queue.peek());

        System.out.println("Queue size is " + queue.size());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        if (queue.isEmpty()) {
            System.out.println("Queue Is Empty");
        } else {
            System.out.println("Queue Is Not Empty");
        }
    }
}
