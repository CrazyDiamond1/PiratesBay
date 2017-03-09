package userInteraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import models.Island;
import models.Player;

public class UserInput 
{
	public static void presetMenu(){
		
		String[] presets = {"Easy", "Medium", "Hard", "Lunatic"};
		int i = 0;
		System.out.println("Please pick a dificulty to begin play.");
		for(String preset : presets){
			
			i++;
			System.out.println(i +") " + preset);
		}
	}
	
	public static void combatMenu()
	{
		String[] choices ={
				"Attack",
				"Defend",
				"Run"
		};
		
		for(int i = 0; i < choices.length; i++)
		{
			System.out.println((i+1) + ") " + choices[i]);
		}
	}
	
	public static int userResponseToMenu(int numOfItems) {

		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		boolean isGoodResponse = false;
		int choiceI = 0;
		String choiceS;
		do {
			
			try {

				choiceS = readRacer.readLine();
				choiceI = Integer.parseInt(choiceS);

				if (choiceI <= numOfItems && choiceI > 0) {
					isGoodResponse = true;
				} else {
					isGoodResponse = false;
					System.out.println("Enter a valid option.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Enter a valid option.");
				isGoodResponse = false;
			} catch (IOException e) {

			}
		} while (!isGoodResponse);

		return choiceI;
	}

	public static String promptForInput(String prompt) {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(prompt);
		boolean validInput = false;
		String input = null;
		do {

			try {
				input = readRacer.readLine();
			} catch (IOException e) {

			}
			
			if (input == null || input.equals("")) {
				validInput = false;
				System.out.println("You must enter a name.");
			}
			else
			{
				validInput = true;
			}
		} while (!validInput);
		return input;
	}
	
	public static void displayMainScreen()
	{
		String[] choices ={
			"Pick a fight",
			"Travel to an Island",
			"Check Inventory",
			"Check Character Sheet",
			"Retire"
		};
		
		System.out.println("\n\n\n\n");
		System.out.println("What would you like to do?");
		for(int i = 0; i < choices.length; i++)
		{
			System.out.println((i+1) + ") " + choices[i]);
		}
	}

	public static String[] displayIslands(HashMap<String, Island> islands)
	{
		String[] islandChoices = new String[islands.size()];
		islands.keySet().toArray(islandChoices);
		
		System.out.println("Which island do you wish to travel to?");
		for(int i = 0; i < islandChoices.length; i++)
		{
			System.out.println((i+1) + ") " + islandChoices[i]);
		}
		
		String[] islandNames = new String[10];
		islands.keySet().toArray(islandNames);
		
		return islandNames;
	}
	
	public static void displayIsland(String islandName)
	{
		String[] menu = {
				"Attack",
				"Raid",
				"Buy Loot",
				"Sell Loot",
				"Leave"
		};
		
		System.out.println("What do you wish to do on " + islandName + "?");
		for(int i = 0; i < menu.length; i++)
		{
			System.out.println((i+1) + ") " + menu[i]);
		}
	}
	
	public static void displayOwnedIsland(String islandName)
	{
		String[] menu = {
				"Gather Supplies",
				"Buy Loot",
				"Sell Loot",
				"Recruit Crew",
				"Leave"
		};
		
		System.out.println("What do you wish to do on " + islandName + "?");
		for(int i = 0; i < menu.length; i++)
		{
			System.out.println((i+1) + ") " + menu[i]);
		}
	}
	
	public static void retirmentMenu()
	{
		String[] menu = {
				"Bury it",
				"Give it to charity",
				"Send it to ye mum",
				"Horde it in a secret cave",
				"Throw it overboard"
		};
		
		System.out.println("What will you like to do with your riches?");
		for(int i = 0; i < menu.length; i++)
		{
			System.out.println((i+1) + ") " + menu[i]);
		}
	}
	
	public static void storyTime(int choice, Player curPlayer)
	{
		if(curPlayer.getLoot().isEmpty())
		{
			System.out.println("You have no loot and you end up living a life of sadness and not doing what you wish with your riches.");
		}
		else
		{
			switch(choice)
			{
			case 1://bury it
				System.out.println("Captain " + curPlayer.getCaptainName() + " buried all of their riches on a little island off the coast of Port Royal.\nFirst thing that was buried was the " + curPlayer.getLoot().get(1).getName() + " worth " + curPlayer.getLoot().get(1).getValue() + " Gold.\nAll other loot was buried next including " + curPlayer.getGold() + " Gold.\nTwo years later some low life happend upon this weird pile of dirt and decided to dig it up.\nThis man was now rich as can be and created a fort for himself on this tiny island.");
				break;
			case 2://charity
				if(curPlayer.getLoot().size() == 1)
				{
					System.out.println("You dont have enough loot to give to charity. You feel sad.");
				}
				else
				{
					System.out.println("Captain " + curPlayer.getCaptainName() + " grew a soft spot in their older years. They gave all their riches to random charities across the seas.\nThey gave " + curPlayer.getLoot().get(1).getName() + " to kids, " + curPlayer.getLoot().get(2).getName() + " to the elderly, and gave " + curPlayer.getGold() + " Gold to everyone else.\nAfter the world saw this act of kindness they all grew greedy for the loot of pirates and ended up attacking inocent people for their stuff.\nSo in the end it turns out being nice as a pirate is a very bad thing.");
				}
				break;
			case 3://mum
				System.out.println("Captain " + curPlayer.getCaptainName() + " retired early and gave all of their riches to their dear ol mum.\nHowever, when dear ol mum saw the " + curPlayer.getLoot().get(1).getName() + " and the " + curPlayer.getGold() + " Gold. She slowly became a pirate herself and started sailing the open seas for more loot.");
				break;
			case 4://horde
				if(curPlayer.getLoot().size() == 1)
				{
					System.out.println("You don't have enough loot to horde. Your mum would be disapointed.");
				}
				else
				{
					System.out.println("Captain " + curPlayer.getCaptainName() + " decided to hunker down and build an fortess to hold all of their " + curPlayer.getLoot().get(1).getName() + " and " + curPlayer.getLoot().get(2).getName() + ".\nThey built a giant vault to hold their mass of " + curPlayer.getGold() + " Gold.\nAfter the fortress was built nothing heppend no one tried to steal the loot and Captain " + curPlayer.getCaptainName() + " died a sad and lonely life.");
				}
				break;
			case 5://throw it away
				System.out.println("Captain " + curPlayer.getCaptainName() + " decided that pirating was not the life for them and they dumped all of their loot and gold overboard.\nhalf of the " + curPlayer.getCrewCount() + " crew members jump in after it.\nCaptain " + curPlayer.getCaptainName() + " sailed home to enjoy some nice tea and crumpets.");
				break;
			}
		}
	}
}