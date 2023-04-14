public abstract class Player {
    private String sign;
    private int score;

    public Player() {
        this.score = 0;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void increaseScore() {
        this.score++;
    }

    public int getScore() {
        return score;
    }

    abstract public void nextTurn();

    abstract public String displayChoice();
}
