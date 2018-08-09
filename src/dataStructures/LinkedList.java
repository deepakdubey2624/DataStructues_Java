package dataStructures;

public class LinkedList {
public  Node head;
public int size ;

public LinkedList() {
	size = 0;
	head = null;
}

public boolean isEmpty() {
	return head == null ? true : false ;
}
 public int getListSize() {
	 return size;
 }
 public void push(int val) {
	 Node n = new Node(val);
	 
	 
	 n.setNext(head);
	 size++ ;
	 head = n;
	 System.out.println(head.toString());
 }
 
 /* add element at last 8*/
 public void append(int val) {
	 Node new_node = new Node(val);
	 System.out.println(head.toString());
	 if(head == null) {
		 head = new Node(val) ;
	 }
	 
	 new_node.setNext(null);
	 Node last = head;
	 while(last.getNext() != null) {
		 last = last.getNext();
	 }
	 last.setNext(new_node);
 }
 
 public void insertAfter(Node prev_node, int new_data)
 {
     /* 1. Check if the given Node is null */
     if (prev_node == null)
     {
         System.out.println("The given previous node cannot be null");
         return;
     }

     /* 2 & 3: Allocate the Node &
               Put in the data*/
     Node new_node = new Node(new_data);

     /* 4. Make next of new Node as next of prev_node */
     new_node.next = prev_node.next;

     /* 5. make next of prev_node as new_node */
     prev_node.next = new_node;
 }
 
public  void viewList() {
	Node t ;
	if(isEmpty()) {
		System.out.println("No data found");
	}else {
		t = head;
		for (int i = 1; i <= size; i++) {
			System.out.println(" "+ t.getData());
			t = t.getNext();
		}
	}
}
  class Node{
	public int data;
	public Node next;
	
	Node(int d) {
		data = d;
		next = null; 
		}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	

}





}
