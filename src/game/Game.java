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
	public static void run(Planet game) {
		String input = "";
		boolean isRunning = true;
		Scanner keyboard = new Scanner(System.in);
		do{

			Scripts.gameDisplay(game);
			isRunning = Utility.gameMath(game);
			input = keyboard.nextLine();
			Utility.gameSelect(input, game);
			
		}while(isRunning && !input.equals("exit"));
		Utility.clear();
		// If the player lost, delete the current instance of the game.
		if(isRunning == false){
			game = null;
		}
	}
	
	

}
