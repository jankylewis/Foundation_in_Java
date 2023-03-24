package ProgramEngineering.TinyPrograms.RockPaperScissors.OOP;

import java.util.Scanner;

public class PlayGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Game game = new Game();
        char quit = ' ';

        while (true) {
            game.play();
            System.out.println("You want to play again? Press any key to continue , or \"Q\" to quit the game.");
            quit = scan.nextLine().toUpperCase().charAt(0);
            if (quit == 'Q') {
                break;
            }
        }
        scan.close();
        game.displayStatistic();
    }
}
