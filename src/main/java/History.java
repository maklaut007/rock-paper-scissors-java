import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<String> resultsList;

    public History() {
        this.resultsList = new ArrayList<>();
    }

    /**
     * Adds new result to the array of results
     * @param result get game result from the Game class
     */
    public void addResult(String result){
        resultsList.add(result);
    }

    /**
     * displays list of results and players scores
     * @param pOneScore
     * @param pTwoScore
     */
    public void displayResults(int pOneScore, int pTwoScore){
        System.out.println("Player one score: " + pOneScore + "\t\t || \t Player two score: " + pTwoScore);
        resultsList.forEach(System.out::println);
    }
}
