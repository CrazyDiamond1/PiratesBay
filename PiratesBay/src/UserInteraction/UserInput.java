package UserInteraction;

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
	
	public static void islandMenu(Island isle, Player p){
		
		String[] actions = {"Buy", "Sell", "Raid", "Attack"};
		
		int choice = -1;
		int counter = 0;
		
		if(isle.isOwned()){
			
		actions[5] = "Recruit Natives";
		
		for(String option : actions){
			
			counter++;
			System.out.println(counter + ")" + option + "\n");
		}
		choice = userResponseToMenu(5);
		} else{
			
			choice = userResponseToMenu(5);
		}
		
		switch(choice){
			
		case 1:
				isle.buyItem(p);
				break;
		case 2:
				isle.sellItem(p);
				break;
		case 3: 
				//isle.raid();
				break;
		case 4:
				//isle.attack();
				break;
		case 5:
				//isle.recruit();
				break;
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

	public static String promptForInput(String prompt, boolean allowEmpty) {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(prompt);
		boolean bool = false;
		String input = null;
		do {

			bool = false;

			try {
				input = readRacer.readLine();
			} catch (IOException e) {

			}
			if (allowEmpty == false) {

				if (input == "" || input == null) {
					bool = true;
					System.out.println("You must enter text.");
				}
			}
		} while (bool);
		return input;
	}
	
	public static void displayMainScreen()
	{
		String[] choices ={
			"Pick a fight",
			"Travel to an Island",
			"Check Inventory",
			"Retire"
		};
		
		System.out.println("\n\n\n\n\n\n\n\n\n");
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
	
	public static void displayIsland()
	{
		String[] menu = {
				"Attack",
				"Raid",
				"Buy Loot",
				"Sell Loot",
				"Leave"
		};
		
		System.out.println("What do you wish to do on this island?");
		for(int i = 0; i < menu.length; i++)
		{
			System.out.println((i+1) + ") " + menu[i]);
		}
	}
}