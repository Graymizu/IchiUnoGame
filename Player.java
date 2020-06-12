package org.graymizu.jump.projects.cardgame;

import java.util.LinkedList;

public class Player {
	
	LinkedList<Card> myHand;
	String playerName = "Player ";
	static int playerId = 0;
	boolean myTurn = false;
	
	Player(){
		playerId++;
		playerName += playerId;
	}

	@Override
	public String toString() {
		return "[" + playerName + "]";
	}

	public String getPlayerName() {
		return playerName;
	}

	public static int getPlayerId() {
		return playerId;
	}

	public static void setPlayerId(int playerId) {
		Player.playerId = playerId;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}



}
