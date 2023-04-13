import java.util.Scanner;

public class HumanPlayer extends Player{

    @Override
    public void nextTurn() {
        System.out.println("Type your sign: ");
        Scanner scanner = new Scanner(System.in);
        this.setSign(scanner.nextLine().toLowerCase());
        if(this.getSign() != "rock" && this.getSign() != "paper" && this.getSign() != "scissors") {
            // throw error
        }
    }
}
