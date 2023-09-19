import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean awesomesauce = true;
    int roundstoWin = 2;
    int computerPoints = 0;
    int playerPoints = 0;
    Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		Move computerMove = new Move("");
    Move playerMove = new Move("");
    
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
  
    while (awesomesauce == true){
      
      System.out.println("\n" + "Hello! Welcome to Rock, Paper, Scissors! Please choose an option:" + "\n" + "1. Start game" + "\n" + "2. Change number of rounds" + "\n" + "3. Exit the Application");
      int MenuSelect = sc.nextInt();
      
      if (MenuSelect == 1){
        System.out.println("Okay! Let's play a game!");
        for (var i = 1; i <= roundstoWin; i++){
          int random = (int) Math.floor(Math.random()*3) + 1;
          switch (random){
            case 1:
              computerMove = rock;
              break;
            case 2:
              computerMove = paper;
              break;
            case 3:
              computerMove = scissors;
              break;
          }
          
          System.out.println("\n" + "The compu'er has chosen its move. Select your move:" + "\n" + "1. Rock" + "\n" + "2. Paper" + "\n" + "3. Scissors");
          int playerNumber = sc.nextInt();
          switch (playerNumber){
            case 1:
              playerMove = rock;
              break;
            case 2:
              playerMove = paper;
              break;
            case 3:
              playerMove = scissors;
              break;
          }

          switch (Move.compareMoves(computerMove, playerMove)){
            case 0:
              computerPoints++;
              System.out.printf("Computer used %s and player used %s. Computer wins!" + "\n" + "Player: " + playerPoints + " - Computer: " + computerPoints, computerMove.getName(), playerMove.getName());
              break;
            case 1:
              playerPoints++;
              System.out.printf("Computer used %s and player used %s. Player wins!" + "\n" + "Player: " + playerPoints + " - Computer: " + computerPoints, computerMove.getName(), playerMove.getName());
              break;
            case 2:
              System.out.printf("Computer used %s and player used %s. Neither of you win..." + "\n" + "Player: " + playerPoints + " - Computer: " + computerPoints, computerMove.getName(), playerMove.getName());
              break;
          }
        }
        
        System.out.println("\n" + "Computer has won a total of " + computerPoints + " and Player has won a total of " + playerPoints + "!");
        if (computerPoints < playerPoints){
          System.out.println("Player wins!" + "\n");
        }
        else if (computerPoints > playerPoints){
          System.out.println("Computer wins!" + "\n");
        }
        else if (computerPoints == playerPoints){
          System.out.println("The Computer and Player tied!" + "\n");
        }
      }
        
      else if (MenuSelect == 2){
        System.out.println("Owkii, how many wins are needed to win a match?");
        roundstoWin = sc.nextInt();
        System.out.println("New setting has been saved! It will now take " + roundstoWin + " wins to win a match!");
      }
        
      else if (MenuSelect == 3){
        awesomesauce = false;
        System.out.println("Thanks for playing!");
      }
        
      else {
        System.out.println("That is not a valid option! Please try again!");
        MenuSelect = sc.nextInt();
      }
    }
  }
}
