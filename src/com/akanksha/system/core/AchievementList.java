package com.akanksha.system.core;

import java.util.List;

public class AchievementList {

	private List<String> achievement = null;
	private List<Integer> winpoint = null;
	AchievementList(){
	
	}
	
	/*
	“Sharpshooter Award” – a user receives this for landing 75% of their attacks, assuming they have at least attacked once.
    “Bruiser” Award – a user receives this for doing more than 500 points of damage in one game
    “Veteran” Award – a user receives this for playing more than 1000 games in their lifetime.
    “Big Winner” Award – a user receives this for having 200 wins	
	*/
	
	/*
	 * Getter, Setter for Achievement List
	 */
	public List<String> getAchievment() {
		return achievement;
	}
	public void setAchievment(List<String> achievement) {
		this.achievement = achievement;
	}
	
	/*
	 * Getter, Setter for WinPoint
	 */
	public List<Integer> getWinpoint() {
		return winpoint;
	}

	public void setWinpoint(List<Integer> winpoint) {
		this.winpoint = winpoint;
	}
	
	/*
	 * To get size of achievement list.
	 * @return int
	 */
	public int getSize(){
		if(achievement!=null){
			return achievement.size();
		}
		return -1;
	}
	
	/*
	 * To check validity of list
	 * @return boolean
	 */
	public boolean isValid(){
		if(achievement!=null&&winpoint!=null){
			if(achievement.size()==winpoint.size()){
				return true;
			}
		}
		return false;
	}
	
	
}