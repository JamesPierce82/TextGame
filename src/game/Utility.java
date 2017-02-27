package game;

import java.util.Scanner;

public class Utility {
	
	/* This is used in the gameDisplay method in Scripts. Why is it here?
	 * I have left this in Utility because it could technically be used elsewhere
	 * and is more of a useful piece of information than something that relates directly to
	 * outputting information
	 */
	public static String[] displayNames = {
			"Air",			// 0
			"Animals",		// 1
			"Carnivores",	// 2
			"Herbivores",	// 3
			"Humans",		// 4
			"Land",			// 5
			"Plants",		// 6
			"Water"			// 7
	};
	
	private static int BASE_INCREASE = 15;
	
	// This will be what is used to set difficulty using the options menu.
	public static int customDifficulty = 3;
	
	/**
	 * Description: This is used to check for user input, then clear the screen.
	 * 
	 * @param input allows this method to look for input from the user.
	 */
	public static void scriptContinue(Scanner input) {
		if(input.hasNextLine()){
			Utility.clear();
			input.nextLine();
		}
	}
	
	public static void clear(){
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

	/**
	 * Description: This is used to convert the input from the user into 
	 * 				a string that is usable for menu selection.
	 * 
	 * @param userInput is the input the user entered
	 * @return is the relevant menu item we will need to run the game
	 */
	public static String menuParser(String userInput) {
		// Lowercase the input so that the input is consistent with the menu choices
		userInput = userInput.toLowerCase();
		switch(userInput){
		case "1":
		case "new":
			// convert answers to 1
			userInput = "1";
			break;
		case "2":
		case "load":
			// convert answers to 2
			userInput = "2";
			break;
		case "3":
		case "save":
			// convert answers to 3
			userInput = "3";
			break;
		case "4":
		case "difficulty":
			// convert answers to 4
			userInput = "4";
			break;
		case "5":
		case "quit":
			// convert answers to 5
			userInput = "5";
			break;
		case "6":
		case "continue":
			// convert answers to 6
			userInput = "6";
			break;
		}
		return userInput;
	}

	/**
	 * Description: This will launch the different functions within the game.
	 * 				New game, Load game, Save game, Options.
	 * 
	 * @param userInput is the input the user entered
	 * @param game is the existing instance of the game. May or may not be null
	 */
	public static Planet menuSelect(String userInput, Planet game, Scanner input) {
		switch(userInput) {
		case "1":
			/* Creates a new game using empty constructor.
			 * This creates the default game, which uses easy difficulty.
			 * 
			 */   
			game = new Planet(1, customDifficulty);
			game = Game.run(game, input);
			break;
		case "2":
			// Load a game
			Utility.stub("Load a game");
			break;
		case "3":
			// Save a game
			Utility.stub("Save a game");
			break;
		case "4":
			// Open the Difficulty Menu
			Utility.difficultyMenu(input);
			break;
		case "5":
			break;
		case "6":
			game = Game.run(game, input);
			break;
		default:
			// Default
			Utility.stub("Default");
			break;
		}
		return game;
		
	}

	/**
	 * Description: This will allow the user to change the difficulty setting of the game.
	 */
	private static void difficultyMenu(Scanner input) {
		// Declare variables
		String userInput;
		
		Scripts.difficultyMenu();
		
		// Get menu input from user
		userInput = input.nextLine();
		customDifficulty = Utility.difficultyParser(userInput);
	}
	
	/**
	 * Description: This will take the users input for difficulty and return an integer value
	 * @param userInput the string the user entered
	 * @return is the new difficulty we want to set for the game
	 */
	private static int difficultyParser(String userInput) {
		int newDifficulty = 0;
		
		userInput = userInput.toLowerCase();
		
		switch(userInput){
		case "1":
		case "hard":
			// convert answers to 1
			newDifficulty = 1;
			break;
		case "2":
		case "medium":
			// convert answers to 2
			newDifficulty = 2;
			break;
		case "3":
		case "easy":
			// convert answers to 3
			newDifficulty = 3;
			break;
		default:
			newDifficulty = 3;
		}
		return newDifficulty;
	}

	/**
	 * Description: This will print a message stating you are attempting to access a stub
	 * 
	 * @param string is the name of the stub we are currently accessing
	 */
	private static void stub(String string) {
		Utility.clear();
		Utility.clear();
		Scripts.powerLoss(string);
		
	}
	
	/**
	 * Description: This will print a line that matches the length of the property's value.
	 * 
	 * @param propertyValue is the value of a property on the planet currently.
	 */
	public static void displayPropertyValues(int propertyValue){
		for(int i = 0; i < propertyValue; i++){
			System.out.print("-");
		}
		System.out.println();
	}
	
	/**
	 * Description: This will be used to adjust values of properties based on used input
	 * 
	 * @param userInput is the input from the user
	 * @param game is the current instance of the game
	 */
	public static void gameSelect(String userInput, Planet game){
		
		userInput = userInput.toLowerCase();
		if(game.getTier() == 1) {
			
			switch(userInput){
			case "air":
				game.setAir(game.getAir() + BASE_INCREASE);
				break;
			case "land":
				game.setLand(game.getLand() + BASE_INCREASE);
				break;
			case "water":
				game.setWater(game.getWater() + BASE_INCREASE);
				break;
			default:
				
				break;
			}
			
		} else if(game.getTier() == 2) {
			
			switch(userInput){
			case "carnivores":
				game.setCarnivores(game.getCarnivores() + BASE_INCREASE);
				break;
			case "herbivores":
				game.setHerbivores(game.getHerbivores() + BASE_INCREASE);
				break;
			case "plants":
				game.setPlants(game.getPlants() + BASE_INCREASE);
				break;
			case "water":
				game.setWater(game.getWater() + BASE_INCREASE);
				break;
			default:
				
				break;
			}
			
		} else if(game.getTier() == 3) {
			
			switch(userInput){
			case "air":
				game.setAir(game.getAir() + BASE_INCREASE);
				break;
			case "animals":
				game.setAnimals(game.getAnimals() + BASE_INCREASE);
				break;
			case "humans":
				game.setHumans(game.getHumans() + BASE_INCREASE);
				break;
			case "plants":
				game.setPlants(game.getPlants() + BASE_INCREASE);
				break;
			case "water":
				game.setWater(game.getWater() + BASE_INCREASE);
				break;
			default:
				
				break;
			}
			
		}
		
	}
	
	/**
	 * Description: This will be used to calculate all of the math in the game that will affect the different properties.
	 * 
	 * @param game is the current instance of the game
	 */
	public static void gameMath(Planet game) {
		
		int propertyChange = 0;
		
		/*
		 * propertyChange = (int) (Math.random() * 6 - game.getDifficulty()) + 1;
		 * This stores a random number based on difficulty. Because easy is 3,
		 * medium is 2, and hard is 1(which affects the starting stat values),
		 * 6 - game.getDifficulty will return a number 1-3 for easy, 1-4 for medium,
		 * and 1-5 for hard. This increases the amount things decrease by on hard.
		 * The game may be almost impossible on hard once the player reaches tier 3. 
		 */
		
		// This uses random numbers. The formulas used make it almost impossible to win
		// tier 3 on hard difficulty. GOOD LUCK
		if(game.getTier() == 1) {
			
			// Reduce air value
			propertyChange = (int) (Math.random() * (6 - game.getDifficulty())) + 1;
			game.setAir(game.getAir() - propertyChange);
			// Reduce land value
			propertyChange = (int) (Math.random() * (6 - game.getDifficulty())) + 1;		
			game.setLand(game.getLand() - propertyChange);
			// Reduce water value
			propertyChange = (int) (Math.random() * (6 - game.getDifficulty())) + 1;		
			game.setWater(game.getWater() - propertyChange);
			
		} else if(game.getTier() == 2) {
			
			// Reduce carnivores value
			propertyChange = (int) (Math.random() * (6 - game.getDifficulty())) + 1;
			game.setCarnivores(game.getCarnivores() - propertyChange);

			propertyChange = (int) (Math.random() * (6 - game.getDifficulty())) + 1;		
			game.setHerbivores(game.getHerbivores() - propertyChange);
			
			propertyChange = (int) (Math.random() * (6 - game.getDifficulty())) + 1;		
			game.setPlants(game.getPlants() - propertyChange);
			
			propertyChange = (int) (Math.random() * (6 - game.getDifficulty())) + 1;		
			game.setWater(game.getWater() - propertyChange);
			
		} else if(game.getTier() == 3) {
			propertyChange = (int) (Math.random() * (6 - game.getDifficulty())) + 1;
			game.setAir(game.getAir() - propertyChange);

			propertyChange = (int) (Math.random() * (6 - game.getDifficulty())) + 1;		
			game.setAnimals(game.getAnimals() - propertyChange);
			
			propertyChange = (int) (Math.random() * (6 - game.getDifficulty())) + 1;		
			game.setHumans(game.getHumans() - propertyChange);
			
			propertyChange = (int) (Math.random() * (6 - game.getDifficulty())) + 1;
			game.setPlants(game.getPlants() - propertyChange);

			propertyChange = (int) (Math.random() * (6 - game.getDifficulty())) + 1;		
			game.setWater(game.getWater() - propertyChange);
			
		}
		
		
		
	}
	
	/**
	 * Description: This will check to see if the user loses the game. Applies to all tiers.
	 * 
	 * @param game is the current instance of the game
	 * @return returns a true or false as to whether or not the game is over. False means the game was lost, True means it's still going.
	 */
	public static boolean gameLost(Planet game) {
		// End game if any of the values reaches <= 0
				if(game.getAir() <= 1 || game.getAnimals() <= 1 || game.getCarnivores() <= 1
				|| game.getHerbivores() <= 1 || game.getHumans() <= 1 || game.getLand() <= 1
				|| game.getPlants() <= 1 || game.getWater() <= 1){
					
					Utility.clear();
					Scripts.gameOver();
					return false;
					
				} else {
					return true;
				}
	}
	
	//TODO: If refatoring, this should probably be a method in planet and just upgrade the existing planet
	// As I'm Choosing to be lazy and focus on completion, this won't be a worry for now as it works as intended.
	
	/**
	 * Description: This will check to see if the planet meets the criteria to upgrade the planet.
	 * @param game is the current instance of the game
	 * @return will return the current instance of the game. This will have been modified based on the tier beaten.
	 */
	public static Planet planetUpgrade(Planet game, Scanner input) {
		
		// Tier 1 upgrade. If the user meets 50 in each property, upgrade from tier 1 to tier 2.
		if(game.getTier() == 1 && game.getAir() >= 50 && game.getLand() >= 50 && game.getWater() >= 50){
			game = new Planet(2, customDifficulty);
			Scripts.tierUpgrade(1, input);
		// Tier 2 upgrade. If the user meets 50 in each property, upgrade from tier 2 to tier 3.
		} else if(game.getTier() == 2 && game.getCarnivores() >= 50 && game.getHerbivores() >= 50 && game.getPlants() >= 50 && game.getWater() >= 50) {
			game = new Planet(3, customDifficulty);
			Scripts.tierUpgrade(2, input);
		// If the user reaches 50 in each property at tier 3, they win the game. Run the WinGame script.
		} else if(game.getTier() == 3 && game.getAir() >= 50 && game.getAnimals() >= 50 && game.getHumans() >= 50 && game.getPlants() >= 50 && game.getWater() >= 50) {
			game = null;
			// Run the win game script
			Scripts.tierUpgrade(3, input);
		}
		
		return game;
		
	}

}
