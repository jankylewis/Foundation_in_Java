package ProgramEngineering.TinyPrograms.RockPaperScissors.OOP;

import java.util.Scanner;

public class Player extends GameItems {

    Scanner scan;

    public Player() {
        super();
        scan = new Scanner(System.in);
    }

    public CHOICES getChoice() {
        System.out.println("Enter your choice: R = ROCK, P = PAPER, S = SCISSORS");
//        only get the first letter of User's input
        char playerChoice = scan.nextLine().toUpperCase().charAt(0);
        switch (playerChoice) {
            case 'R':
                return CHOICES.ROCK;
            case 'P':
                return CHOICES.PAPER;
            case 'S':
                return CHOICES.SCISSORS;
            default:
                System.out.println("Your input was invalid!");
        }
//        if neither of the above choices, -> it is an invalid input
//        System.out.println("Your input is invalid!");
//        if User provides an invalid input -> return this method to go back to the beginning for User to input
        return getChoice();
    }

}
