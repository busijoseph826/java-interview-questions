class Node{
    public int data;
    public Node next;
    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
public class Main
{
	public static void main(String[] args) {
		Main list = new Main();
		list.add(19);
		list.add(11);
		list.add(13);
		list.add(19);
		list.add(13);
		list.show();
		list.delectloop();
		//list.removeDuplicatesUnSortedList()
		//list.removeDuplicates();
		list.show();
		//list.middle();
		//list.klast(2);
		//list.last(2);
		//list.length();
	}
	Node head;
	public void add(int data){
	    Node newNode = new Node(data);
	    if(head==null){
	        head = newNode;
	    }
	    else{
	        Node current = head;
	        while(current.next!=null){
	            current = current.next;
	        }
	        current.next= newNode;
	    }
	}
	public void show(){
	    Node current = head;
	    while(current!=null){
	        System.out.print(current.data+"->");
	        current = current.next;
	    }
	    System.out.println("null");
	}
	public Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
       }
	public int length(){
	    Node temp = head;
	    int c = 0;
	    while(temp!=null){
	        c++;
	        temp = temp.next;
	    }
	    return c;
	}
	public void middle(){
	    Node temp = head;
	    int middle = length()/2;
	    for(int i=0;i<middle;i++){
	        temp = temp.next;
	    }
	    System.out.println("Middle element "+temp.data);
	}
	//kth last element forn newNode
	public void last(int k){
	    Node temp = head;
	    int len = length()-k;
	    for(int i=0;i<len;i++){
	        temp = temp.next;
	    }
	    System.out.println(k+"th Last element form end is "+ temp.data);
	}
	public void klast(int k){
	    Node first = head;
	    Node second  = head;
	    for(int i=0;i<k;i++){
	        if (first == null) {
                System.out.println("The list is shorter than " + k + " nodes.");
                return;
            }
            first = first.next;
	    }
	    while(first!=null){
	        first=first.next;
	        second = second.next;
	    }
	    System.out.println("The " + k + "th node from the end is " + second.data);
	}
	//remove duplicates from a sorted list
	public void removeDuplicates(){
	    Node current = head;
	    while(current!=null && current.next!=null){
	        if(current.data == current.next.data){
	            current.next = current.next.next;
	        }
	        else{
	            current = current.next;
	        }
	    }
	}
	//remove duplicates from a unsorted list
	public void removeDuplicatesUnSortedList(){
	    if(head == null){
	        return;
	    }
	    Node current = head;
	    Node prev = null;
	    HashSet<Integer> seen = new HashSet<>();
	    while(current!=null){
	        if(seen.contains(current.data)){
	            prev.next = current.next;
	        }
	        else{
	            seen.add(current.data);
	            prev = current;
	        }
	        current = current.next;
	    }
	}
	//Checking if a Linked List is a Palindrome
	public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Find the middle of the list
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half
        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        // Compare the first and second half
        Node copyOfSecondHalf = secondHalf;
        while (secondHalf != null) {
            if (secondHalf.data != firstHalf.data) {
                reverse(copyOfSecondHalf); // Optional: Restore the original list
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Optional: Restore the original list
        reverse(copyOfSecondHalf);

        return true;
    }
	// delect loop in Linked List 
	public boolean detectLoop(Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
	
}
