import java.util.Scanner;

public class Game {
    // Creates game
    // Asks 2 players or vs. computer
    // Calls players
    // Checks result
    Player player1;
    Player player2;

    public void setPlayer2() {
        // Put try catch here to check if not 1 or 2
        System.out.println("Who do you play against? \n type 1 if human \ntype 2 if computer");
        Scanner scanner = new Scanner(System.in);
        int playerType = scanner.nextInt();
        if(playerType == 1){
            this.player2 = new Human();
        }else if(playerType == 2){
            this.player2 = new Computer();
        }
        player2.nextTurn();
    }

}
