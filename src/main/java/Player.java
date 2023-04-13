public abstract class Player {
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    abstract public void nextTurn();
    abstract public String displayChoice();
    // points
}
