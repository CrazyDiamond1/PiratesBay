package app;

import models.Player;

public class Engine {

	static Player currentPlayer;
	
	public static void run()
	{
			
		System.out.println("Welcome to PiratesBay!");
		//Difficulty is the int that's returned. Difficulty is derived from the preset.
		int difficultySelection = characterSelection();
	}
	
	public static void combat()
	{
		
	}
	
	public static void move()
	{
		
	}
	
	public static int characterSelection(){
		
		UserInteraction.UserInput.presetMenu();
		int selection = UserInteraction.UserInput.userResponseToMenu();
		String nameCaptain = UserInteraction.UserInput.promptForInput("Enter your capitan's name: ", false);
		currentPlayer = new Player(selection, nameCaptain);
		
		return selection;
	}
	
//	public static Character encounter()
//	{
//		
//	}
}
