package com.akanksha.system.data;

/*
 * Class contain information of all game specific Statistics of a player.
 * 
 */
public class GameSpecificStats {
	
	private int attempted_attack;
	private int hits;
	private long damage_done;
	private long current_kills;
	private int first_hit_kills;
	private int assists;
	private int spells_cast;
	private int spell_damage_done;
	//current Game
	private int total_played_time;
	public GameSpecificStats(){
		
	}
	
	
	public int getAttempted_attack() {
		return attempted_attack;
	}
	public void setAttempted_attack(int attempted_attack) {
		this.attempted_attack = attempted_attack;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public long getDamage_done() {
		return damage_done;
	}
	public void setDamage_done(long damage_done) {
		this.damage_done = damage_done;
	}
	public long getCurrent_kills() {
		return current_kills;
	}
	public void setCurrent_kills(long current_kills) {
		this.current_kills = current_kills;
	}
	public int getFirst_hit_kills() {
		return first_hit_kills;
	}
	public void setFirst_hit_kills(int first_hit_kills) {
		this.first_hit_kills = first_hit_kills;
	}
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	public int getSpells_cast() {
		return spells_cast;
	}
	public void setSpells_cast(int spells_cast) {
		this.spells_cast = spells_cast;
	}
	public int getSpell_damage_done() {
		return spell_damage_done;
	}
	public void setSpell_damage_done(int spell_damage_done) {
		this.spell_damage_done = spell_damage_done;
	}
	public int getTotal_played_time() {
		return total_played_time;
	}
	public void setTotal_played_time(int total_played) {
		this.total_played_time = total_played;
	}

}
