package org.graymizu.jump.projects.cardgame;

public class Card {
	
	Card(){
		
	}
	
	// Using enums to give each card their type and color
	public enum Type {
		ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAW2, WILD, DRAW4;
	}
	
	public enum Color {
		YELLOW, GREEN, BLUE, RED, CHANGE; 
	}
	
	boolean isPlayable() {
		return false;
		
	}

}
