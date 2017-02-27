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
//		generateEnemy(currentPlayer.getCrewCount(), characterDifficulty);
		createEnemiesForTestingValues(currentPlayer.getCrewCount(), characterDifficulty);
	}
	
	public static void combat()
	{	
		UserInput.combatMenu();
		int playerChoice = UserInput.userResponseToMenu(3);
		
		int enemyChoice = rand.nextInt(2) + 1;
		
		Enemy enemy = generateEnemy(currentPlayer.getCrewCount(), 1);
		
		calcCombatResult(playerChoice, enemyChoice, enemy);
		
		if(enemy.getCrewCount() <= 0)
		{
			
		}
		else
		{
			
		}
	}
	
	public static void calcCombatResult(int playerChoice, int enemyChoice, Enemy enemy)
	{
		boolean escaped;
		if(playerChoice == 3)
		{
			if(enemyChoice == 1)
			{
				currentPlayer.setCrewCount(currentPlayer.getCrewCount() - enemy.getATK());
			}
			
			escaped = rand.nextBoolean();
		}
		else
		{
			if(playerChoice == 1 && enemyChoice == 1)
			{
				currentPlayer.setCrewCount(currentPlayer.getCrewCount() - (enemy.getATK()/2));
				enemy.setCrewCount(enemy.getCrewCount() - (currentPlayer.getATK()/2));
			}
			else if(playerChoice == 2 && enemyChoice == 2)
			{
				currentPlayer.setCrewCount(currentPlayer.getCrewCount() - (enemy.getDEF()/3));
				enemy.setCrewCount(enemy.getCrewCount() - (currentPlayer.getDEF()/3));
			}
			else if(playerChoice == 1 && enemyChoice == 2)
			{
				enemy.setCrewCount(enemy.getCrewCount() - (currentPlayer.getATK()-enemy.getDEF()));
			}
			else if(playerChoice == 2 && enemyChoice == 1)
			{
				currentPlayer.setCrewCount(currentPlayer.getCrewCount() - (enemy.getATK()-currentPlayer.getDEF()));
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
	
	public static Enemy generateEnemy(int crewReference, int difficulty){
		
		Enemy e = new Enemy(crewReference, difficulty);
		return e;
	}
	
	public static void createEnemiesForTestingValues(int crewReference, int difficulty){
		
		for(int i = 0; i < 10; i++){
		
			Enemy e = new Enemy(crewReference, difficulty);
			System.out.println("Captain: " + e.getCaptainName());
			System.out.println("Crew: "+ e.getCrewCount());
			System.out.println("ATK: "+ e.getATK());
			System.out.println("DEF: "+ e.getDEF());
		}
	}
}
