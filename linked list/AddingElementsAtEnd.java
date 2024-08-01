import java.util.Arrays;
import java.util.List;

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

public class AddingElementsAtEnd {
    // Function to print the LinkedList
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Function to Insert a Node at End
    public static Node insertAtEnd(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            return newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    // Function to construct a LinkedList from an array
    public static Node constructLL(List<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            return null;
        }
        Node head = new Node(arr.get(0));
        Node current = head;
        for (int i = 1; i < arr.size(); i++) {
            current.next = new Node(arr.get(i));
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4);
        int value = 6;
        Node head = constructLL(arr);
        head = insertAtEnd(head, value);
        System.out.println("Linked List is: ");
        printLL(head);
    }
}
