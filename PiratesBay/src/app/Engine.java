package app;

import java.util.HashMap;
import java.util.Random;

import UserInteraction.UserInput;
import models.Enemy;
import models.Island;
import models.Loot;
import models.Player;

public class Engine 
{
	private static Random rand = new Random();
	private static Player currentPlayer;
	private static int characterDifficulty;
	private static HashMap<String, Island> islands = new HashMap<>();
	
	public static void run()
	{
		generateIslands();
		
		characterDifficulty = characterSelection();
		System.out.println(currentPlayer.toString());
			
		boolean finishGame = false;
		do{
			UserInput.displayMainScreen();
			int choice = UserInput.userResponseToMenu(4);
			
			if(choice == 1)
			{
				combat();
			}
			else if(choice == 2)
			{
				UserInput.displayIslands(islands);
				int islandChoice = UserInput.userResponseToMenu(islands.size());
				
				if((rand.nextInt(100)+1) > 75)
				{
					System.out.println("You were attacked!");
					combat();
				}
				
				move();
			}
			else if(choice == 3)
			{
				System.out.println(currentPlayer.getLoot().values());
			}
			else if(choice == 4)
			{
				finishGame = true;
			}
		}while(!finishGame);
	}
	
	public static void combat()
	{
		Enemy enemy = generateEnemy(currentPlayer.getCrewCount(), characterDifficulty);
		
		boolean playerWon = false;
		boolean endCombat = false;
		do{
			System.out.println(currentPlayer.getCaptainName() + "\n" + currentPlayer.getCrewCount() + "\n--------------------");
			System.out.println(enemy.getCaptainName() + "\n" + enemy.getCrewCount() + "\n---------------------");
			
			UserInput.combatMenu();
			int playerChoice = UserInput.userResponseToMenu(3);
			System.out.println("you chose: " + playerChoice);
			
			int enemyChoice = rand.nextInt(2) + 1;
			System.out.println("Enemy chose: " + enemyChoice);
			
			endCombat = calcCombatResult(playerChoice, enemyChoice, enemy);
			
			
			if(!endCombat)
			{
				if(enemy.getCrewCount() <= 0)
				{
					endCombat = true;
					playerWon = true;
				}
				
				if(currentPlayer.getCrewCount() <=0)
				{
					endCombat = true;
					playerWon = false;
				}
			}
		}while(!endCombat);
		
		if(playerWon)
		{
			System.out.println("Yay you win!");
		}
		else
		{
			System.out.println("NOOOOOOOOO! you lose :(");
		}
		
	}
	
	public static boolean calcCombatResult(int playerChoice, int enemyChoice, Enemy enemy)
	{
		boolean escaped = false;
		if(playerChoice == 3)
		{
			if(enemyChoice == 1)
			{
				currentPlayer.takeDamage(enemy.getATK());
			}
			
			escaped = rand.nextBoolean();
		}
		else
		{
			if(playerChoice == 1 && enemyChoice == 1)
			{
				currentPlayer.takeDamage(enemy.getATK()*2);
				enemy.takeDamage(currentPlayer.getATK()*2);
			}
			else if(playerChoice == 2 && enemyChoice == 2)
			{
				currentPlayer.takeDamage(enemy.getDEF()/3);
				enemy.takeDamage(currentPlayer.getDEF()/3);
			}
			else if(playerChoice == 1 && enemyChoice == 2)
			{
				enemy.takeDamage(currentPlayer.getATK() - enemy.getDEF());
			}
			else if(playerChoice == 2 && enemyChoice == 1)
			{
				currentPlayer.takeDamage(enemy.getATK() - currentPlayer.getDEF());
			}
		}
		
		return escaped;
	}
	
	public static void move()
	{
		boolean isValid = false;
		do{
			UserInput.displayIsland();
			int menuChoice = UserInput.userResponseToMenu(5);
			
			switch(menuChoice)
			{
			case 1:
				combat();
				break;
			case 2:
				System.out.println("Taking Loot........\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				
				int numOfLoot = rand.nextInt(5) + 1;
				
				for(int i = 0; i < numOfLoot; i++)
				{
					currentPlayer.addLoot(new Loot());
				}
				break;
			case 3:
				break;
			case 4:
				System.out.println("Selling your loot at the local markets......");
//				for(int i = 0; i < currentPlayer.getLoot().size(); i++)
//				{
//					currentPlayer.setGold(currentPlayer.getLoot());
//				}
				break;
			case 5:
				System.out.println("Sailing back to the ocean blue.........");
				isValid = true;
				break;
			}
		}while(!isValid);
	}
	
	public static int characterSelection()
	{
		UserInput.presetMenu();
		int selection = UserInput.userResponseToMenu(4);
		String nameCaptain = UserInput.promptForInput("Enter your capitan's name: ", false);
		currentPlayer = new Player(selection, nameCaptain);
		
		return selection;
	}
	
	public static Enemy generateEnemy(int crewReference, int difficulty){
		
		Enemy e = new Enemy(crewReference, difficulty);
		return e;
	}
	
	public static void generateIslands()
	{
		Island island = new Island();
		islands.put(island.getName(), island);
	}
	
	public static void generateLoot()
	{
		currentPlayer.addLoot(new Loot());
	}
}
