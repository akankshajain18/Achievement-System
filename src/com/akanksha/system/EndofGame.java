package com.akanksha.system;

public class EndofGame {
	
	/*
	 * After game is finished, Data file will be stored in res folder which contain statistics about
	 * game and its players. {data.json}
	 * And all achievements to be awarded in for particular game , will also be given in json form [achievement.json]
	 * 
	 */
	public static void main(String[] args) {

		GameController controller = GameController.getGameInstance();
		controller.initializeAwardSettings();
		controller.assignGameAwards();
	}

}
