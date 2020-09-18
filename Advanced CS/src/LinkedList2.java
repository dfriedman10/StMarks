import java.util.AbstractList;

import LinkedList.Node;

public class LinkedList2<T> extends AbstractList<T> {
	
	private Node head;
	
	
	private class Node {
		
		private Node next;
		private T info;
		
		
		public Node(T info) {
			this.info = info;
		}
		
		public Node (T info, Node next) {
			this.next = next;
			this.info = info;
		}
	}
	
	
	public boolean add(T info) {
		
		if (head == null) {
			head = new Node(info);
			return true;
		}
		
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		
		curr.next = new Node(info);
		
		return true;
		
	}

	
	public boolean add(int i, T info) {
		
	}
	
	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
	// index must be within our list
	public T remove (int index) {
		
		Node curr = head;
		for (int i = 0; i < index-1; i++) {
			curr = curr.next;
		}
		
		Node temp = curr.next;
		curr.next = curr.next.next;
		
		return temp.info;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		if (size() == 0) return "[ ]";
		String output = "[";
		Node curr = head;
		while (curr != null) {
			output += curr.info.toString() + ", ";
			curr = curr.next;
		}
		return output.substring(0,output.length()-2) +"]";
	}
	
	public static void main(String[] args) {
		LinkedList2<String> myList = new LinkedList2<String>();
		
		myList.add("hi");
		myList.add("hello");
		System.out.println(myList);
	}
}
