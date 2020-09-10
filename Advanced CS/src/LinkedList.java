import java.util.AbstractList;

public class LinkedList<E> extends AbstractList<E> {

	private Node head;	// the first element in the list
	private int size;	// the number of elements in the list
	
	
	// an inner class to represent a "node". these nodes will keep
	// track of an element's information, along with which element comes after it
	private class Node {
		
		private Node next;
		private E info;
		
		// we'll give this class 2 constructors - one for when the new
		// node has an element after it, and one for when the new node is \
		// last in the list (has no 'next')
		public Node(E info, Node next) {
			this.info = info;
			this.next = next;
		}
		
		public Node(E info) {
			this.info = info;
		}
	}
	
	@Override
	// adds a new element to the end of the list
	public boolean add(E info) {
		Node node = new Node(info);
		
		// if there's nothing in the list, just make this new element
		// the first thing in the list
		if (head == null) 
			head = node;
		
		// otherwise, search through the list until we get to the end 
		// (until there is no next). Add the new element as the 'next'
		// for the previously last element.
		else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			
			curr.next = node;
		}
		
		size++;
		return true;	// this is just to match AbstractList's typing
	}
	
	@Override
	// adds a new element to the list at index i
	public void add(int index, E info) {
		
		// try/catch to keep track of indexing errors
		try {
			
			// if we're adding to the front of the list, make this new 
			// element the head and make the previous head it's 'next'
			if (index == 0) 
				head = new Node(info, head);
			
			// otherwise, iterate through the list until you reach the desired index
			else {
				Node curr = head;
				for (int i = 0; i < index-1; i++) {
					curr = curr.next;
				}
				curr.next = new Node(info, curr.next);
			}
			
			// if we successfully add an element, increase the size
			size ++;
		}
		
		// if we ever try to access a 'next' when there is no next element,
		// we'll turn the np exception into an iob exception
		catch(NullPointerException e) {
			throw(new IndexOutOfBoundsException());
		}
	}


	@Override
	// searches through the list until it reaches the desired index
	public E get(int index) {
		try {
			Node curr = head;
			for (int i = 0; i < index; i++) {
				curr = curr.next;
			}
			return curr.info;
		}
		
		// same catch as add
		catch(NullPointerException e) {
			throw(new IndexOutOfBoundsException());
		}
	}
	
	@Override
	// removes and returns the element at the desired index
	// Note: the removed element will still exist in memory, and will still
	// hold a 'next' element. But there will be no way to access this node, so
	// it will be essentially gone
	public E remove(int index) {
		try {
			if (index == 0) {
				Node temp = head;	// save this element so we can return it later
				head = head.next;	// set the second element to be the first
				size--;
				return temp.info;
			}
			else {
				// search through the list until we reach the element one index before 
				// the desired element
				Node curr = head;
				for (int i = 0; i < index-1; i++) {
					curr = curr.next;
				}
				
				// at this index, link the previous and next elements together, thus 
				// removing the current element
				Node temp = curr.next;
				curr.next = curr.next.next;
				size--;
				return temp.info;
			}
		}
		
		// same catch as add/get
		catch(NullPointerException e) {
			throw(new IndexOutOfBoundsException());
		}
	}

	@Override
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		if (size == 0) return "[ ]";
		String output = "[";
		Node curr = head;
		while (curr != null) {
			output += curr.info.toString() + ", ";
			curr = curr.next;
		}
		return output.substring(0,output.length()-2) +"]";
	}
	
	// test our code!
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("Iron Man");
		myList.add("Hulk");
		myList.add(1, "CA");
		myList.add(2,"Hawkeye");
		
		System.out.println(myList);		// add seems to be working fine
		
		System.out.println(myList.get(0));
		System.out.println(myList.get(2));		// get seems to work
		
		myList.remove(1);
		myList.remove(1);
		System.out.println(myList);		// remove works
		
		System.out.println(myList.size); 	// size is correct
		
		myList.add(5, "Thor");		// successfully crashes when it should
	}
}
