package com.Linkedlist.udemy;

public class MyTutorial {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertFront(21);
		list.insertFront(23);
		list.insertFront(43);
		list.insertFront(22);
		list.insertFront(87);		
		list.insertAtEnd(100); 

		list.insertAtPosition(111, 0);
		list.insertAtPosition(222, 3);
		list.removeFromBegining();
		
		list.removeFromEnd();
		list.removeFromEnd();
		
//		list.removeMatched(43); Matched is not working
		list.removeFromPosition(3);
		
		list.printNodes();
		System.out.println();
		System.out.println("Count: "+list.getCount());
		
	}
	

}
