package org.graymizu.jump.projects.cardgame;

public class CircularLinkedList {
	
	private Node head = null;
	private Node tail = null;
	private int size = 0;
	
	public CircularLinkedList() {
		
	}
	
	// Inserts player nodes and the end
	public void insert(Player p) {
		if(head == null) {
			head = new Node(p);
			tail = head;
			head.next(head);
			head.prev(head);
		} else {
			Node temp = new Node(p);
			temp.next(head);
			temp.prev(tail);
			head.prev(temp);
			tail.next(temp);
			tail = temp;		
		}
		size++;
	}
	
	public boolean isEmpty(){
		if(size == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		return size;
	}
	
	public String toString() {	
		if(head == null) {
			return "";
		}
		Node temp = head;
		String listOfPlayers = "";
		for (int i = 0; i < size; i++) {
			listOfPlayers += temp.person().toString() + " ";
			temp = temp.next();
		}
		return listOfPlayers;		
	}
	
	public String revToString() {	
		if(head == null) {
			return "";
		}
		System.out.println("Backwards: ");
		Node temp = tail;
		String listOfPlayers = "";
		for (int i = 0; i < size; i++) {
			listOfPlayers += temp.person().toString() + " ";
			temp = temp.prev();
		}
		return listOfPlayers;		
	}

}
