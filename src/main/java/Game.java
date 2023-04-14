import java.util.Scanner;

public class Game {
    // Creates game
    // Asks 2 players or vs. computer
    // Calls players
    // Checks result
    private Player player1;
    private Player player2;
    private History gameHistory;
    public Game() {
        this.player1 = new HumanPlayer();
        this.gameHistory = new History();
        System.out.println("\nWelcome to Rock, Paper, Scissors!");
    }

    /**
     * Compares results entered by 2 players and returns the result
     * @return text result of the round
     */
    public String compareAnswers() {
        String result = "";
        String sign1 = this.player1.getSign();
        String sign2 = this.player2.getSign();
        if ((sign1.equals("paper") && sign2.equals("rock")) || (sign1.equals("rock") && sign2.equals("scissors")) || (sign1.equals("scissors") && sign2.equals("paper"))) {
            result = "Player 1 Winner";
            player1.increaseScore();
        } else if ((sign1.equals("rock") && sign2.equals("paper")) || (sign1.equals("scissors") && sign2.equals("rock")) || (sign1.equals("paper") && sign2.equals("scissors"))) {
            result = "Player 2 Winner";
            player1.increaseScore();
        } else
            result = "Tie";
        gameHistory.addResult(result + ": \t Player 1: " + sign1 + " | Player 2: " + sign2);
        return result;
    }

    /**
     * Asks user to choose opponent type: computer or human
     * assign opponent to variable
     */
    public void setPlayer2() {
        System.out.println("Who do you want to play against? \ntype 1 if human \ntype 2 if computer");
        try {
            Scanner scanner = new Scanner(System.in);
            int playerType = scanner.nextInt();
            if (playerType == 1) {
                this.player2 = new HumanPlayer();
            } else if (playerType == 2) {
                this.player2 = new ComputerPlayer();
            } else {
                throw new Exception("InputMismatchException");
            }
        } catch (Exception e) {
            System.out.println("Your input is incorrect. Try again");
            this.setPlayer2();
        }
    }

    /**
     * Displays greetings and allows user to play the game/ check history/ leave
     * after player plays the game of checks history show options again
     */
    public void mainMenuOptions(){
        System.out.println("""
                \nMAIN MENU
                =========
                1. Type 'play' to play.
                2. Type 'history' to view your game history.
                3. Type 'quit' to stop playing.""") ;

        Scanner scanner = new Scanner(System.in);
        String menuChoice = scanner.nextLine();
        if(menuChoice.equalsIgnoreCase("play")){
            this.play();
        }
        if(menuChoice.equalsIgnoreCase("history")){
            gameHistory.displayResults(player1.getScore(), player2.getScore());
        }
        if(menuChoice.equalsIgnoreCase("quit")){
            return;
        }
        mainMenuOptions();
    }

    /**
     * calls players turns and displays their choices
     */
    public void play() {
        this.setPlayer2();
        player1.nextTurn();
        player2.nextTurn();
        System.out.println(player1.displayChoice());
        System.out.println(player2.displayChoice());
        System.out.println(this.compareAnswers());

    }

}
