package com.akanksha.system.data;


/*
 * POJO for storing Player details
 * Contain gameSpecificStats and historicslStats of player
 */
public class Player {
	private String name;
	private GameSpecificStats[] gameSpecificStats;
	private HistoricalStats[] historicalStats;
	
	Player(){
		
	}
	Player(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HistoricalStats[] getHs() {
		return historicalStats;
	}
	public void setHs(HistoricalStats[] hs) {
		this.historicalStats = hs;
	}
	public GameSpecificStats[] getGs() {
		return gameSpecificStats;
	}
	public void setGs(GameSpecificStats[] gs) {
		this.gameSpecificStats = gs;
	}

	
}
