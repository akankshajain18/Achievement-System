package com.akanksha.system.core;

import java.util.HashMap;
import java.util.Map;


public class AwardFactory {
	private Map<String, Achievement> awardsMap;
	public AwardFactory() {
		awardsMap = new HashMap<String, Achievement>();
	}
	
	/*
	 * Getter method for Achievement Maps
	 * @return Map<String, Achievement>
	 */	
	public Map<String, Achievement> getAwardsMap() {
		return awardsMap;
	}

	/*
	 *To populate map for awardType and its instance if it is not already present in MAP 
	 *otherwise it will return stored instance.
	 *{Avoid creating new instance for each player}
	 *@return Achievement instance.
	 */
	public Achievement getAwardInstance(String awardType) {
		Achievement retAward = null;
		if (awardType.equalsIgnoreCase("SharpShooterAward")) {
			if (!awardsMap.containsKey(awardType)) {
				awardsMap.put(awardType, new SharpShooterAward());
			}
			retAward = awardsMap.get(awardType);
		} else if (awardType.equalsIgnoreCase("VeteranAward")) {
			if (!awardsMap.containsKey(awardType)) {
				awardsMap.put(awardType, new VeteranAward());
			}
			retAward = awardsMap.get(awardType);
		} else if (awardType.equalsIgnoreCase("BigWinnerAward")) {
			if (!awardsMap.containsKey(awardType)) {
				awardsMap.put(awardType, new BigWinnerAward());
			}
			retAward = awardsMap.get(awardType);
		} else if (awardType.equalsIgnoreCase("BruiserAward")) {
			if (!awardsMap.containsKey(awardType)) {
				awardsMap.put(awardType, new BruiserAward());
			}
			retAward = awardsMap.get(awardType);
		}

		return retAward;
	}

}
