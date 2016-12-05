import java.util.Random;//import random class
import java.util.Scanner;//import scanner
import java.lang.NumberFormatException;//import number format exception
import java.util.Timer;

public class Survival {
      
   //The main class for survival mode, runs the intro and the loop to call question methods      
   public static int survival(){
      Scanner kb = new Scanner(System.in);
      Random r = new Random();
      int score = 0;
      int counter = 0;
      int wrong = 0;
      
      System.out.print("\nYou have entered \"...SURVIVAL MODE...\" there is no end to this gamemode"
                      +"\nyour job is to keep answering questions until you can't anymore."
                      
                      +"\n\nYou have 15 seconds to answer each question, if you run out"
                      +"\nof time your answer will be considered incorrect,"
                      +"\nif you answer 3 questions incorrectly you lose!");
                      
      System.out.println("\n\nWould you like to play?"
                        +"\n1 - Yes (continue)"
                        +"\n2 - No (main menu)");
                     
      String[] menu_options = {"yes","1","no","2"};
      
      String user_input = CSCI1100_PROJECT.runInputLoop(menu_options); 
      
      //if the user says yes they want to play it enters the question calling loop
      if (user_input.equals("yes") || user_input.equals("1")){
         System.out.print("\nYou can quit to the main menu at any time by typing \'quit\'");
         
         while (counter != -1){
            //this inside loop runs 10 times calling random questions from the "randomQ" method
            for (int i = 0 ; i < 10 ; i++){
               //initialize the "time" variables 
               long limit = 15000; //this is equal to 15000miliseconds, or 15 seconds
               long startTime = System.currentTimeMillis();
               //this will pass the current counter (which starts at 0) into the randomQ() method. 
               //higher counters means harder questions will be selected. Incorrect answers return a 0
               //typing quit will return a -1,  correct answers will return a 1.
               int check = randomQ(counter);   
               //if they ever type in quit as an answer it'll return check as -1
               //which will return the score to the runSurvivalMode method and restart the main menu
               if (check == -1){
                  System.out.print("\nYou have chosen to quit Survival Mode."
                                  +"\nYour final score was: "+score
                                  +"\nReturning to the main menu...");
                  return score;                
               }                  
               //if their answer is wrong it'll increment the "wrong" counter 
               else if (check == 0)
                  wrong++;
               //this checks the time, they are allowed only 15 seconds to answer   
               else if ((startTime + limit) < System.currentTimeMillis()) {
                  System.out.print("\nYour answer was too slow ("+((System.currentTimeMillis()-startTime)/1000)
                                  +" seconds) and it was counted as a mistake!");
                  wrong++;
               }
               //if their answer is correct it will augment the score by 'check' which will be 1
               else
                  score += check;   
                     
               //if at any point during the question loop they get 3 incorrect, it will return the score
               //to the runSurvivalMode() method and will restart the main menu.      
               if (wrong == 3) {
                  System.out.print("\nThat was your third incorrect answer!"
                                  +"\nYour final score was: "+score
                                  +"\nReturning to the main menu...");
                  return score;
               }
               //augment the counter after every iteration of the for loop so that it can be passed into the 
               //randomQ method. Higher counter means it'll pull the questions from a harder random() method.
               counter++;               
            }//end for 
            
            //after every 10 rounds it'll ask the user if they want to continue playing
            //if they say no it'll tell them their score and return them to the main menu
            System.out.println("\nYou've been playing for "+counter+" rounds,"
                            +"\ndo you want to keep playing?"
                            +"\n1 - Yes (continue)"
                            +"\n2 - No (main menu)");           
            
            user_input = CSCI1100_PROJECT.runInputLoop(menu_options);                            
            if (user_input.equals("no") || user_input.equals("2")){
               System.out.print("\nYour final score was: "+score
                               +"\nReturning to the main menu...");
               return score;                
            }                   
         }//end while
      }//end if 
      
      //if they never said "yes" to starting survival mode, it'll send them back to the main menu
      else
         System.out.print("\nReturning to the main menu..."); 
      return score;           
   } //END MAIN METHOD


   //This is the first question generator method, it'll determine a random number from 1 - 4 and will choose from the 
   //Addition, Subtraction, Multiplication, Division (stage 1) questions to ask the user.
   //if their answer is correct it'll return 1, incorrect 0, quit -1
   public static int qGen1(){
      Random r = new Random();
      int ques = r.nextInt(4)+1;
      int tempScore = 0;
      
      if (ques == 1){
         tempScore = Addition.q1A(tempScore);
         return tempScore;
      }   
      else if (ques == 2){
         tempScore = Subtraction.q1S(tempScore);
         return tempScore;
      }      
      else if (ques == 3){
         tempScore = Multiplication.q1M(tempScore);
         return tempScore;
      }   
      else {
         tempScore = Division.q1D(tempScore);
         return tempScore;  
      }        
   }//END QUESTION GENERATOR 1  
   
   
   //this is question generator 2, it chooses from stage 2 questions (slightly harder)
   public static int qGen2(){
      Random r = new Random();
      int ques = r.nextInt(4)+1;
      int tempScore = 0;
      
      if (ques == 1){
         tempScore = Addition.q2A(tempScore);
         return tempScore;
      }   
      else if (ques == 2){
         tempScore = Subtraction.q2S(tempScore);
         return tempScore;
      }      
      else if (ques == 3){
         tempScore = Multiplication.q2M(tempScore);
         return tempScore;
      }   
      else {
         tempScore = Division.q2D(tempScore);
         return tempScore;  
      }        
   }//END QUESTION GENERATOR 2   
   
   //this is the question 3 generator, it selects random questions from the stage 3 training mode questions. 
   public static int qGen3(){
      Random r = new Random();
      int ques = r.nextInt(4)+1;
      int tempScore = 0;
      
      if (ques == 1){
         tempScore = Addition.q3A(tempScore);
         return tempScore;
      }   
      else if (ques == 2){
         tempScore = Subtraction.q3S(tempScore);
         return tempScore;
      }      
      else if (ques == 3){
         tempScore = Multiplication.q3M(tempScore);
         return tempScore;
      }   
      else {
         tempScore = Division.q3D(tempScore);
         return tempScore;  
      }        
   }//END QUESTION GENERATOR 3      
      
      
   //This is the bread and butter method. This is the method that determines which random() level
   //of questions will be chosen depending on the current counter. The longer that the user plays,
   //the harder the "random()" method it will redirect to.
      
   public static int randomQ(int counter){
      
      if (counter < 5)
         return random1();
      else if (counter < 10)
         return random2();
      else if (counter < 15)
         return random3();
      else if (counter < 20)
         return random4();
      else if (counter < 25)
         return random5();
      else if (counter < 30)
         return random6();
      else if (counter < 35)
         return random7(); 
      else if (counter < 40)
         return random8();
      else if (counter < 45)
         return random9();
      else
         return random10();                           
   }
   
   //All of the following methods from this point downward are random() methods. 
   //they are numbered random1() - random10(). Each one of them determines a random number, and
   //depending on the result it runs the question 1, 2, or 3 generator methods. 
   //The only difference between these methods is the percentage chance of receiving questions from 
   //a higher stage from training mode. At the max level of random10(); 90% of the questions asked will be
   //from stage 3 training mode.    
   
   public static int random1(){
      Random r = new Random();
      int shuffle = r.nextInt(100)+1;
      
      //97% chance for stage 1 questions
      if (shuffle <= 97)
         return qGen1();
      //3% chance for stage 2   
      else
         return qGen2();
   }
   
   
   public static int random2(){
      Random r = new Random();
      int shuffle = r.nextInt(100)+1;
      
      //75% chance for stage 1
      if (shuffle <= 75)
         return qGen1();
      //25% chance for stage 2   
      else
         return qGen2();
   }
   
   
   public static int random3(){
      Random r = new Random();
      int shuffle = r.nextInt(100)+1;
      
      //50% chance for stage 1
      if (shuffle <= 50)
         return qGen1();
      //50% chance for stage 2   
      else
         return qGen2();
   }
   
   
   public static int random4(){
      Random r = new Random();
      int shuffle = r.nextInt(100)+1;
      
      //25% chance for stage 1
      if (shuffle <= 25)
         return qGen1();
      //75% chance for stage 2   
      else
         return qGen2();
   }    
   
   
   public static int random5(){
      Random r = new Random();
      int shuffle = r.nextInt(100)+1;
      
      //5% chance for stage 1
      if (shuffle <= 5)
         return qGen1();
      //90% chance for stage 2   
      else if (shuffle > 5 && shuffle <= 95)
         return qGen2();
      //5% chance for stage 3   
      else
         return qGen3();   
   }    
   
   
   public static int random6(){
      Random r = new Random();
      int shuffle = r.nextInt(100)+1;
      
      //5% chance for stage 1
      if (shuffle <= 5)
         return qGen1();
      //70% chance for stage 2   
      else if (shuffle > 5 && shuffle <= 75) 
         return qGen2();
      //25% chance for stage 3   
      else
         return qGen3();   
   }    
   
   
   public static int random7(){
      Random r = new Random();
      int shuffle = r.nextInt(100)+1;
      
      //5% chance for stage 1
      if (shuffle <= 5)
         return qGen1();
      //50% chance for stage 2   
      else if (shuffle > 5 && shuffle <= 55)
         return qGen2();
      //45% chance for stage 3
      else
         return qGen3();      
   }                                             

   public static int random8(){
      Random r = new Random();
      int shuffle = r.nextInt(100)+1;
      
      //5% chance for stage 1
      if (shuffle <= 5)
         return qGen1();
      //30% chance for stage 2   
      else if (shuffle > 5 && shuffle <= 35)
         return qGen2();
      //65% chance for stage 3
      else
         return qGen3();      
   }                    
   
   public static int random9(){
      Random r = new Random();
      int shuffle = r.nextInt(100)+1;
      
      //5% chance for stage 1
      if (shuffle <= 5)
         return qGen1();
      //10% chance for stage 2   
      else if (shuffle > 5 && shuffle <= 15)
         return qGen2();
      //85% chance for stage 3
      else
         return qGen3();      
   }
   
   public static int random10(){
      Random r = new Random();
      int shuffle = r.nextInt(100)+1;
      
      //5% chance for stage 1
      if (shuffle <= 5)
         return qGen1();
      //5% chance for stage 2   
      else if (shuffle > 5 && shuffle <= 10 )
         return qGen2();
      //90% chance for stage 3
      else
         return qGen3();      
   }                                                       
      
}        
            