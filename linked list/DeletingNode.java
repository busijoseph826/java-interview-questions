class Node {
    public int data;
    public Node next;

    // Constructor with both data and next node
    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    // Constructor with only data (assuming next is initially null)
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class DeletingNode {
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static Node deleteNodeByValue(Node head, int value) {
        // If the head itself needs to be deleted
        if (head != null && head.data == value) {
            return head.next; // New head
        }

        Node current = head;
        // Find the previous node of the node to be deleted
        while (current != null && current.next != null && current.next.data != value) {
            current = current.next;
        }

        // If the value is not found
        if (current == null || current.next == null) {
            throw new IllegalArgumentException("Value not found in the list.");
        }

        // Skip the node to delete it
        current.next = current.next.next;

        return head;
    }

    public static Node constructLL(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Creating a linked list with initial elements from the array
        Node head = constructLL(arr);

        // Value to delete
        int valueToDelete = 3;

        // Deleting the node with the given value
        head = deleteNodeByValue(head, valueToDelete);

        // Printing the linked list
        System.out.print("Linked List after deletion: ");
        printLL(head);
    }
}
