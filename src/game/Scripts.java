package game;

import java.util.Scanner;

public class Scripts {

	/**
	 * Description: This will display the opening text block for the game.
	 * 
	 * @param input is the Scanner used to move to the next block of text
	 */
	public static void opening(Scanner input) {
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println(" After humanity left earth, we needed\n\n"
				+ " a new world to call home. We started\n\n"
				+ " to terraform planets so that they would\n\n"
				+ " suitable for human life.\n\n\n\n"
				+ "Press the enter key to continue ...");
		Utility.scriptContinue(input);
		System.out.println(" This was many millions of years ago.\n\n"
				+ " Since leaving our home world, we have found and\n\n"
				+ " created some amazing technologies. The most\n\n"
				+ " relevant are as follows; Cryo-Technology\n\n"
				+ " on a level that allows us to freeze and unfreeze\n\n"
				+ " people an infinite number of times with no\n\n"
				+ " negative repercussions, and FTL travel.\n\n\n\n"
				+ "Press the enter key to continue ...");
		Utility.scriptContinue(input);
		System.out.println(" Without getting into it, we now have\n\n"
				+ " the ability to reach every corner of our \n\n"
				+ " universe in a relatively short time period. \n\n"
				+ " Those trips that might last considerably longer\n\n"
				+ " are shortened immensely by the use of the\n\n"
				+ " aforementioned cryo-tubes.\n\n\n\n"
				+ "Press the enter key to continue ...");
		Utility.scriptContinue(input);
		System.out.println(
				" Welcome to the year 2020.0117.0190. \n\n\n\n"
				+ " This is the story of the two scientists in \n\n"
				+ " charge of planet #30ffe456 aka Terra Junior.\n\n\n\n"
				+ "Press the enter key to continue ...");
		Utility.scriptContinue(input);
		
	}
	
	/**
	 * Description: This will display the menu items for the game
	 * 
	 * @param game is the current instance being played. If this is null,
	 * 				there is no existing game being played, do not allow
	 * 				the user to attempt the continue option.
	 */
	public static void menu(Planet game){
		System.out.println(" Welcome to Extalia OS.\n\n"
				+ " Please select one of the following options:\n\n\n\n"
				+ " 1: Start a (New) Game\n\n"
				+ " 2: (Load) a Saved Game\n\n"
				+ " 3: (Save) your Current Game\n\n"
				+ " 4: Change your Game (Options)\n\n"
				+ " 5: (Quit) the game\n\n");
		/* This allows the user to continue their game if they choose to go to the
		 * menu from within a game. 
		 */
//		System.out.println(game);
		
		if(game != null) {
			System.out.println(" 6: (Continue) your game\n\n");
		}
		
	}

	/**
	 * Description: This will print the closing message upon exiting the game.
	 */
	public static void exit() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println(" Thank you for using Extalia OS.\n\n"
						+ " Shutting down ...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
						+ " .");
		
	}
	
	/**
	 * Description: This is where all of the game data will be displayed. 
	 * 				It will output all information that is needed on screen.
	 * <br /><br />
	 * Sidenote: This was originally going to the use booleans that are commented
	 * 			out elsewhere to display the relevant fields. This would remove the 
	 * 			three if statements and hard coded tier information with changeable
	 * 			tier information. However, it would also include many more if statements.
	 * 			Opted to not use this for now. May implement in a re-write.
	 * 
	 * @param game is the current instance of the game
	 */
	public static void gameDisplay(Planet game){

		// clears the screen of the user's input
		Utility.clear();
		
		/* This will display the values the user is currently working with
		 * in the game
		 */
		

		if(game.getTier() == 1){
			System.out.println(" You are currently monitoring " + Utility.displayNames[0]
							+ ", " + Utility.displayNames[5] + ", " + Utility.displayNames[7]
							+ ".\n\n Type in the property you want to work with this year and the value will increase.\n\n"
							+ " Keep in mind that these values will increase and decrease over time based on the values\n\n"
							+ " of the other properties. If you can keep these properties above a certain threshhold for\n\n"
							+ " a period of time, Terra Junior will move to the next phase of it's terraforming process.\n\n");
			System.out.println("  _________________________________________________________________");
			
			// First property
			System.out.println(" |\t\t\t|");
			System.out.print(" | " + Utility.displayNames[0] + "\t\t" + game.getAir() + "\t| ");
			Utility.displayPropertyValues(game.getAir());
			System.out.println(" |______________________|");
			
			// Second property
			System.out.println(" |\t\t\t|");
			System.out.print(" | " + Utility.displayNames[5] + "\t\t" + game.getLand() + "\t| ");
			Utility.displayPropertyValues(game.getLand());
			System.out.println(" |______________________|");
			
			// Third property
			System.out.println(" |\t\t\t|");
			System.out.print(" | " + Utility.displayNames[7] + "\t" + game.getWater() + "\t| ");
			Utility.displayPropertyValues(game.getWater());
			
			System.out.println(" |______________________|");
		} else if(game.getTier() == 2){
			System.out.println(" You are currently monitoring " + Utility.displayNames[2]
					+ ", " + Utility.displayNames[3] + ", " + Utility.displayNames[6] + ", " + Utility.displayNames[7]
					+ ".\n\n Type in the property you want to work with this year and the value will increase.\n\n"
					+ " Keep in mind that these values will increase and decrease over time based on the values\n\n"
					+ " of the other properties. If you can keep these properties above a certain threshhold for\n\n"
					+ " a period of time, Terra Junior will move to the next phase of it's terraforming process.\n\n");
	System.out.println("  _________________________________________________________________");
			
			// First property
			System.out.println("|\t\t\t|");
			System.out.print("| " + Utility.displayNames[2] + "\t" + game.getCarnivores() + "\t| ");
			Utility.displayPropertyValues(game.getCarnivores());
			System.out.println("|_______________________|");
			
			// Second property
			System.out.println("|\t\t\t|");
			System.out.print("| " + Utility.displayNames[3] + "\t" + game.getHerbivores() + "\t| ");
			Utility.displayPropertyValues(game.getHerbivores());
			System.out.println("|_______________________|");
			
			// Third property
			System.out.println("|\t\t\t|");
			System.out.print("| " + Utility.displayNames[6] + "\t" + game.getPlants() + "\t| ");
			Utility.displayPropertyValues(game.getPlants());
			System.out.println("|_______________________|");
			
			// Fourth property
			System.out.println("|\t\t\t|");
			System.out.print("| " + Utility.displayNames[7] + "\t\t" + game.getWater() + "\t| ");
			Utility.displayPropertyValues(game.getWater());
			
			System.out.println("|_______________________|");
		} else if(game.getTier() == 3){
			System.out.println(" You are currently monitoring " + Utility.displayNames[1]
					+ ", " + Utility.displayNames[4] + ", " + Utility.displayNames[6] + ", " + Utility.displayNames[7]
					+ ".\n\n Type in the property you want to work with this year and the value will increase.\n\n"
					+ " Keep in mind that these values will increase and decrease over time based on the values\n\n"
					+ " of the other properties. If you can keep these properties above a certain threshhold for\n\n"
					+ " a period of time, Terra Junior will move to the next phase of it's terraforming process.\n\n");
	System.out.println("  _________________________________________________________________");
			
			// First property
			System.out.println("|\t\t\t|");
			System.out.print("| " + Utility.displayNames[0] + "\t\t" + game.getAir() + "\t| ");
			Utility.displayPropertyValues(game.getAir());
			System.out.println("|_______________________|");
	
			// Second property
			System.out.println("|\t\t\t|");
			System.out.print("| " + Utility.displayNames[1] + "\t" + game.getAnimals() + "\t| ");
			Utility.displayPropertyValues(game.getAnimals());
			System.out.println("|_______________________|");
			
			// Third property
			System.out.println("|\t\t\t|");
			System.out.print("| " + Utility.displayNames[4] + "\t" + game.getHumans() + "\t| ");
			Utility.displayPropertyValues(game.getHumans());
			System.out.println("|_______________________|");
			
			// Fourth property
			System.out.println("|\t\t\t|");
			System.out.print("| " + Utility.displayNames[6] + "\t" + game.getPlants() + "\t| ");
			Utility.displayPropertyValues(game.getPlants());
			System.out.println("|_______________________|");
			
			// Fifth property
			System.out.println("|\t\t\t|");
			System.out.print("| " + Utility.displayNames[7] + "\t\t" + game.getWater() + "\t| ");
			Utility.displayPropertyValues(game.getWater());
			
			System.out.println("|_______________________|");
		}
		System.out.println("___________________________");
	}
	
	public static void gameOver() {
		Utility.clear();
		System.out.println(" You destroyed planet #30ffe456 aka Terra Junior, our last hope of survival.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" Just kidding. Time to find a new planet.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Utility.clear();
		Utility.clear();
		System.out.println(" GAME OVER\n\n"
						+ " Return to main menu(3)");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Utility.clear(); 
		Utility.clear();
		System.out.println(" GAME OVER\n\n"
						+ " Return to main menu(2)");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Utility.clear();
		Utility.clear();
		System.out.println(" GAME OVER\n\n"
						+ " Return to main menu(1)");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
