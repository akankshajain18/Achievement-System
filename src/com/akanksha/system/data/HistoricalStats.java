package com.akanksha.system.data;


/*
 * Class contain historical Statistics of player
 * 
 */
public class HistoricalStats {
	
	private int win_count;
	private int total_game_played;
	private int total_played_duration;
	private int total_kills;
	HistoricalStats(){
		
	}
	
	public int getWin_count() {
		return win_count;
	}
	public void setWin_count(int win_count) {
		this.win_count = win_count;
	}

	public int getTotal_game_played() {
		return total_game_played;
	}
	public void setTotal_game_played(int total_game_played) {
		this.total_game_played = total_game_played;
	}
	public int getTotal_played_duration() {
		return total_played_duration;
	}
	public void setTotal_played_duration(int total_played_duration) {
		this.total_played_duration = total_played_duration;
	}
	public int getTotal_kills() {
		return total_kills;
	}
	public void setTotal_kills(int total_kills) {
		this.total_kills = total_kills;
	}

}
