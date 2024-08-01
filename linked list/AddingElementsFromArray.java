class Node{
    int data;
    Node next;
    //constructor
    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class AddingElementsFromArray {
    public static void main(String[] args) {
        int arr[] = {4,3,5,6};
        Node head = null;
        Node current = null;
        for(int i=0;i<arr.length;i++){
            Node newNode = new Node(arr[i]);
            if(head==null){
                head = newNode;
                current = head;
            }else{
                current.next = newNode;
                current = newNode;
            }
        }
        printLinkedList(head);
    }
    public static void printLinkedList(Node head){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.print("null");
    }
}
