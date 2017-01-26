package com.akanksha.system.data;

/*
 * POJO for storing Game statistics
 * Contain player list and other game information
 */
public class Game {
	String game_id;
    int num_player;
    long start_time;
    long end_time;
    private Player[] winner_team_player;
    private Player[] looser_team_player;
    
    public Game(){
    	
    }
	public String getGame_id() {
		return game_id;
	}
	public void setGame_id(String game_id) {
		this.game_id = game_id;
	}
	public int getNum_player() {
		return num_player;
	}
	public void setNum_player(int num_player) {
		this.num_player = num_player;
	}
	public long getStart_time() {
		return start_time;
	}
	public void setStart_time(long start_time) {
		this.start_time = start_time;
	}
	public long getEnd_time() {
		return end_time;
	}
	public void setEnd_time(long end_time) {
		this.end_time = end_time;
	}
	public Player[] getWinner_team_player() {
		return winner_team_player;
	}
	public void setWinner_team_player(Player[] winner_team_player) {
		this.winner_team_player = winner_team_player;
	}
	public Player[] getLooser_team_player() {
		return looser_team_player;
	}
	public void setLooser_team_player(Player[] looser_team_player) {
		this.looser_team_player = looser_team_player;
	}
	
	/*
	 * To check Validity of loaded data.
	 */
   public boolean isValidData(){
	   if(winner_team_player!=null&&looser_team_player!=null){
		   if(winner_team_player.length==looser_team_player.length){
			   return true;
		   }
	   }
	   return false;
   }
    

}
