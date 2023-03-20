public class NodeScore {
    private double score;
    private Player player;

    private NodeScore right;
    private NodeScore left;


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

    public void setRight(NodeScore right) {
        this.right = right;
    }

    public void setLeft(NodeScore left) {
        this.left = left;
    }

    public NodeScore getRight() {
        return right;
    }

    public NodeScore getLeft() {
        return left;
    }
}
