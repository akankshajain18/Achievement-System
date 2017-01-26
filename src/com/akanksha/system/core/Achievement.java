package com.akanksha.system.core;

import com.akanksha.system.data.Player;

public interface Achievement {
	/*
	 * To set Winning point for an achievement
	 */
	void setWinPoint(int point);
	/*
	 * To get winning point of an achievement
	 */
	int getWinPoint();
	/*
	 * To get the name of achievement
	 */
	String getName();	
	/*
	 * To decide , award should be given or not to Player
	 */
	boolean isAwarded(Player player);

}
