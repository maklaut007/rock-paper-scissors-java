import java.util.Random;
public class ComputerPlayer extends Player{

    @Override
    public void nextTurn(){
        Random rand = new Random();
        int randNum = rand.nextInt(3);
        System.out.println(randNum);
        if(randNum == 0 ){
            this.setSign("paper");
        } else if(randNum == 1 ){
            this.setSign("rock");
        } else {
            this.setSign("scissors");
        }
    }
}
