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
		list.add(11);
		list.add(11);
		list.add(13);
		list.add(13);
		list.add(15);
		list.show();
		list.removeDuplicates();
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
	
}
