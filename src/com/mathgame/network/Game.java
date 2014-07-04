package com.mathgame.network;

/**
 * The Game class represents the various games and is used when
 * communicating with the database
 */
public class Game {
	
	private int ID; // which # game
	private int players; // # of players = 2
	private int rounds; // # of rounds
	private String type; // number type
	private String scoring; // scoring
	private String diff; // difficulty

	public Game() {
		
	}
	
	/**
	 * @param ID - The game ID
	 * @param players - The number of players
	 * @param type - The type of game (integer, fraction, etc.)
	 * @param scoring - The scoring method
	 * @param diff - The difficulty
	 * @param rounds - The number of rounds
	 */
	public Game (int ID, int players, String type, String scoring, String diff, int rounds) {
		this.ID = ID;
		this.players = players;
		this.rounds = rounds;
		this.type = type;
		this.scoring = scoring;
		this.diff = diff;
	}
	
	/**
	 * @return The game ID
	 */
	public int getID() {
		return ID;
	}
	
	/**
	 * @param ID - The game ID to set
	 */
	public void setID(int ID) {
		this.ID = ID;
	}
		
	/**
	 * @return The number of players
	 */
	public int getNumberOfPlayers() {
		return players;
	}
	
	/**
	 * @param players - The number of players to set
	 */
	public void setNumberOfPlayers(int players) {
		this.players = players;
	}
	
	/**
	 * @return The number of rounds
	 */
	public int getRounds() {
		return rounds;
	}
	
	/**
	 * @param rounds - The number of rounds to set
	 */
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	/**
	 * @return The type of game
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * @param type - The type of game to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * @return The scoring method
	 */
	public String getScoring() {
		return scoring;
	}
	
	/**
	 * @param scoring - The type of scoring method to set
	 */
	public void setScoring(String scoring) {
		this.scoring = scoring;
	}
	
	/**
	 * @return The difficulty of the game
	 */
	public String getDiff() {
		return diff;
	}
	
	/**
	 * @param diff - The game difficulty to set
	 */
	public void setDiff(String diff) {
		this.diff = diff;
	}
}