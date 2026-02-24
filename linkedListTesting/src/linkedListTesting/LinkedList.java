package linkedListTesting;

public class LinkedList {
	Node head;
	
	public LinkedList() {
		head = null;
	}
	
	
	public boolean listIsEmpty() {
		if(head == null) 
			return true;
		
		return false;
	}
	
	public void appendNode(int val) {
		Node newNode = new Node();
		newNode.age = val;
		if(listIsEmpty()) {
			head = newNode;
		}else {
			Node tmpNode = head;
			while(tmpNode.next != null) {
				tmpNode = tmpNode.next;
			}
			tmpNode.next = newNode;
		}
	}
	
	public void insertAfterNode(int sVal, int newV) {
		Node newNode = new Node();
		Node prevNode;
		newNode.age = newV;
		
		if(listIsEmpty()) {
			head = newNode;
		}else {
			Node tmpNode = head;
			prevNode = null;
			while(tmpNode != null && tmpNode.age != sVal) {
				prevNode = tmpNode;
				tmpNode = tmpNode.next;
			}
			
			if(tmpNode != null) {
				newNode.next = tmpNode.next;
				tmpNode.next = newNode;
			}else {
				prevNode.next = newNode;
			}
		}
		
	}
	
	public boolean deleteNode(int del) {
		if(listIsEmpty()) 
			return false;
		if(head.age == del) {
			head = head.next;
			return true;
		}else {
			Node cNode = head.next;
			Node pNode = head;
			
			while(cNode != null && cNode.age != del) {
				pNode = cNode;
				cNode = cNode.next;
			}
			if(cNode != null) {
				pNode.next = cNode.next;
				return true;
			}
		}
		return false;
	}
	
		
	public String toString() {
		Node start = head;
			
		String str = "";
			
		if(start == null)
			return "list empty";
			
		while(start.next != null) {
			str += start.age + " -> ";
			start = start.next;
		}
		str += start.age + ".";
		return str;
		
	}
	
}
