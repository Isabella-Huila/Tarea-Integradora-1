public class Square {
    private int num;
    private Player playerUno;
    private Player playerDos;
    private Player playerTres;

    private Square next;
    private Square previus;

    private Square snakestart;
    private Square snakeend;
    private Square ladderstart;
    private Square ladderend;

    private String message;

    private  int value;

    public Square getSnakestart() {
        return snakestart;
    }

    public void setSnakestart(Square snakestart) {
        this.snakestart = snakestart;
    }

    public Square getSnakeend() {
        return snakeend;
    }

    public void setSnakeend(Square snakeend) {
        this.snakeend = snakeend;
    }

    public Square getLadderstart() {
        return ladderstart;
    }

    public void setLadderstart(Square ladderstart) {
        this.ladderstart = ladderstart;
    }

    public Square getLadderend() {
        return ladderend;
    }

    public void setLadderend(Square ladderend) {
        this.ladderend = ladderend;
    }

    public String getmessage() {
        return message;
    }

    public void setmessage(String message) {
        this.message = message;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Square(int num) {
        this.num = num;
        this.message="";
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
