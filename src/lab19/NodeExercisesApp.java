package lab19;

public class NodeExercisesApp {

	public static void main(String[] args) {
		addAToBeginning();
		addCToEnd();
		addBToMiddle();
		removeAFromBeginning();
		removeCFromEnd();
		removeBFromMiddle();
	}
	
	private static void addAToBeginning() {
		Node c = new Node("C");
		Node b = new Node("B", c);
		Node a = new Node("A");
		
		//Add new code 
		a.setNext(b);
		b.setNext(c);
		
		
		test("addAToBeginning", b);
	}
	
	private static void addCToEnd() {
		Node b = new Node("B");
		Node a = new Node("A", b);
		Node c = new Node("C");
		
		b.setNext(c);
		
		test("addBToEnd", a);
	}
	
	private static void addBToMiddle() {
		Node c = new Node("C");
		Node a = new Node("A", c);
		Node b = new Node("B");
		
		a.setNext(b);
		b.setNext(c);
		
		test("addBToMiddle", a);
	}
	
	private static void removeAFromBeginning() {
		Node c = new Node("C");
		Node b = new Node("B", c);
		Node a = new Node("A", b);
		
		a.setData(" ");
		
		test("removeAFromBeginning", a);
	}
	
	private static void removeCFromEnd() {
		Node c = new Node("C");
		Node b = new Node("B", c);
		Node a = new Node("A", b);
		
		b.setNext(c);
		test("removeCFromEnd", a);
	}
	
	private static void removeBFromMiddle() {
		Node c = new Node("C");
		Node b = new Node("B", c);
		Node a = new Node("A", b);
		
		a.setNext(c);
		
		test("removeBFromMiddle", a);
	}
	
	/**
	 * Use this to test a linked list. It will print the nodes in order.
	 * 
	 * Don't change this code.
	 * 
	 * @param start The first node in the list (aka the head)
	 */
	private static void test(String description, Node start) {
		System.out.print(description + ": ");
		Node n = start;
		int count = 0;
		while (n != null) {
			System.out.print(n);
			n = n.getNext();
			if (count++ == 20) {
				System.out.print("\nERROR: infinite cycle detected in list.");
				break;
			}
		}
		System.out.println();
	}

}