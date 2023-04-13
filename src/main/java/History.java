import java.util.ArrayList;
import java.util.List;

public class History {
    private List<String> resultsList;

    public History() {
        this.resultsList = new ArrayList<>();
    }

    /**
     * Adds new result to the array of results
     * @param result
     */
    public void addResult(String result){
        resultsList.add(result);
    }
    public void displayResults(int pOneScore, int pTwoScore){
        System.out.println("Player one score: " + pOneScore + "\t\t || \t Player two score: " + pTwoScore);
        resultsList.forEach((str) -> System.out.println(str));
    }
}
