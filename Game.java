import java.util.*;

public class Game
{

    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";

    public static void main(String args[])
    {
        System.out.println("Can you win against a computer?? Enter an option from the choices below! :  ");
        System.out.println("ROCK");
        System.out.println("PAPER");
        System.out.println("SCISSORS");
        System.out.println();

        String playerMove = getPlayerMove();
        String computerMove = getComputerMove();

        //Rules of the Game Applied Below:
      /*If both player and computer have same move then it's a tie!*/
        if (playerMove.equals(computerMove))
            System.out.println("Its a draw !!! Try Again!!");
            // if playerMove is ROCK
        else if (playerMove.equals(Game.ROCK))
            System.out.println(computerMove.equals(Game.PAPER) ? "Computer Wins": "You Won!!");
            // if playerMove is PAPER
        else if (playerMove.equals(Game.PAPER))
            System.out.println(computerMove.equals(Game.SCISSORS) ? "Computer Wins": "You Won!!");
            // if playerMove is SCISSORS
        else
            System.out.println(computerMove.equals(Game.ROCK) ? "Computer Wins": "You Won!!");
    }

    /* Get Computer's move using Random 
       class nextInt() method */
    public static String getComputerMove()
    {
        String computermove;
        Random random = new Random();
        int input = random.nextInt(3)+1;
        if (input == 1)
            computermove = Game.ROCK;
        else if(input == 2)
            computermove = Game.PAPER;
        else
            computermove = Game.SCISSORS;

        System.out.println("Computer move is: " + computermove);
        System.out.println();
        return computermove;
    }

    /* Get Player's move using Scanner
       class */
    public static String getPlayerMove()
    {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String playermove = input.toUpperCase();
        System.out.println("Your move is: "+ playermove);
        return playermove;
    }
}