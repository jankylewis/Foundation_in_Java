package ProgramEngineering.TinyPrograms.RockPaperScissors.OOP;

public class Game extends GameItems {

    private Player player;
    private Computer computer;
    private CHOICES playerChoice;
    private CHOICES computerChoice;
    private RESULT result;

//    when displaying three below variables, the statistics have been calculated to have a number,
//    so it is a constant variable when being displayed
//    it should be static
    private static int numberOfWin;
    private static int numberOfLose;
    private static int numberOfTie;

    public Game() {
        super();
        player = new Player();
        computer = new Computer();
    }

    public void play() {
        playerChoice = player.getChoice();
        computerChoice = computer.getChoice();
        result = getResult();
        displayResult();
        statistic();
    }

    public void displayStatistic() {
        System.out.println("You played " + (numberOfWin + numberOfLose + numberOfTie) + " times");
        System.out.println("You won " + numberOfWin + " times");
        System.out.println("You lost " + numberOfLose + " times");
        System.out.println("The tie occurred " + numberOfTie + " times");
        System.out.println("Thanks for playing :)\nGood bye!");
    }

    private void statistic() {
        if (result == RESULT.WIN) {
            numberOfWin++;
        } else if (result == RESULT.LOSE) {
            numberOfLose++;
        }
        else {
            numberOfTie++;
        }
    }

    private void displayResult() {
        switch (result) {
            case WIN -> {
                System.out.println(playerChoice + " trumped " + computerChoice + ". Player won! ");
            }
            case LOSE -> {
                System.out.println(playerChoice + " lost to " + computerChoice + ". Computer won!");
            }
            case TIE -> {
                System.out.println(playerChoice + " equals to " + computerChoice + ". There was a tie!");
            }
        }
    }

    private RESULT getResult() {
        if (playerChoice == computerChoice) {
            return RESULT.TIE;
        }
        switch (playerChoice) {
            case ROCK -> {
                return (computerChoice == CHOICES.SCISSORS ? RESULT.WIN : RESULT.LOSE);
            }
            case PAPER -> {
                return (computerChoice == CHOICES.ROCK ? RESULT.WIN : RESULT.LOSE);
            }
            case SCISSORS -> {
                return (computerChoice == CHOICES.PAPER ? RESULT.WIN : RESULT.LOSE);
            }
        }
//        this method will never return null
        return null;
    }
}
