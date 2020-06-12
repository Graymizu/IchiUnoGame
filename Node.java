package org.graymizu.jump.projects.cardgame;

public class Node {
	
	private Player person;
	private Node next, prev;
	
	// Node constructor
	public Node (Player person) {
		this.person = person;
	}

	// Getters and setters to access private data
	public Player person() {
		return person;
	}

	public Node next() {
		return next;
	}

	public void next(Node next) {
		this.next = next;
	}

	public Node prev() {
		return prev;
	}

	public void prev(Node prev) {
		this.prev = prev;
	}

}
