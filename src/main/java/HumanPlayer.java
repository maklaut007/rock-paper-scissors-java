import java.util.Scanner;

public class HumanPlayer extends Player{

    /**
     * Allows user to choose sign to play
     */
    @Override
    public void nextTurn() {
        System.out.println("Type 'rock', 'paper', or 'scissors' to play.");
        Scanner scanner = new Scanner(System.in);
        this.setSign(scanner.nextLine().toLowerCase());
        // if user input is incorrect
        if(!this.getSign().equals("rock") && !this.getSign().equals("paper") && !this.getSign().equals("scissors")) {
            System.out.println("Sign you entered is incorrect. Try again");
        }
    }

    @Override
    public String displayChoice() {
        return "User picks: " + this.getSign();
    }



    @Override
    public String displayWinText(boolean isSecondWins) {
        return isSecondWins ? "Player 2 wins" : "Player 1 wins";
    }
}
