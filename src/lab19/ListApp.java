package lab19;


public class ListApp {

	public static void main(String[] args) {
//		testArrayList();
		testLinkedList();
	}
	
//	private static void testArrayList() {
////		MyArrayList list = new MyArrayList();
//		
//		list.addAtBeginning("B");
//		list.addAtBeginning("A");
//		list.addAtEnd("C");
//		list.addAtEnd("D");
//		list.removeFromBeginning();
//		list.removeFromEnd();
//		
//		System.out.println(list);
//		System.out.println(list.size());
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//	}
	
	private static void testLinkedList() {
		MyLinkedList list = new MyLinkedList();
		
		list.addAtBeginning("C");
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		list.addAtEnd("C");
		list.addAtEnd("D");
//		list.removeFromBeginning();
//		list.removeFromEnd();
		list.removeAt(2);
		list.insertAt(1, "P");
		
		System.out.println(list);
//		System.out.println(list.size());
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
	}

}