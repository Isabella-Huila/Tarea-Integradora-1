public class NodeScore {
    private double score;
    private Player player;



    public NodeScore(Player player) {
        this.player = player;
        this.score= player.getScore();
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public double getScore() {
        return score;
    }

    public Player getPlayer() {
        return player;
    }
}
