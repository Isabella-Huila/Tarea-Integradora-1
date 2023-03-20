public class Player {

    private String name;
    private double score;

    private String gameToken;

    private int squaresTraveled;

    private int turn;

    public Player(String name, String gameToken) {
        this.name = name;
        this.gameToken= gameToken;
        this.turn=turn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public String getGameToken() {
        return gameToken;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public void setGameToken(String gameToken) {
        this.gameToken = gameToken;
    }

    public void setSquaresTraveled(int squaresTraveled) {
        this.squaresTraveled = squaresTraveled;
    }

    public int getSquaresTraveled() {
        return squaresTraveled;
    }
}
