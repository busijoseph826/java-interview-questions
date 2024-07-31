class Node {
    int data;
    Node next;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to add a node at the end
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to add a node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a node at a specific position
    public void addAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to remove a node by value
    public void remove(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.printList(); // Output: 1 2 3

        // Adding element at the beginning
        list.addFirst(0);
        list.printList(); // Output: 0 1 2 3

        // Inserting element at position 2
        list.addAtPosition(1, 2);
        list.printList(); // Output: 0 1 1 2 3

        // Removing an element
        list.remove(1);
        list.printList(); // Output: 0 1 2 3

        // Reversing the linked list
        list.reverse();
        list.printList(); // Output: 3 2 1 0
    }
}
