import java.util.Random;//import random class

public class randomFacts{
      //adds facts as strings to the array
      String fact1, fact2, fact3, fact4, fact5;
      fact1 = "The longest dinosaur was Seismosaurus, which measured over 40 metres! Now that's one hefty Dino!";
      fact2 = "The speediest dino was the ostrich mimic ornithomimids, which could run at speeds of up to 60 kilometres per hour! Try catching up to that dino!";
      fact3 = "The first dinosaur to be named was Megalosaurus! It was named in 1824 by Reverend William Buckland.";
      fact4 = "The oldest dinosaurs known are 230 million years old! They were found in Madagascar.";
      fact5 = "At present over 700 different species of dinosaurs have been identified! However, scientist believe that there are many more dinos waiting to be found!"; 
      String [] facts = {fact1, fact2, fact3, fact4, fact5};
      
      //prints a random string in the array
      Random r = new Random();
      int i = r.nextInt(5);
      System.out.print("\n Fun Dino Fact! " + facts[i]);
}
      
  
