import java.util.Random;//import random class
import java.util.Scanner;//import scanner
import java.lang.NumberFormatException;
import java.io.*;

public class Addition{                 
   public static void stageOneAdd() throws IOException {
      Scanner kb = new Scanner(System.in);
      
      System.out.print("\nYou have entered Stage One of Addition."
                      +"\nYou must solve 3 equations correctly to complete this stage."
                      +"\nWould you like to begin Stage One?");
                      
      System.out.println("\n1 - Yes (continue)"
                        +"\n2 - No (main menu)");
                        
      String[] menu_options = {"yes","1","no","2"};
      
      String user_input = CSCI1100_PROJECT.runInputLoop(menu_options);
      
      int score = 0;
      
      boolean x = false;
      
      if(user_input.equals("yes")||user_input.equals("1")){
         while (x != true){
            for (int i = 0 ; i < 5 ; i++){
               score = q1A(score);
               if (score == -1){
                  System.out.print("\nYou have chosen to quit Training Mode."
                                  +"\nReturning to the main menu...");
                  CSCI1100_PROJECT.runMainMenu();               
               }
            }
            System.out.print("\nYour current score is: "+score);
            if (score >= 3){
               System.out.print("\nThe secret code to access Addition - Stage 2 from the main menu is : rex");
               
               user_input = continueCheck12("\nWhat would you like to do?");
               
               if (user_input.equals("0")||user_input.equals("replay"))
                  System.out.print("\nYou chose to keep playing stage 1, starting again..."); 
                   
               else if (user_input.equals("1")||user_input.equals("continue")){
                  System.out.print("\nYou chose to move on to stage 2, here we go...");
                  stageTwoAdd("rex");
               }   
               else {
                  System.out.print("\nReturning to main menu...");       
                  CSCI1100_PROJECT.runMainMenu();
               }                 
            }
            else{
               user_input = continueCheckFail();
               if (user_input.equals("0")||user_input.equals("retry"))
                  System.out.print("\nYou chose to retry this stage, starting again...");   
               else {
                  System.out.print("\nReturning to main menu...");       
                  CSCI1100_PROJECT.runMainMenu();
               }                 
            }                 
         }
      }   
                
      else
         CSCI1100_PROJECT.runMainMenu();
         
   }//END stageOneAdd();
            
   //QUESTION GENERATOR FOR STAGE ONE      
   public static int q1A(int score){
      //initialize the variables
      Scanner kb = new Scanner(System.in);
      int n1,n2, userAns = 0, ans;
      String selection = "", user_input = "";
      boolean x = false;
      //generate random values for the question (to a certain limit based on difficulty)
      Random r = new Random();
      n1 = r.nextInt(10)+1;
      n2 = r.nextInt(5)+1;
      //Ask the user to solve the equation of the randomly generated values
      System.out.print("\nSolve the equation: " + n1 + " + " + n2 + " = ");
      user_input = kb.nextLine();
      user_input = user_input.toLowerCase();
      //if the user inputs 'quit', return their score as -1
      if (user_input.equals("quit"))
         return -1;
      //Have a while loop (containing a try{}catch{} to catch invalid inputs so 
      //that it can be properly parsed into an int, if invalid ask for input again.   
      while(x != true){
         try {
            userAns = Integer.parseInt(user_input);
            x = true;
         } catch (NumberFormatException e) {
            System.out.print("\nThis input is invalid, please enter a whole number : ");
            user_input = kb.nextLine();
            x = false;
         }   
      }
      //determine the answer and compare the user input to it, if correct increase 
      //their score by 1, if incorrect return their current score back to them (no increase)         
      ans = n1 + n2;
      if(ans == userAns){
         System.out.println("\nThat was the correct answer!");
         correct.randomSayingCorrect()
         score++;
      }else{
         System.out.println("\nWhat you have entered is incorrect.");
         wrong.randomSayingWrong();
      }
      return score;
      
   }//END q1A    

//
//STAGE TWO
//   

   public static void stageTwoAdd(String user_input) throws IOException {
      Scanner kb = new Scanner(System.in);
      
      System.out.print("\nYou have entered Stage Two of Addition.");
      
      while (!user_input.equals("rex")){
         System.out.println("\nIn order to remain on this stage, please enter the correct password "
                         +"\nor type quit to return to the Main Menu.");
         user_input = kb.nextLine();
         user_input = user_input.toLowerCase();
         
         if (user_input.equals("rex"))
            System.out.print("\nThat password was correct!");
         else if (user_input.equals("quit")||user_input.equals("main menu"))
            CSCI1100_PROJECT.runMainMenu();
         else
            System.out.print("\nSorry, what you entered was not the password...");
      }                 
      System.out.println("\nYou must solve 5 equations correctly to complete this stage."
                        +"\nWould you like to begin Stage Two?"
                        +"\n1 - Yes (continue)"
                        +"\n2 - No (main menu)");
                        
      String[] menu_options = {"yes","1","no","2"};
      
      user_input = CSCI1100_PROJECT.runInputLoop(menu_options);
      
      int score = 0;
      
      boolean x = false;
      
      if(user_input.equals("yes")||user_input.equals("1")){
         while (x != true){
            for (int i = 0 ; i < 5 ; i++){
               score = q2A(score);
               if (score == -1){
                  System.out.print("\nYou have chosen to quit Training Mode."
                                  +"\nReturning to the main menu...");
                  CSCI1100_PROJECT.runMainMenu();               
               } 

            }
            System.out.print("\nYour current score is: "+score);
            if (score >= 3){
               System.out.print("\nThe secret code to access Addition - Stage 3 from the main menu is : fossil");
               
               user_input = continueCheck12("\nWhat would you like to do?");
               
               if (user_input.equals("0")||user_input.equals("replay"))
                  System.out.print("\nYou chose to keep playing stage 2, starting again..."); 
                   
               else if (user_input.equals("1")||user_input.equals("continue")){
                  System.out.print("\nYou chose to move on to stage 3, here we go...");
                  stageThreeAdd("fossil");
               }   
               else {
                  System.out.print("\nReturning to main menu...");       
                  CSCI1100_PROJECT.runMainMenu();
               }                                               
            } 
            else{
               user_input = continueCheckFail();
               if (user_input.equals("0")||user_input.equals("retry"))
                  System.out.print("\nYou chose to retry this stage, starting again...");   
               else {
                  System.out.print("\nReturning to main menu...");       
                  CSCI1100_PROJECT.runMainMenu();
               }                 
            }                  
         }
      }   
                
      else
         CSCI1100_PROJECT.runMainMenu();
   }//END stageTwoAdd()
        
   //QUESTION GENERATOR FOR STAGE TWO
   public static int q2A(int score){
      Scanner kb = new Scanner(System.in);
      int n1,n2, userAns = 0, ans;
      String selection = "", user_input = "";
      boolean x = false;
      Random r = new Random();
      n1 = r.nextInt(15)+3;
      n2 = r.nextInt(15)+5;
      System.out.print("\nSolve the equation: " + n1 + " + " + n2 + " = ");
      user_input = kb.nextLine();
      user_input = user_input.toLowerCase();
      if (user_input.equals("quit"))
         return -1;
         
      while(x != true){
         try {
            userAns = Integer.parseInt(user_input);
            x = true;
         } catch (NumberFormatException e) {
            System.out.print("\nThis input is invalid, please enter a whole number : ");
            user_input = kb.nextLine();
            x = false;
         }   
      }         
      ans = n1 + n2;
      
      if(ans == userAns){
         System.out.println("\nThat was the correct answer!");
         correct.randomSayingCorrect();
         score++;
      }
      else{
         System.out.println("\nWhat you have entered is incorrect.");
         wrong.randomSayingWrong();
      }
      return score;
   }//END q2A     

//
//STAGE 3
//
  
   public static void stageThreeAdd(String user_input) throws IOException {
      Scanner kb = new Scanner(System.in);
      
      System.out.print("\nYou have entered Stage Three of Addition.");
      
      while (!user_input.equals("fossil")){
         System.out.println("\nIn order to remain on this stage, please enter the correct password "
                         +"\nor type quit to return to the Main Menu");
         user_input = kb.nextLine();
         user_input = user_input.toLowerCase();
         
         if (user_input.equals("fossil"))
            System.out.print("\nThat password was correct!");   
         else if (user_input.equals("quit")||user_input.equals("main menu"))
            CSCI1100_PROJECT.runMainMenu(); 
         else
            System.out.print("\nSorry, what you entered was not the password...");
      }      
                 
      System.out.println("\nYou must solve 5 equations correctly to complete this stage."
                        +"\nWould you like to begin Stage Three?"
                        +"\n1 - Yes (continue)"
                        +"\n2 - No (main menu)");
                        
      String[] menu_options = {"yes","1","no","2"};
      
      user_input = CSCI1100_PROJECT.runInputLoop(menu_options);
      
      int score = 0;
      
      boolean x = false;
      
      if(user_input.equals("yes")||user_input.equals("1")){
         while (x != true){
            for (int i = 0 ; i < 5 ; i++){
               score = q3A(score);
               if (score == -1){
                  System.out.print("\nYou have chosen to quit Training Mode."
                                  +"\nReturning to the main menu...");
                  CSCI1100_PROJECT.runMainMenu();               
               } 

            }
            System.out.print("\nYour current score is: "+score);
            if (score >= 3){
               System.out.print("\nYou've finished Addition training, congratulations!");
               
               user_input = continueCheck3("\nWhat would you like to do?");
               
               if (user_input.equals("0")||user_input.equals("replay"))
                  System.out.print("\nYou chose to keep playing stage 3, starting again..."); 
                   
               else if (user_input.equals("1")||user_input.equals("continue")){
                  System.out.print("\nWe're moving on to Subtraction Training Stage 1, here we go...");
                  Subtraction.stageOneSub();
               }   
               else {
                  System.out.print("\nReturning to main menu...");       
                  CSCI1100_PROJECT.runMainMenu();
               }                 
            } 
            else{
               user_input = continueCheckFail();
               if (user_input.equals("0")||user_input.equals("retry"))
                  System.out.print("\nYou chose to retry this stage, starting again...");   
               else {
                  System.out.print("\nReturning to main menu...");       
                  CSCI1100_PROJECT.runMainMenu();
               }                 
            }                  
         }
      }   
                
      else
         CSCI1100_PROJECT.runMainMenu();
         
   }//END stageThreeAdd()
        

   //QUESTION GENERATOR FOR STAGE THREE
   public static int q3A(int score){
      Scanner kb = new Scanner(System.in);
      int n1,n2,n3, userAns = 0, ans;
      String selection = "", user_input = "";
      boolean x = false;
      Random r = new Random();
      n1 = r.nextInt(15)+1;
      n2 = r.nextInt(15)+1;
      n3 = r.nextInt(15)+1;
      System.out.print("\nSolve the equation: " + n1 + " + " + n2 + " + " + n3 + " = ");
      user_input = kb.nextLine();
      user_input = user_input.toLowerCase();
      if (user_input.equals("quit"))
         return -1;
         
      while(x != true){
         try {
            userAns = Integer.parseInt(user_input);
            x = true;
         } catch (NumberFormatException e) {
            System.out.print("\nThis input is invalid, please enter a whole number : ");
            user_input = kb.nextLine();
            x = false;
         }   
      }         
      ans = n1 + n2 + n3;
      
      if(ans == userAns){
         System.out.println("\nThat was the correct answer!");
         correct.randomSayingCorrect();
         score++;
      }
      else{
         System.out.println("\nWhat you have entered is incorrect.");
         wrong.randomSayingWrong();
      }
      return score;
      
   }//END q3A        
      
     
   public static String continueCheck12(String message){
      Scanner kb = new Scanner(System.in);
      System.out.print(message);
      System.out.println("\nReplay    - 0"
                        +"\nContinue  - 1"
                        +"\nMain Menu - 2"); 
      String[] menu_options = {"replay","0","continue","1","main menu","2"};
      String user_input = CSCI1100_PROJECT.runInputLoop(menu_options);
      return user_input;
   }//END continueCheck12  
   
   public static String continueCheck3(String message){
   Scanner kb = new Scanner(System.in);
   System.out.print(message);
   System.out.println("\n0 - Replay Addition Stage 3"
                     +"\n1 - Continue to Subtraction Stage 1"
                     +"\n2 - Main Menu"); 
   String[] menu_options = {"replay","0","continue","1","main menu","2"};
   String user_input = CSCI1100_PROJECT.runInputLoop(menu_options);
   return user_input;
   }//END continueCheck3
   
   public static String continueCheckFail(){
      Scanner kb = new Scanner(System.in);
      System.out.print("\nSorry, you have not scored high enough to complete this stage."
                                 +"\nWhat would you like to do?");
      System.out.println("\n0 - Retry"
                        +"\n1 - Main Menu");
      String[] menu_options = {"retry", "0", "main menu", "2"};
      String user_input = CSCI1100_PROJECT.runInputLoop(menu_options);
      return user_input;
   }//END continueCheckFail   
                                
      
}//END CLASS
                      
 
