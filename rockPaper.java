import java.util.*;
import java.util.Scanner;
public class rockPaper{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      Random rn = new Random();
      System.out.println("Play the Classic Game of Rock Paper Scissors!");
      System.out.println("Developed at GoalPost Programming");
      System.out.println("");
      int playerOne;
      int playerTwo;
      int victory;
      String winner;
      String playerOneString;
      String playerTwoString;
      String tagLine;
      //Wait for game begin command
      int begin = 0;
      while (begin != 1){
         System.out.print("Enter '1' to begin: ");
         begin = input.nextint();
      }
      //Set Variable to allow the game to easily be repeated.
      double again = 1;
      //Start Game
      while(again==1){

      int numRowsInConsole = 60;
      for (int ii=0; ii<numRowsInConsole; ii++) {
          // scroll down one line
          System.out.println("");
      }
          System.out.println("Prepare to face the Game!");
          System.out.println("And may the odds be ever in your favor!");
          System.out.println("");
          System.out.println("You are playing for the best 2 out of 3");
          System.out.println("Good Luck!");
          System.out.println("");

          begin = 0;
          while (begin != 1){
            System.out.print("Enter '1' to begin: ");
            begin = input.nextint();
          }
          int numRowsInConsole = 60;
          for (int ii=0; ii<numRowsInConsole; ii++){
            System.out.println("");
         }
         System.out.println("Rock->Scissors->Paper->Rock->Lizard->Spock->Scissors->Lizard->"+"Paper->Spock->Rock");
         System.out.println("Enter Scissor(0), rock (1), Paper (2), Lizard(3),  or Spock(4)");

         playerOne = input.nextint();

         while(playerOne != 0 && playerOne != 1 && playerOne != 2 && playerOne != 3 && playerOne != 4){
            System.out.println("I planned for every possiblity... Like you cheating"+" Try making a valid entry.");
            playerOne = input.nextint();
            switch (playerOne){
               case 0:
               playerOneString = "Scissors ";
               break;

               case 1:
               playerOneString = "Rock ";
               break;

               case 2:
               playerOneString = "Paper ";
               break;

               case 3:
               playerOneString = "Lizard ";
               break;

               case 4:
               playerOneString = "Spock ";
               break;
            }

            switch (playerTwo){
               case 0:
               playerTwoString = "Scissors ";
               break;

               case 1:
               playerTwoString = "Rock ";
               break;

               case 2:
               playerTwoString = "Paper ";
               break;

               case 3:
               playerTwoString = "Lizard ";
               break;

               case 4:
               playerTwoString = "Spock ";
               break;
            }

         }
         System.out.println("");
         playerTwo = rn.nextint(5);

         //Determine the Victor!
         switch(playerTwo){
            //Scissor: Beats Paper(2) and Lizard(3)
            //Scissor: Beat by Rock(1) and Spock(4)
            case 0:
               if (playerOne == 2 || playerOne == 3){
                  victory = 2;
               }
               if (playerOne == 1 || playerOne == 4){
                  victory = 1;
               }
            break;
            //Rock: Beats Scissor(0) and Lizard(3)
            //Rock: Beat by Paper(2) and Spock(4)
            case 1:
               if (playerOne == 0 || playerOne == 3){
                  victory = 2;
               }
               if (playerOne == 2 || playerOne == 4){
                  victory = 1;
               }
            break;
            //Paper: Beats Rock(1) and Spock(4)
            //Paper: Beat by Scissor(0) and Lizard(3)
            case 2:
               if (playerOne == 1 || playerOne == 4){
                  victory = 2;
               }
               if (playerOne == 0 || playerOne == 3){
                  victory = 1;
               }
            break;
            //Lizard: Beats Paper(2) and Spock(4)
            //Lizard: Beat by Scissor(0) and Rock(1)
            case 3:
               if (playerOne == 2 || playerOne == 4){
                  victory = 2;
               }
               if (playerOne == 0 || playerOne == 1){
                  victory = 1;
               }
            break;
            //Spock: Beats Scissors(0) and rock(1)
            //Spock: Beat by Lizard(3) and Paper(2)
            case 4:
               if (playerOne == 0 || playerOne == 1){
                  victory = 2;
               }
               if (playerOne == 3 || playerOne == 2){
                  victory = 1;
               }
            break;
            Default:
            System.out.println("Error: I don't know what you did Moron."+" But You sure Screwed things up!");
            System.exit(1);
         }

         //Assemble Victory Statement
         if (victory == 1){
            winner = playerOneString + "beats " + playerTwoString + "- You Win!";
            tagLine = "You have mastered this!";

         }
         if (victory == 2){
            winner = playerTwoString + "beats " + playerOneString + "- The Computer Wins!";
            tagLine = "Its Time to embrace your Computer OverLords!";
         }
         System.out.println("");
         System.out.println(winner);
         System.out.println(tagLine);
         System.out.println("");
         System.out.println("");
         System.out.println("Ready to play again?");
         System.out.println("Yes! (1)  No...(0)");
         again = input.nextdouble();

   //End of repeatable again while loop and end of game
   }

   }
}
