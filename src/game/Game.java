package game;

import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		
		// Declare all relevant variables and objects for later user
		Scanner input = new Scanner(System.in);
		String userInput;
		Planet game = null;
		
		
		// Opening script
		Scripts.opening(input);
		
		/* This will cause the menu to be the default behaviour of the game.
		 * This means that once the user is in a game, they can exit to this menu.
		 */
		
		do {
		// Display the game's menu
		Scripts.menu(game);
		
		// Get menu input from user
		userInput = input.nextLine();
		userInput = Utility.menuParser(userInput);
//		System.out.println(game);
		game = Utility.menuSelect(userInput, game);
		
		}while(!userInput.equals("5"));
		
		Scripts.exit();
		
	}
	
	/**
	 * Description: This is where the game itself runs, inside of the Extalia OS
	 * 				menu. It takes input from the user in regards to which property
	 * 				of the planet they want to increase, and will adjust the other
	 * 				values accordingly.
	 * 
	 * @param game is the current instance of the game
	 */
	public static Planet run(Planet game) {
		String input = "";
		boolean isRunning = true;
		Scanner keyboard = new Scanner(System.in);
		do{

			// This will output the game content to the screen
			Scripts.gameDisplay(game);
			// This will do all the math required each turn
			Utility.gameMath(game);
			
			// This will check to see if the game has been lost
			isRunning = Utility.gameLost(game);
			// This will get the user's input and run appropriate calculations based on that input
			input = keyboard.nextLine();
			Utility.gameSelect(input, game);
			
			/* This code will check to see if the user has "won" the tier. If so, upgrade the planet.
			 * If they are on tier 3, produce win message.
			 */
			game = Utility.planetUpgrade(game);
			
		}while(isRunning && !input.equals("exit") && (game != null));
		Utility.clear();
		// If the player lost, delete the current instance of the game.
		if(isRunning == false){
			game = null;
		}
		return game;
	}
	
	

}
