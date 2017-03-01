package UserInteraction;

import java.io.*;

import models.Island;
import models.Player;

public class UserInput {

	public static void presetMenu(){
		
		String[] presets = {"Easy - Crew Size (200 - 250), Gold (50 - 100)", "Medium - Crew Size (100 - 150), Gold (50 - 100)", "Hard - Crew Size (50 - 100), Gold (50 - 100)", "Lunatic - Crew Size (10 - 50), Gold (10 - 50)"};
		int i = 0;
		for(String preset : presets){
			
			i++;
			System.out.println(i +") "+preset);
		}
	}
	
	public static void islandMenu(Island isle, Player p){
		
		String[] actions = {"Buy", "Sell", "Raid", "Attack", ""};
		
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
	
	public void displayMap()
	{
		
	}

	public void displayCombat()
	{
		
	}
	
	public void displayIsland()
	{
		
	}	
}
