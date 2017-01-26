package com.akanksha.system.core;

import com.akanksha.system.data.Player;

public class VeteranAward implements Achievement {

	private final String Name = VeteranAward.class.getSimpleName();
	private static int winPoint = 0;

	public VeteranAward() {
	}

	@Override
	public void setWinPoint(int point) {
		winPoint = point;
	}

	@Override
	public int getWinPoint() {
		return winPoint;
	}

	@Override
	public String getName() {
		return Name;

	}

	@Override
	public boolean isAwarded(Player player) {
		if(player.getHs()[0].getTotal_game_played()>=getWinPoint()){
			return true;
		}
		return false;
	}}
