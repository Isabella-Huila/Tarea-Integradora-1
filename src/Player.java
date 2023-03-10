public class Player {
    private String name;
    private double score;

    private String gameToken;

    public Player(String name, String gameToken) {
        this.name = name;
        this.gameToken= gameToken;
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

    public void setGameToken(String gameToken) {
        this.gameToken = gameToken;
    }
}
