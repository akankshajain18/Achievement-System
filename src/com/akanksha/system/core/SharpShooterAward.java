package com.akanksha.system.core;

import com.akanksha.system.data.Player;

public class SharpShooterAward implements Achievement {

	private static final String Name = SharpShooterAward.class.getSimpleName();
	private static int winPoint = 0;

	public SharpShooterAward() {
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
		if (player.getGs()[0].getHits() >= (0.75 * player.getGs()[0].getAttempted_attack())) {
			return true;
		}
		return false;
	}}