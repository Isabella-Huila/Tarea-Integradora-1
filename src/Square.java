public class Square {
    private int num;
    private Player playerUno;
    private Player playerDos;
    private Player playerTres;

    private Square next;
    private Square previus;
    private Square sanke;

    private Square ladders;

    public Square(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setPlayerUno(Player playerUno) {
        this.playerUno = playerUno;
    }

    public void setNext(Square next) {
        this.next = next;
    }

    public void setPrevius(Square previus) {
        this.previus = previus;
    }

    public void setSanke(Square sanke) {
        this.sanke = sanke;
    }

    public void setLadders(Square ladders) {
        this.ladders = ladders;
    }

    public int getNum() {
        return num;
    }

    public Player getPlayerUno() {
        return playerUno;
    }

    public Square getNext() {
        return next;
    }

    public Square getPrevius() {
        return previus;
    }

    public Square getSanke() {
        return sanke;
    }

    public Square getLadders() {
        return ladders;
    }

    public Player getPlayerDos() {
        return playerDos;
    }

    public Player getPlayerTres() {
        return playerTres;
    }

    public void setPlayerDos(Player playerDos) {
        this.playerDos = playerDos;
    }

    public void setPlayerTres(Player playerTres) {
        this.playerTres = playerTres;
    }
}
