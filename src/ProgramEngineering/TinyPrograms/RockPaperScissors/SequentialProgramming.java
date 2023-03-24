package ProgramEngineering.TinyPrograms.RockPaperScissors;

import java.util.Scanner;

public class SequentialProgramming {

    public static void main(String[] args) {
//        Get user's input
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your move. Type in rock, paper or scissors: ");
            System.out.println("If you want to exit the game, type in \"quit\"");
            String myMove = input.nextLine();

//        Check if User wants to quit
            if (myMove.equalsIgnoreCase("quit")) {
                break;
            }

//        Verify the inputted my move is valid
            if (!myMove.equalsIgnoreCase("rock")
                    && !myMove.equalsIgnoreCase("paper")
                    && !myMove.equalsIgnoreCase("scissors")) {
                System.out.println("Your move was not valid!");
            } else {
//            Randomly generate the opponent move
                int randomNumber = (int) (Math.random() * 3);
                String opponentMove;
                if (randomNumber == 0) {
                    opponentMove = "rock";
                } else if (randomNumber == 1) {
                    opponentMove = "paper";
                } else {
                    opponentMove = "scissors";
                }
                System.out.println("Opponent's move: " + opponentMove);

//            Calculate if User won, lost or tied
                if (myMove.equals(opponentMove)) {
                    System.out.println("You tied!");
                } else if (myMove.equalsIgnoreCase("rock") && opponentMove.equalsIgnoreCase("scissors")
                        || myMove.equalsIgnoreCase("paper") && opponentMove.equalsIgnoreCase("rock")
                        || myMove.equalsIgnoreCase("scissors") && opponentMove.equalsIgnoreCase("paper")) {
                    System.out.println("You won!");
                } else {
                    System.out.println("You lost!");
                }
            }
        }
        System.out.println("Thanks for playing game :)");
    }
}
