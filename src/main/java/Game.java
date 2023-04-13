import java.util.Scanner;

public class Game {
    // Creates game
    // Asks 2 players or vs. computer
    // Calls players
    // Checks result
    Player player1;
    Player player2;

    public Game() {
        this.player1 = new HumanPlayer();
    }

    /**
     * Compares results entered by 2 players in displays result
     * @return
     */
    public String compareAnswers() {
        String result = "";
        String sign1 = this.player1.getSign();
        String sign2 = this.player2.getSign();
//        System.out.println(sign1);
//        System.out.println(sign2);
        if ((sign1.equals("paper") && sign2.equals("rock")) || (sign1.equals("rock") && sign2.equals("scissors")) || (sign1.equals("scissors") && sign2.equals("paper"))) {
            System.out.println("You win!");
        } else if ((sign1.equals("rock") && sign2.equals("paper")) || (sign1.equals("scissors") && sign2.equals("rock")) || (sign1.equals("paper") && sign2.equals("scissors"))) {
            System.out.println("You lose!");
        } else
            System.out.println("Tie!");
        return result;
    }

    /**
     * Asks user to choose opponent type: computer or human
     * assign opponent to variable
     */
    public void setPlayer2() {
        System.out.println("Who do you play against? \n type 1 if human \ntype 2 if computer");
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
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("MAIN MENU");
        System.out.println("=========");
        System.out.println("1. Type 'play' to play.\n" +
                "2. Type 'history' to view your game history.\n" +
                "3. Type 'quit' to stop playing.");
        Scanner scanner = new Scanner(System.in);
        String menuChoice = scanner.nextLine();
        if(menuChoice.toLowerCase().equals("play")){
            this.play();
        }
        if(menuChoice.toLowerCase().equals("history")){
            // Display history
        }
        if(menuChoice.toLowerCase().equals("quit")){
            return;
        }
        mainMenuOptions();
    }
    public void play() {
        this.setPlayer2();
        player1.nextTurn();
        player2.nextTurn();
        System.out.println(player1.displayChoice());
        System.out.println(player2.displayChoice());
        this.compareAnswers();
    }

}
