package com.akanksha.system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import com.akanksha.system.core.Achievement;
import com.akanksha.system.core.AchievementList;
import com.akanksha.system.core.AwardFactory;
import com.akanksha.system.data.Game;
import com.akanksha.system.data.Player;
import com.akanksha.system.util.GameUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GameController{

	private static final String TAG = GameController.class.getSimpleName();
	private static GameController mGameController;
	private AwardFactory mAwardFactory;
	private GameController() {
		mAwardFactory = new AwardFactory();
	}
	
	
	/*
	 * To Create GameController instance and call other API's
	 * Singleton design pattern :  only instance will be active at a time.
	 * @return GameController instance
	 */
	public static synchronized GameController getGameInstance() {
		if(mGameController == null) {
			mGameController = new GameController();
		}
		return mGameController;
	}
	
	
    /*
     * To Load Game statistics from data.json file stored in res folder.
     * @return Game : statistics of game, winning team and loosing team
     */
	private synchronized Game loadData() {
	   /*
	    * Get Gson object
	    */
		Game game = null;
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(GameUtil.GAMEDATA_PATH));
			/*
			 * parse json to object
			 */
			game = gson.fromJson(reader, Game.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return game;

	}

	 /*
     * To Load list of Achievements to be given in the game from achievment.json file stored in res folder.
     * @return AchievementList : list of awards to be distributed
     */
	private synchronized AchievementList populateAchievments() {
		/* 
		 * Get Gson object
		 */
		AchievementList achievementList = null;
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		//Gson gson = new GsonBuilder().registerTypeAdapter(Achievment.class,
				//new InstanceAdapter<Achievment>()).create();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(GameUtil.ACHIEVEMENTLIST_PATH));
			/*
			 * parse json to object
			 */
			achievementList = gson.fromJson(reader, AchievementList.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return achievementList;

	}	
	

	/*
	 * Initialize the win point for all Achievement.
	 * @return void
	 */	
	public synchronized void initializeAwardSettings() {
		AchievementList achievementList = populateAchievments();
		Achievement awardInstance;
		if(achievementList.isValid()){
		for (int i =0;i<achievementList.getSize();i++) {
			String award = achievementList.getAchievment().get(i);
			int winpoint = achievementList.getWinpoint().get(i);
			awardInstance = mAwardFactory.getAwardInstance(award);
			if (awardInstance != null) {
				/* Set win point for each achievement*/
				awardInstance.setWinPoint(winpoint);
			}
		}
		}else{
			System.out.println(TAG +" : " + "Achievement List was not populated correctly or data is not populated in file");
		}
	}


	/*
	 * To Call method to load data from json file to object and 
	 * Assign Awards to player of winning team
	 * @return void
	 */
	public synchronized void assignGameAwards() {
		Game game = loadData();
		if (game.isValidData()) {
			Map<String, Achievement> awardsMap = mAwardFactory.getAwardsMap();

			for (int i = 0; i < game.getWinner_team_player().length; i++) {
				Player p = game.getWinner_team_player()[i];

				StringBuilder sb = new StringBuilder();
				sb.append("Player " + p.getName() + " has been awarded with ");

				for (Achievement award : awardsMap.values()) {
					if (award.isAwarded(p))
						sb.append(award.getName() + " ");
				}
				System.out.println(sb.toString());
			}
		}
	}


}
