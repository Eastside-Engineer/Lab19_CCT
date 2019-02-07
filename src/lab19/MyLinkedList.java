package lab19;

//Only do LinkedList
public class MyLinkedList implements MyList {

	// head is the first node in the list. if null, the list is empty.
	private Node head = null;
	// for convenience, keep track of how many items are in the list
	private int length = 0;

	@Override
	public void addAtBeginning(String data) {
		// add a new node and set it as the new head
		// TODO #1
		Node node = new Node(data);
		node.setNext(head);
		head = node;
		length++;
	}

	public boolean removeAt(int index) {
		Node node = getNodeAt(index);
		Node next = getNodeAt(index + 1);
		if (index  < (length - 1)) {

			node.setData(next.getData());
			node.setNext(null);
			length--;
			return true;
		}
		if (index > (length-1)) {
	
		System.out.println("Out of range.");
		return false;
		}else {
			
			removeFromEnd();
			return true;
		}
	}
	public boolean insertAt(int index, String item) {
		
		Node prevNode = getNodeAt(index-1);
		Node newNode = new Node(item);
		Node oldNode = getNodeAt(index);
		//TODO set newNode to prevNode's next
		//TODO set oldNode to newNode's next

		if (index > 0 && index < length) {
			newNode.setNext(oldNode);
			prevNode.setNext(newNode);
			
			length++;
		return true;
		}else if (index == 0) {
			addAtBeginning(item);
		return true;
		}else{
			addAtEnd(item);
		
		System.out.println("Out of Range.");
		return false;
		}
	}

	@Override
	public void removeFromBeginning() {
		// find the second node and set it as the new head
		// TODO #4
		if (length == 0) {
			return; // do nothing.
		}
		head = head.getNext();
		length--;
	}

	@Override
	public void addAtEnd(String data) {
		// TODO Exercise
		Node newNode = new Node(data);
		Node tailNode = getNodeAt(length - 1);
		tailNode.setNext(newNode);
		length++;
	}
	

	@Override
	public void removeFromEnd() {
		if (length < 2) {
			// The beginning is the end.
			removeFromBeginning();
		} else {
			// TODO #5
			Node node = getNodeAt(length - 2);
			node.setNext(null);
			length--;
		}
	}

	@Override
	public String get(int index) {
		// TODO #3
		Node node = getNodeAt(index);
		if (node == null) {
			throw new IndexOutOfBoundsException();
		} else {
			return node.getData();
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// start at the head
		Node node = head;
		// follow the links between nodes until it reaches the end
		while (node!= null) {
			// TODO #2
			sb.append(node);
			node = node.getNext();
		}
		return sb.toString();
	}

	@Override
	public int size() {
		return length;
	}

	private Node getNodeAt(int index) {
		// start at the head
		Node node = head;
		// follow the links between nodes until it counts off the right number
		for (int i = 0; i < index; i++) {
			if (node == null) {
				// In case we run out of nodes before we get up to the desired index, return
				// null
				return null;
			}
			node = node.getNext();
		}
		return node;
	}

}