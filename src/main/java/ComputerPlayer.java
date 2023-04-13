import java.util.Random;
public class ComputerPlayer extends Player{

    /**
     * Generates random choice (paper, rock or scissors) for computer
     */
    @Override
    public void nextTurn(){
        Random rand = new Random();
        int randNum = rand.nextInt(3);
        if(randNum == 0 ){
            this.setSign("paper");
        } else if(randNum == 1 ){
            this.setSign("rock");
        } else {
            this.setSign("scissors");
        }

    }
    @Override
    public String displayChoice() {
        return  "Computer picks: " + this.getSign();
    }

}
