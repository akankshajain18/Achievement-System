package com.akanksha.system.core;

import com.akanksha.system.data.Player;

public class BruiserAward implements Achievement{
	
    private final String Name = BruiserAward.class.getSimpleName();  
    private static int winPoint=0;
    public BruiserAward(){  
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
		if(player.getGs()[0].getDamage_done()>=getWinPoint()){
			return true;
		}
		return false;

	}}
