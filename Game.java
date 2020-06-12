package org.graymizu.jump.projects.cardgame;

public class Game {
	
	CircularLinkedList players;
	boolean orderIsReversed;
	
	// Default game is created with two players
	Game() {
		players = new CircularLinkedList();
		players.insert(new Player());
		players.insert(new Player());
	
		System.out.println("There are " + Player.getPlayerId() + " players in this game.");
		
		System.out.println(players.toString());	
		System.out.println(players.revToString());
		
	}
	
	// Overloaded constructor for creating a multi-player game of at least two
	Game(int numberOfPlayers) {
		if(numberOfPlayers < 2) {
			System.out.println("You at least need two players to play this game.");
			numberOfPlayers = 2;
		} // Check to make sure that there are at least two players and adds all players to a LinkedList
		players = new CircularLinkedList();
		for (int i = 0; i < numberOfPlayers; i++) {
			players.insert(new Player());
		}
		System.out.println("There are " + Player.getPlayerId() + " players in this game.");
	}
	
	void firstTurn() {
		
	}
	
	void nextTurn() {
		
	}

	public String toString() {
		System.out.println("There are " + Player.getPlayerId() + " players in this game." + players.size());
		return players.toString();
	}
}
