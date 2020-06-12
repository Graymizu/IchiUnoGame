package org.graymizu.jump.projects.cardgame;

import java.util.Stack;
import java.util.Collections;

public class Deck {
	
	static Stack<Card> deck;
	static Stack<Card> pile;
	
	Deck() {
		deck = new Stack<>();
		pile = new Stack<>();
	}
	
	// The part of the draw card functionality that works directly with the deck
	static Card draw() {
		if(deck.isEmpty()) {
			Deck.resizeDeck();
		}
		return deck.pop();
	}
	
	// The part of the play card functionality that works directly with the deck
	static void play(Card card) {
		pile.push(card);
	}
	
	static void createDeck() {
		
	}
	
	static void shuffle() {
		Collections.shuffle(deck);
	}
	
	// Recreates the deck when there are no more cards to draw
	static void resizeDeck() {
		Card temp = pile.pop();		
		deck = pile;
		pile.clear();
		Deck.shuffle();
		pile.push(temp);
		
	}

}
