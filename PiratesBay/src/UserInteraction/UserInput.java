package UserInteraction;

import java.io.*;

public class UserInput {

	public static void presetMenu(){
		
		String[] presets = {"Easy - Crew Size (200 - 250), Gold (50 - 100)", "Medium - Crew Size (100 - 150), Gold (50 - 100)", "Hard - Crew Size (50 - 100), Gold (50 - 100)", "Lunatic - Crew Size (10 - 50), Gold (50 - 100)"};
		int i = 0;
		for(String preset : presets){
			
			i++;
			System.out.println(i +") "+preset);
		}
	}
	
	public static int userResponseToMenu() {

		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		boolean isGoodResponse = false;
		int choiceI = 0;
		String choiceS;
		do {
			
			try {

				choiceS = readRacer.readLine();
				choiceI = Integer.parseInt(choiceS);

				if (choiceI <= 4 && choiceI > 0) {
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
}
