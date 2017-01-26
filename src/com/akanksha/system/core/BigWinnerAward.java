package com.akanksha.system.core;

import com.akanksha.system.data.Player;

public class BigWinnerAward implements Achievement{
	
    private final String Name = BigWinnerAward.class.getSimpleName();  
    private static int winPoint=0;
    public BigWinnerAward(){  
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
		if (player.getHs()[0].getWin_count() >=getWinPoint())
			return true;
		return false;
	}}