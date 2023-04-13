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

    public String compareAnswers() {
        String result = "";
        String sign1 = this.player1.getSign();
        String sign2 = this.player2.getSign();
        System.out.println(sign1);
        System.out.println(sign2);
        if ((sign1.equals("paper") && sign2.equals("rock")) || (sign1.equals("rock") && sign2.equals("scissors")) || (sign1.equals("scissors") && sign2.equals("paper"))) {
            System.out.println("Win");
        } else if ((sign1.equals("rock") && sign2.equals("paper")) || (sign1.equals("scissors") && sign2.equals("rock")) || (sign1.equals("paper") && sign2.equals("scissors"))) {
            System.out.println("Lose");
        } else
            System.out.println("Tie");
        return result;
    }

    /**
     * Asks user to choose opponent type: computer or human
     * assign opponent to variable
     */
    public void setPlayer2() {
        // Put try catch here to check if not 1 or 2
        System.out.println("Who do you play against? \n type 1 if human \ntype 2 if computer");
        Scanner scanner = new Scanner(System.in);
        int playerType = scanner.nextInt();
        if (playerType == 1) {
            this.player2 = new HumanPlayer();
        } else if (playerType == 2) {
            this.player2 = new ComputerPlayer();
        }
    }

    public void play() {
        this.setPlayer2();
        player1.nextTurn();
        player2.nextTurn();
        this.compareAnswers();
    }

}
