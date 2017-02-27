package app;

import java.util.Random;

import UserInteraction.UserInput;
import models.Enemy;
import models.Player;

public class Engine {

	static Random rand = new Random();
	static Player currentPlayer;
	
	public static void run()
	{
			
		System.out.println("Welcome to PiratesBay!");
		//Difficulty is the int that's returned. Difficulty is derived from the preset.
		int characterDifficulty = characterSelection();
		generateEnemy(currentPlayer.getCrewCount(), characterDifficulty);
	}
	
	public static void combat()
	{	
		UserInput.combatMenu();
		int playerChoice = UserInput.userResponseToMenu(3);
		
		int enemyChoice = rand.nextInt(2) + 1;
		
		calcCombatResult(playerChoice, enemyChoice);
	}
	
	public static void calcCombatResult(int playerChoice, int enemyChoice)
	{
		boolean escaped;
		if(playerChoice == 3)
		{
			if(enemyChoice == 1)
			{
				
			}
			else
			{
				
			}
			
			escaped = rand.nextBoolean();
		}
		else
		{
			if(playerChoice == 1 && enemyChoice == 1)
			{
				
			}
			else if(playerChoice == 2 && enemyChoice == 2)
			{
				
			}
			else if(playerChoice == 1 && enemyChoice == 2)
			{
				
			}
			else if(playerChoice == 2 && enemyChoice == 1)
			{
				
			}
		}
	}
	
	public static void move()
	{
		
	}
	
	public static int characterSelection(){
		
		UserInteraction.UserInput.presetMenu();
		int selection = UserInteraction.UserInput.userResponseToMenu(4);
		String nameCaptain = UserInteraction.UserInput.promptForInput("Enter your capitan's name: ", false);
		currentPlayer = new Player(selection, nameCaptain);
		
		return selection;
	}
	
	public static Enemy generateEnemy(int playerCrew, int difficultySelection){
		
		Enemy e = new Enemy(playerCrew, difficultySelection);
		return e;
	}
}
