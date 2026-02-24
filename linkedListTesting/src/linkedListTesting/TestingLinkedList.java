package linkedListTesting;

public class TestingLinkedList {

	public static void main(String[] args) {
		
		LinkedList ageList = new LinkedList();
		
		ageList.appendNode(15);
		ageList.appendNode(16);
		ageList.appendNode(18);
		ageList.appendNode(11);
		ageList.appendNode(13);
		ageList.appendNode(14);
		ageList.appendNode(19);
		
		
		System.out.println("Inital List " + ageList);

	}

}
