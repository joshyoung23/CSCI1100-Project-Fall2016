import java.util.Scanner;
import java.io.*;

public class CSCI1100_PROJECT {
   
	public static void main (String [] args) throws IOException {
		System.out.print("Jurmathic Park successfully booted... Welcome to the jungle. ");
		int score = runMainMenu();

	}
	
	public static int runMainMenu () throws IOException {
      int score = 0;
		
		String [] menu_options = new String[8]; 
		String user_input;
		
		//Program option 1
		menu_options[0] = "training";
		menu_options[1] = "1";
		
		//Program option 2
		menu_options[2] = "survival";
    	menu_options[3] = "2";
		
		//Program option 3
		menu_options[4] = "leaderboard";
		menu_options[5] = "3";
		
		//Program option 4
		menu_options[6] = "quit";
		menu_options[7] = "4";

		System.out.println("\n\nHow would you like to proceed?"
				+ "\n1 - Training"
				+ "\n2 - Survival"
				+ "\n3 - Leaderboard"
				+ "\n4 - Quit");
		user_input = runInputLoop(menu_options);
		
		switch(user_input) {
		
			case "training" : 
				runTrainingMenu();
				break;
			case "1" :
				runTrainingMenu();
				break;
				
			case "survival" :
				score = runSurvival();
            return score;
            
			case "2" : 
				score = runSurvival();
				return score;
            
			case "leaderboard" :
				runLeaderboard();
				break;
			case "3" :
				runLeaderboard();
				break;
				
			case "quit" :
				runQuit();
				break;
			case "4" :
				runQuit();
				break;
		
		}
      return score;
	}
	
	
	public static void runTrainingMenu() throws IOException {
		
		String [] menu_options = new String[10]; 
		String user_input;
		
		//Program option 1 - addition
		menu_options[0] = "addition";
		menu_options[1] = "1";
				
		//Program option 2 - subtraction
		menu_options[2] = "subtraction";
		menu_options[3] = "2";
				
		//Program option 3 - multiplication
		menu_options[4] = "multiplication";
		menu_options[5] = "3";
				
		//Program option 4 - division
		menu_options[6] = "division";
		menu_options[7] = "4";
		
		//Program option 5 - main menu
		menu_options[8] = "main menu";
		menu_options[9] = "5";
		
		System.out.println("\nTraining successfully opened. Which level would you like to play?"
				+ "\n1 - Addition"
				+ "\n2 - Subtraction"
				+ "\n3 - Multiplication"
				+ "\n4 - Division"
				+ "\n5 - Main Menu");
		user_input = runInputLoop(menu_options);
		
		switch (user_input){
		
			case "addition" :
				runAdditionMenu();
				break;
			case "1" :
				runAdditionMenu();
				break;
				
			case "subtraction" :
				runSubtractionMenu();
				break;
			case "2" :
				runSubtractionMenu();
				break;

			case "multiplication" :
				runMultiplicationMenu();
				break;
			case "3" :
				runMultiplicationMenu();
				break;

			case "division" :
				runDivisionMenu();
				break;

			case "4" :
				runDivisionMenu();
				break;

			case "main menu" :
				System.out.println("Returning to main menu...");
				runMainMenu();
				break;
			case "5" :
				System.out.println("Returning to main menu...");
				runMainMenu();
				break;
		}
	}
	
	public static void runAdditionMenu() throws IOException {
		
		String [] menu_options = new String[8];
		String user_input = "";
		
		//Program option 1 - stage one
		menu_options[0] = "stage one";
		menu_options[1] = "1";
						
		//Program option 2 - stage two
		menu_options[2] = "stage two";
		menu_options[3] = "2";
						
		//Program option 3 - stage three
		menu_options[4] = "stage three";
		menu_options[5] = "3";
				
		//Program option 4 - main menu
		menu_options[6] = "main menu";
		menu_options[7] = "4";

		
		System.out.println("\nWelcome to the addition training menu. How would you like to proceed?"
				           + "\n1 - Stage one"
			               + "\n2 - Stage two"
				           + "\n3 - Stage three"
			               + "\n4 - Main menu");
		user_input = runInputLoop(menu_options);
		
		switch (user_input) {
		
			case "stage one" :
				Addition.stageOneAdd();
				break;
			case "1" :
				Addition.stageOneAdd();
				break;
				
			case "stage two" :
				Addition.stageTwoAdd("");
				break;
			case "2" :
				Addition.stageTwoAdd("");
				break;
				
			case "stage three" :
				Addition.stageThreeAdd("");
				break;
			case "3" :
				Addition.stageThreeAdd("");
				break;
				
			case "main menu" :
				System.out.println("Returning to main menu...");
				runMainMenu();
				break;
    
			case "4" :
				System.out.println("Returning to main menu...");
				runMainMenu();
				break;
		
		}
	}
	
	public static void runSubtractionMenu() throws IOException {
		
		String [] menu_options = new String[8];
		String user_input = "";
		
		//Program option 1 - stage one
		menu_options[0] = "stage one";
		menu_options[1] = "1";
								
		//Program option 2 - stage two
		menu_options[2] = "stage two";
		menu_options[3] = "2";
								
		//Program option 3 - stage three
		menu_options[4] = "stage three";
		menu_options[5] = "3";
						
		//Program option 4 - main menu
		menu_options[6] = "main menu";
		menu_options[7] = "4";
		
		System.out.println("\nWelcome to the subtraction training menu. How would you like to proceed?"
				+ "\n1 - Stage one"
				+ "\n2 - Stage two"
				+ "\n3 - Stage three"
				+ "\n4 - Main menu");
		user_input = runInputLoop(menu_options);
		
		switch (user_input) {
		
			case "stage one" :
				Subtraction.stageOneSub();
			
			case "1" :
				Subtraction.stageOneSub();
            
			case "stage two" :
            Subtraction.stageTwoSub("");
            
			case "2" :
				Subtraction.stageTwoSub("");
				
			case "stage three" :
				Subtraction.stageThreeSub("");
            
			case "3" :
				Subtraction.stageThreeSub("");
				
			case "main menu" :
				System.out.println("Returning to main menu...");
				runMainMenu();
				break;
			case "4" :
				System.out.println("Returning to main menu...");
				runMainMenu();
				break;
		}
		
	}
	
	public static void runMultiplicationMenu() throws IOException{
		
		String [] menu_options = new String[8];
		String user_input = "";
		
		//Program option 1 - stage one
		menu_options[0] = "stage one";
		menu_options[1] = "1";
								
		//Program option 2 - stage two
		menu_options[2] = "stage two";
		menu_options[3] = "2";
								
		//Program option 3 - stage three
		menu_options[4] = "stage three";
		menu_options[5] = "3";
						
		//Program option 4 - main menu
		menu_options[6] = "main menu";
		menu_options[7] = "4";
		
		System.out.println("\nWelcome to the multiplication training menu. How would you like to proceed?"
				+ "\n1 - Stage one"
				+ "\n2 - Stage two"
				+ "\n3 - Stage three"
				+ "\n4 - Main menu");
		user_input = runInputLoop(menu_options);
		
		switch (user_input) {
		
			case "stage one" :
				Multiplication.stageOneMulti();
            
			case "1" :
				Multiplication.stageOneMulti();
            				
			case "stage two" :
				Multiplication.stageTwoMulti("");
            
         case "2" :
				Multiplication.stageTwoMulti("");
            				
			case "stage three" :
				Multiplication.stageThreeMulti("");
            
			case "3" :
				Multiplication.stageThreeMulti("");
            
			case "main menu" :
				System.out.println("Returning to main menu...");
				runMainMenu();
				break;
			case "4" :
				System.out.println("Returning to main menu...");
				runMainMenu();
				break;
		
		}
	}
	
	public static void runDivisionMenu() throws IOException {
		
		String [] menu_options = new String[8];
		String user_input = "";
		
		//Program option 1 - stage one
		menu_options[0] = "stage one";
		menu_options[1] = "1";
								
		//Program option 2 - stage two
		menu_options[2] = "stage two";
		menu_options[3] = "2";
								
		//Program option 3 - stage three
		menu_options[4] = "stage three";
		menu_options[5] = "3";
						
		//Program option 4 - main menu
		menu_options[6] = "main menu";
		menu_options[7] = "4";
		
		System.out.println("\nWelcome to the division training menu. How would you like to proceed?"
				+ "\n1 - Stage one"
				+ "\n2 - Stage two"
				+ "\n3 - Stage three"
				+ "\n4 - Main menu");
		user_input = runInputLoop(menu_options);
		
		switch (user_input) {
		
			case "stage one" :
				Division.stageOneDivi();
            
			case "1" :
				Division.stageOneDivi();
				
			case "stage two" :
				Division.stageTwoDivi("");
            
			case "2" :
				Division.stageTwoDivi("");
				
			case "stage three" :
				Division.stageThreeDivi("");
            
			case "3" :
				Division.stageThreeDivi("");
				
			case "main menu" :
				System.out.println("Returning to main menu...");
				runMainMenu();
				break;
			case "4" :
				System.out.println("Returning to main menu...");
				runMainMenu();
				break;
		
		}
	}

	
	public static int runSurvival() throws IOException {
		int score = 0;
      
		String [] menu_options = new String[4];
		String user_input;
		
		//Program option 1
		menu_options[0] = "yes";
		menu_options[1] = "1";
		
		//Program option 2
		menu_options[2] = "no";
		menu_options[3] = "2";
	
		
		System.out.print("\nSurvival successfully opened.");
		System.out.println("\nAre you sure you would like to continue?"
				+ "\n\n1 - Yes"
				+ "\n2 - No");
		user_input = runInputLoop(menu_options);
		
		
		if (user_input.equals("yes") || user_input.equals("1")){
			Survival.survival();
         runMainMenu();
      }

      else {
			System.out.println("You have declined to play survival.");
			System.out.println("Returning to main menu...");
			runMainMenu();
      }   
   return score;
	   
   }
	
	public static void runLeaderboard() throws IOException {
		Leaderboard.outputLeaderboard();     
		System.out.println("\n\nReturning to main menu...");
		runMainMenu();
	}
	
	public static void runQuit() {
		System.out.println("Exiting program...");
		System.exit(0);
	}

	//This method is to be used for every MENU input. It will check to ensure that user_input is a valid input. 
	public static String runInputLoop(String [] menu_options) {
		Scanner input = new Scanner(System.in);
		String user_input = "";
		boolean match_found = false;
		while (match_found != true){
			//Prompts the user to input a command, and converts it to lower case.
			user_input = input.nextLine();
			user_input = user_input.toLowerCase();
			//This for loop compares the user_input to every value in the menu_options array provided.
			//If a match is found, user_input is cleared to be returned to the menu method that called it. 
			for (int i = 0; i < menu_options.length; i++){
				if (user_input.equals(menu_options[i])){
					match_found = true;
				}
			}
			//Informs the user their choice was not in the menu, and prompts for another input. 
			if (match_found != true){
				System.out.print("Error, your choice is invalid. Please try again.\t");
			}
		}
		return user_input;
		
	}

}
