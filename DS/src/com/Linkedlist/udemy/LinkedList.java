package com.Linkedlist.udemy;

public class LinkedList {

	private Node head;
	private int count = 0;

	public LinkedList() {
		head = null;
	}

	public int getCount() {
		return count;
	}

	public int getLength(Node head) {
		Node currentNode = head;
		while (currentNode != null) {
			count++;
			currentNode = currentNode.getNext();
		}
		return count;
	}

	public void printNodes() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
	}

	public void insertFront(int data) {
		Node node = new Node(data);
		node.setNext(head);
		head = node;
		count++;
	}

	public void insertFrontNode(Node node) {
		node.setNext(head);
		head = node;
		count++;
	}

	public void insertAtEnd(int data) {
		if (head == null) {
			head = new Node(data);
			head.setNext(null);
			count++;
		} else {
			Node p = head;
			while (p.getNext() != null) {
				p = p.getNext();
			}
			p.setNext(new Node(data));
			count++;
		}
	}

	public void insertAtPosition(int data, int position) {
		if (position < 0) {
			position = 0;
		} else if (position > count) {
			position = count;
		}
		if (head == null) {
			head = new Node(data);
			head.setNext(null);
			count++;
		} else if (position == 0) {
			Node temp = new Node(data);
			temp.setNext(head);
			head = temp;
		} else {
			Node temp = head, newNode = new Node(data);
			for (int pos = 1; pos < position; pos++) {
				temp = temp.getNext();
			}
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);

		}
		count++;
	}

	public void removeFromBegining() {
		if (head == null) {
			System.out.println("No nodes present");
		} else {
			head = head.getNext();
			count--;
		}
	}

	public void removeFromEnd(){
		if(head==null){
			return;
		}
		
		Node current =head,temp=null;
		while(current.getNext()!=null){
			temp=current;
			current =current.getNext();
		}
		temp.setNext(null);
		count--;
	}

	public void removeMatched(int data){   ///Not Working
		Node node = new Node(data);
		if(head==null){
			return;
		}
		if(node.equals(head)){
			head = head.getNext();
			count--;
		}
		Node temp =  head, q=null;
		while(temp.getNext() != null){
			q=temp;
			if(temp.equals(node)){
				q.setNext(temp.getNext());
				count--;
			}
			temp=temp.getNext();			
		}
		
	}

	public void removeFromPosition(int position){
		if(position<0){
			position=0;
		}else if(position>count){
			position=count;
		}
		if(head==null){
			return;
		}else if(position==0){
			head=head.getNext();
			count--;
		}else{
			Node temp=head, q=null;
			for(int pos=1; pos<position; pos++){
				q=temp;
				temp=temp.getNext();
			}
			q.setNext(temp.getNext());
			count--;
		}
	}

}
