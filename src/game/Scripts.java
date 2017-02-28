package game;

import java.util.Scanner;

public class Scripts {

	/**
	 * Description: This will display the opening text block for the game.
	 * 
	 * @param input is the Scanner used to move to the next block of text
	 */
	public static void opening(Scanner input) {
		
		Utility.clear();
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
		Utility.clear();
		System.out.println(" Welcome to Extalia OS.\n\n"
				+ " Please select one of the following options:\n\n\n\n"
				+ " 1: Start a (New) Game\n\n"
				+ " 2: (Load) a Saved Game\n\n"
				+ " 3: (Save) your Current Game\n\n"
				+ " 4: Change your Game (Difficulty)\n\n"
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
			System.out.println(" Type in the property you want to work with and the value will increase.\n\n"
							+ " Keep in mind that these values will decrease over time. If you can get these properties \n\n"
							+ " above a value of 50, Terra Junior will move to the next phase of it's terraforming process.\n\n\n\n"
							+ "You are currently monitoring " + Utility.displayNames[0]
							+ ", " + Utility.displayNames[5] + ", " + Utility.displayNames[7] + ". Type in menu to return to the main menu");
			System.out.println("____________________________________________________________________________________________________________");
			System.out.println("  _______________________");
			
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
			System.out.println(" Type in the property you want to work with and the value will increase.\n\n"
					+ " Keep in mind that these values will decrease over time. If you can get these properties \n\n"
					+ " above a value of 50, Terra Junior will move to the next phase of it's terraforming process.\n\n\n\n"
					+ "You are currently monitoring " + Utility.displayNames[2]
					+ ", " + Utility.displayNames[3] + ", " + Utility.displayNames[6] + ", " + Utility.displayNames[7] + ". Type in menu to return to the main menu");
			System.out.println("____________________________________________________________________________________________________________");
			System.out.println("  _______________________");
			
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
			System.out.println(" Type in the property you want to work with and the value will increase.\n\n"
					+ " Keep in mind that these values will decrease over time. If you can get these properties \n\n"
					+ " above a value of 50, Terra Junior will move to the next phase of it's terraforming process.\n\n\n\n"
					+ "You are currently monitoring " + Utility.displayNames[1]
					+ ", " + Utility.displayNames[4] + ", " + Utility.displayNames[6] + ", " + Utility.displayNames[7] + ". Type in menu to return to the main menu");
			System.out.println("____________________________________________________________________________________________________________");
			System.out.println("  _______________________");
			
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
		System.out.println("____________________________________________________________________________________________________________");
	}
	
	/**
	 * Description: This is the game over message.
	 */
	public static void gameOver() {
		Utility.clear();
		System.out.println(" You destroyed planet #30ffe456 aka Terra Junior, our last hope of survival.\n\n");
		Utility.sleep(3000);
		System.out.println(" Just kidding. Time to find a new planet.");
		Utility.sleep(1000);
		Utility.clear();
		System.out.println(" GAME OVER\n\n"
						+ " Return to main menu(3)");
		Utility.sleep(1000);
		Utility.clear();
		System.out.println(" GAME OVER\n\n"
						+ " Return to main menu(2)");
		Utility.sleep(1000);
		Utility.clear();
		System.out.println(" GAME OVER\n\n"
						+ " Return to main menu(1)");
		Utility.sleep(1000);
		Utility.clear();
		System.out.println(" Press enter to continue ...");
	}

	/**
	 * Description: This will be used to output messages between tiers.
	 * 
	 * @param starterTier is the tier you just beat.
	 */
	public static void tierUpgrade(int starterTier, Scanner input) {

		switch(starterTier){
		case 1:
			Utility.clear();
			System.out.println(" You upgraded Terra junior from Tier 1 to Tier 2. Congratulations!(3)");
			Utility.sleep(1000);
			Utility.clear();
			System.out.println(" You upgraded Terra junior from Tier 1 to Tier 2. Congratulations!(2)");
			Utility.sleep(1000);
			Utility.clear();
			System.out.println(" You upgraded Terra junior from Tier 1 to Tier 2. Congratulations!(1)");
			Utility.sleep(1000);
			Scripts.tierOneUpgrade(input);
			break;
		case 2:
			Utility.clear();
			System.out.println(" You upgraded Terra junior from Tier 2 to Tier 3. Congratulations!(3)");
			Utility.sleep(1000);
			Utility.clear();
			System.out.println(" You upgraded Terra junior from Tier 2 to Tier 3. Congratulations!(2)");
			Utility.sleep(1000);
			Utility.clear();
			System.out.println(" You upgraded Terra junior from Tier 2 to Tier 3. Congratulations!(1)");
			Utility.sleep(1000);
			Scripts.tierTwoUpgrade(input);
			break;
		case 3:
			Utility.clear();
			System.out.println(" You reached the end of the game.\n\n");
			Utility.sleep(3000);
			Scripts.tierThreeUpgrade(input);
			break;
		}
		

		
		
		
	}

	/**
	 * Description: This will output the difficulty selection menu
	 */
	public static void difficultyMenu() {
		
		Utility.clear();
		System.out.println(" THIS WILL ONLY TAKE EFFECT IF YOU RESTART THE GAME OR UPON REACHING THE NEXT TIER.\n\n"
				+ " Please select one of the following options:\n\n\n\n"
				+ " 1: (Hard)\n\n"
				+ " 2: (Medium)\n\n"
				+ " 3: (Easy)\n\n");
	}

	/**
	 * Description: This is the power loss message
	 */
	public static void powerLoss(String string) {
		System.out.println(" This is the " + string + " stub.\n\n");
		Utility.sleep(2000);
		System.out.println(" We are currently rebuilding this portion of the OS after a\n\n");
		
		System.out.println(" particularily bad power loss.\n\n\n\n");
		Utility.sleep(2000);
		System.out.println(" Sorry for the inconvenience.");
		Utility.sleep(3000);
		Utility.clear();
		System.out.println(" Press enter to continue ...");
		
		
		
	}

	/**
	 * Description: This is the opening scene of the game, prior to starting to play.
	 * @param input is the keyboard input
	 */
	public static void newGame(Scanner input) {
		Utility.clear();
		System.out.println(" (Jardon)\t So. This is Terra Junior.\n\n");
		Utility.sleep(2000);
		System.out.println(" (Teiran)\t You know they want us to call it planet #30ffe456 right?\n\n");
		Utility.sleep(4000);
		System.out.println(" (Jardon)\t Teiran, the only thing we're going to do by calling it that\n\n"
						+ "\t\t is passing the time faster. Which we can do in the cryo-tubes anyways.\n\n");
		Utility.sleep(6000);
		System.out.println(" (Teiran)\t Yeah, well... What did you call it again?\n\n");
		Utility.sleep(3000);
		System.out.println(" (Jardon)\t Terra Junior.\n\n\n\n");
		System.out.println("Press the enter key to continue ...");
		Utility.scriptContinue(input);
		
		Utility.clear();
		System.out.println(" (Teiran)\t Alright, Terra Junior it is. Did mission control send us\n\n"
						+ "\t\t our briefing yet?\n\n");
		Utility.sleep(5000);
		System.out.println(" (Jardon)\t Yeah, it's up on the console behind you. Looks like we're to start\n\n"
						+ "\t\t with a blank slate, and work our way up from there.\n\n");
		Utility.sleep(6000);
		System.out.println(" (Teiran)\t Ah, great. My favourite part of this job is working with rocks.\n\n"
						+ "\t\t I hate when things start to get complicated.\n\n");
		Utility.sleep(6000);
		System.out.println(" (Jardon)\t I think you got into the wrong profession Teiran. Everything we do\n\n"
						+ "\t\t is complicated.\n\n");
		Utility.sleep(4500);
		System.out.println(" (Teiran)\t Yeah, but I didn't exactly pick this gig. I signed up because I\n\n"
						+ "\t\t wanted to help create new planets, not terraform old ones!\n\n\n\n");
		System.out.println("Press the enter key to continue ...");
		Utility.scriptContinue(input);
		
		Utility.clear();
		System.out.println(" (Jardon)\t Unforunately you didn't get that job. And, even more unfortunately\n\n"
						+ "\t\t for me, I'm now stuck with you. It's time to get to work.\n\n");
		Utility.sleep(6000);
		System.out.println(" (Teiran)\t Alright, alright, fine. Where do you want me to start?\n\n");
		Utility.sleep(4000);
		System.out.println(" (Jardon)\t Start where the briefing said. Air, Land, and Water. Without all\n\n"
						+ "\t\t three, we might as well not even bother with the rest.\n\n\n\n");
		System.out.println("Press the enter key to continue ...");
		Utility.scriptContinue(input);
		
	}
	
	/**
	 * Description: This is the exchange between scientists after beating tier 1.
	 * 
	 * @param input is the keyboard input
	 */
	public static void tierOneUpgrade(Scanner input){
		Utility.clear();
		System.out.println(" (Jardon)\t How is Terra Junior looking?\n\n");
		Utility.sleep(3000);
		System.out.println(" (Teiran)\t Beautiful. Or at least, as beautiful as a ball of rock, water and\n\n"
						+ "\t\t atmosphere can.\n\n");
		Utility.sleep(5000);
		System.out.println(" (Jardon)\t Good. Mission Control sent us a data packet with information about\n\n"
						+ "\t\t what to do next. Hope you're ready for some 'complicated' work.\n\n");
		Utility.sleep(6500);
		System.out.println(" (Teiran)\t Ha. Ha. Ha. I may not enjoy this part of the work, but that doesn't\n\n"
						+ "\t\t mean I'm incapable of doing a good job. I'll show you what I'm capable of!\n\n\n\n");
		System.out.println("Press the enter key to continue ...");
		Utility.scriptContinue(input);
		
	}
	
	/**
	 * Description: This is the exchange between scientists after beating tier 2.
	 * 
	 * @param input is the keyboard input
	 */
	public static void tierTwoUpgrade(Scanner input){
		Utility.clear();
		System.out.println(" (Teiran)\t See? I told you I'm good at what I do!\n\n");
		Utility.sleep(3000);
		System.out.println(" (Jardon)\t No one said you weren't. Keep this up and I'll put in a good word for you;\n\n"
						+ "\t\t Get you a transfer out of my hair and into that New Planet department you want\n\n"
						+ "\t\t to be in so badly.\n\n");
		Utility.sleep(9000);
		System.out.println(" (Teiran)\t Are you sure? I thought nobody changes departments...\n\n");
		Utility.sleep(3000);
		System.out.println(" (Jardon)\t Did nobody tell you who I am? I'm the head of Terraforming.\n\n"
						+ "\t\t I can get anyone moved anywhere around here. Well, relatively speaking of course.\n\n"
						+ "\t\t It's not like they're making new planets near here...\n\n");
		Utility.sleep(9000);
		System.out.println(" (Teiran)\t Seriously?!? Alright, I'm up for the challenge. What happens if I fail?\n\n");
		Utility.sleep(3000);
		System.out.println(" (Jardon)\t Nothing. I fire you. Then I shoot your escape pod into the sun.\n\n");
		Utility.sleep(3000);
		System.out.println(" (Teiran)\t . . .\n\n\n\n");
		System.out.println("Press the enter key to continue ...");
		Utility.scriptContinue(input);
		
		System.out.println(" (Jardon)\t That was a joke.\n\n");
		Utility.sleep(1500);
		System.out.println(" (Teiran)\t Haha. Okay. Well, I should probably get back to work.\n\n"
						+ "\t\t Sounds like I have a transfer to earn.\n\n\n\n");
		System.out.println("Press the enter key to continue ...");
		Utility.scriptContinue(input);
	}
	
	public static void tierThreeUpgrade(Scanner input){
		Utility.clear();
		System.out.println(" (Teiran)\t Wait, so. . . did I do it?\n\n");
		Utility.sleep(3000);
		System.out.println(" (Jardon)\t It looks like you did. Congratulations. You can shut down the console\n\n"
						+ "\t\t and I will head back to my office to write up the transfer papers for you.\n\n");
		Utility.sleep(6000);
		System.out.println(" (Teiran)\t So you weren't joking before? I didn't think you actually meant that.\n\n");
		Utility.sleep(3000);
		System.out.println(" (Jardon)\t You did good work. And I don't want you around to bug me anymore, so\n\n"
						+ "\t\t it's a win-win for both of us.\n\n");
		Utility.sleep(6000);
		System.out.println(" (Teiran)\t I'M GOING TO MAKE NEW PLANETS!!!! WHOOOOOO!!\n\n");
		Utility.sleep(3000);
		System.out.println(" (Jardon)\t It's not too late to put you in the escape pod.\n\n");
		Utility.sleep(3000);
		System.out.println(" (Teiran)\t Sorry.\n\n\n\n");
		System.out.println("Press the enter key to continue ...");
		Utility.scriptContinue(input);
	}

}
