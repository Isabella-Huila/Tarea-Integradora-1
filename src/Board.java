import java.util.Random;



public class Board {
    private int row;
    private int column;
    private Square head;
    private Square tail;
    private static int n=0;

    private int snakes;
    private int ladders;
    private int length;

    private Player playerUno;
    private Player playerDos;
    private Player playerTres;


    public void addAtSqure(int veces, int row, int column){
        if (row * column == veces){
            return;
        }
        n++;
        Square node= new Square(n);

        if(head == null){
            head = node;
            tail= node;
        }else {
            tail.setNext(node);
            node.setPrevius(tail);
            tail= node;
        }
        this.row=row;
        this.column=column;
        this.length=this.row*this.column;
        addAtSqure(veces+1, row , column);
    }
    public void printBoard(int column){
        printBoard(tail, column);
    }

    public void printBoard(Square current,int column){
        if (head.getNext()==tail){
            System.out.println("[ " + head.getNum() + " ]");;
        }
        if (current== null){
            return;
        }else if (column%2==0){
            if (current.getNum()%(column*2)==0){
                printInOrder(current , column);
                System.out.println();
            }
            else if(current.getNum()%column==0){
                printReverse(current , column);
                System.out.println();
            }
        }else {
            if (current.getNum() % column == 0) {
                if (current.getNum() % 2 == 0){
                    printInOrder(current , column);
                    System.out.println();
                }else {
                    printReverse(current , column);
                    System.out.println();
                }
            }
        }
        printBoard(current.getPrevius(),column);
    }


    public void printInOrder(Square current, int column){
        if (current==head||current.getPrevius().getNum()%column==0){
            if((current.getPlayerUno() != null && current.getPlayerDos() != null) && current.getPlayerTres() != null){
                System.out.print("[ " + current.getNum() + current.getPlayerUno().getGameToken() + current.getPlayerDos().getGameToken() + current.getPlayerTres().getGameToken() + " ]");
            } else if ((current.getPlayerUno() != null && current.getPlayerDos() != null)) {
                System.out.print("[ " + current.getNum() + current.getPlayerUno().getGameToken() + current.getPlayerDos().getGameToken() + " ]");
            } else if (current.getPlayerUno() != null && current.getPlayerTres() == null){
                System.out.print("[ " + current.getNum() + current.getPlayerUno().getGameToken() + current.getPlayerTres().getGameToken() + " ]");
            } else if (current.getPlayerDos() != null && current.getPlayerTres() == null) {
                System.out.print("[ " + current.getNum() + current.getPlayerDos().getGameToken() + current.getPlayerTres().getGameToken() + " ]");
            } else if (current.getPlayerUno() != null) {
                System.out.println("[ " + current.getNum() + current.getPlayerUno().getGameToken() + " ]");
            } else if (current.getPlayerDos() != null){
                System.out.println("[ " + current.getNum() + current.getPlayerDos().getGameToken() + " ]");
            } else if (current.getPlayerTres() != null) {
                System.out.println("[ " + current.getNum() + current.getPlayerTres().getGameToken() + " ]");
            }else {
                System.out.print("[ " + current.getNum() + " ]");
            }
        }else{
            if((current.getPlayerUno() != null && current.getPlayerDos() != null) && current.getPlayerTres() != null){
                System.out.print("[ " + current.getNum() + current.getPlayerUno().getGameToken() + current.getPlayerDos().getGameToken() + current.getPlayerTres().getGameToken() + " ]");
            } else if ((current.getPlayerUno() != null && current.getPlayerDos() != null)) {
                System.out.print("[ " + current.getNum() + current.getPlayerUno().getGameToken() + current.getPlayerDos().getGameToken() + " ]");
            } else if (current.getPlayerUno() != null && current.getPlayerTres() == null){
                System.out.print("[ " + current.getNum() + current.getPlayerUno().getGameToken() + current.getPlayerTres().getGameToken() + " ]");
            } else if (current.getPlayerDos() != null && current.getPlayerTres() == null) {
                System.out.print("[ " + current.getNum() + current.getPlayerDos().getGameToken() + current.getPlayerTres().getGameToken() + " ]");
            } else if (current.getPlayerUno() != null) {
                System.out.println("[ " + current.getNum() + current.getPlayerUno().getGameToken() + " ]");
            } else if (current.getPlayerDos() != null){
                System.out.println("[ " + current.getNum() + current.getPlayerDos().getGameToken() + " ]");
            } else if (current.getPlayerTres() != null) {
                System.out.println("[ " + current.getNum() + current.getPlayerTres().getGameToken() + " ]");
            }else {
                System.out.print("[ " + current.getNum() + " ]");
            }

            printInOrder(current.getPrevius(), column);

        }

    }

    public void printReverse(Square current, int column){
        if (current==head||current.getPrevius().getNum()%column==0){
            if((current.getPlayerUno() != null && current.getPlayerDos() != null) && current.getPlayerTres() != null){
                System.out.print("[ " + current.getNum() + current.getPlayerUno().getGameToken() + current.getPlayerDos().getGameToken() + current.getPlayerTres().getGameToken() + " ]");
            } else if ((current.getPlayerUno() != null && current.getPlayerDos() != null)) {
                System.out.print("[ " + current.getNum() + current.getPlayerUno().getGameToken() + current.getPlayerDos().getGameToken() + " ]");
            } else if (current.getPlayerUno() != null && current.getPlayerTres() == null){
                System.out.print("[ " + current.getNum() + current.getPlayerUno().getGameToken() + current.getPlayerTres().getGameToken() + " ]");
            } else if (current.getPlayerDos() != null && current.getPlayerTres() == null) {
                System.out.print("[ " + current.getNum() + current.getPlayerDos().getGameToken() + current.getPlayerTres().getGameToken() + " ]");
            } else if (current.getPlayerUno() != null) {
                System.out.println("[ " + current.getNum() + current.getPlayerUno().getGameToken() + " ]");
            } else if (current.getPlayerDos() != null){
                System.out.println("[ " + current.getNum() + current.getPlayerDos().getGameToken() + " ]");
            } else if (current.getPlayerTres() != null) {
                System.out.println("[ " + current.getNum() + current.getPlayerTres().getGameToken() + " ]");
            }else {
                System.out.print("[ " + current.getNum() + " ]");
            }
        }else{
            printReverse(current.getPrevius(), column);

            if((current.getPlayerUno() != null && current.getPlayerDos() != null) && current.getPlayerTres() != null){
                System.out.print("[ " + current.getNum() + current.getPlayerUno().getGameToken() + current.getPlayerDos().getGameToken() + current.getPlayerTres().getGameToken() + " ]");
            } else if ((current.getPlayerUno() != null && current.getPlayerDos() != null)) {
                System.out.print("[ " + current.getNum() + current.getPlayerUno().getGameToken() + current.getPlayerDos().getGameToken() + " ]");
            } else if (current.getPlayerUno() != null && current.getPlayerTres() == null){
                System.out.print("[ " + current.getNum() + current.getPlayerUno().getGameToken() + current.getPlayerTres().getGameToken() + " ]");
            } else if (current.getPlayerDos() != null && current.getPlayerTres() == null) {
                System.out.print("[ " + current.getNum() + current.getPlayerDos().getGameToken() + current.getPlayerTres().getGameToken() + " ]");
            } else if (current.getPlayerUno() != null) {
                System.out.println("[ " + current.getNum() + current.getPlayerUno().getGameToken() + " ]");
            } else if (current.getPlayerDos() != null){
                System.out.println("[ " + current.getNum() + current.getPlayerDos().getGameToken() + " ]");
            } else if (current.getPlayerTres() != null) {
                System.out.println("[ " + current.getNum() + current.getPlayerTres().getGameToken() + " ]");
            }else {
                System.out.print("[ " + current.getNum() + " ]");
            }

        }
    }
    public void printBoardSL(int column){
        printBoardSL(tail, column);
    }

    public void printBoardSL(Square current,int column){
        if (head.getNext()==tail){
            System.out.println("[ " + head.getmessage() + " ]");;
        }
        if (current== null){
            return;
        }else if (column%2==0){
            if (current.getNum()%(column*2)==0){
                printInOrderSL(current , column);
                System.out.println();
            }
            else if(current.getNum()%column==0){
                printReverseSL(current , column);
                System.out.println();
            }
        }else {
            if (current.getNum() % column == 0) {
                if (current.getNum() % 2 == 0){
                    printInOrderSL(current , column);
                    System.out.println();
                }else {
                    printReverseSL(current , column);
                    System.out.println();
                }
            }
        }
        printBoardSL(current.getPrevius(),column);
    }


    public void printInOrderSL(Square current, int column){
        if (current==head||current.getPrevius().getNum()%column==0){

            System.out.print("[ " + current.getmessage() + " ]");

        }else{

            System.out.print("[ " + current.getmessage() + " ]");


            printInOrderSL(current.getPrevius(), column);

        }
    }

    public void printReverseSL(Square current, int column){
        if (current==head||current.getPrevius().getNum()%column==0){

            System.out.print("[ " + current.getmessage() + " ]");

        }else{
            printReverseSL(current.getPrevius(), column);


            System.out.print("[ " + current.getmessage() + " ]");


        }
    }




    public String chooseGameToken(int gameToken){
        String token= "";
        switch (gameToken){
            case 1:
                token= "*";
                break;
            case 2:
                token= "!";
                break;
            case 3:
                token= "O";
                break;
            case 4:
                token= "X";
                break;
            case 5:
                token= "%";
                break;
            case 6:
                token= "$";
                break;
            case 8:
                token= "#";
                break;
            case 9:
                token= "&";
                break;
        }
        return token;
    }

    public void createrPlayerUno(String name, String gameToken){
        Player playerUno= new Player(name, gameToken);
        head.setPlayerUno(playerUno);
    }


    public boolean createrPlayerDos(String name, String gameToken){
        if((head.getPlayerUno() != null && head.getPlayerUno().getGameToken().equals(gameToken))
                || (head.getPlayerTres() != null && head.getPlayerTres().getGameToken().equals(gameToken))){
            System.out.println("The game token already exists");
            return false;
        }
        Player playerDos= new Player(name, gameToken);
        head.setPlayerDos(playerDos);
        return true;
    }


    public boolean createrPlayerTres(String name, String gameToken){
        if((head.getPlayerDos() != null && head.getPlayerDos().getGameToken().equals(gameToken))
                || (head.getPlayerUno() != null && head.getPlayerUno().getGameToken().equals(gameToken))){
            System.out.println("The game token already exists");
            return false;
        }
        Player playerTres= new Player(name, gameToken);
        head.setPlayerTres(playerTres);
        return true;
    }


    public Player playerinturn(int value){
        if(value==1){ return head.getPlayerUno();}
        if(value==2){ return head.getPlayerDos();}
        if(value==3){ return head.getPlayerTres();}
        return null;
    }


    public Square searchSquare (int value){
        return searchSquare(value, head);
    }

    private Square searchSquare(int value, Square current){
        if (current ==tail&&current.getNum()!=value) return null;
        if (current.getNum()==value) return current;
        return searchSquare(value, current.getNext());
    }

    public boolean checkOverlap(int pos) {
        Square current = head;
        if(pos==1){ return true;}

        if (pos==row*column)return true;

        while (current != null) {
            if (current.getNum() == pos) {
                if (current.getSnakeend()!=null||current.getLadderend()!=null)
                { return true;}
            }
            current = current.getNext();
        }
        return false;
    }


    public void createSnakes(int numSnakes) {
        if (numSnakes == 0) {
            return;
        }

        int headPos = (int) (Math.random() * row*column) + 1;
        int tailPos = (int) (Math.random() * (headPos - 1)) + 1;


        if (checkOverlap(headPos) || checkOverlap(tailPos)) {
            createSnakes(numSnakes);
            return;
        }

        Square headNode = searchSquare(headPos);
        Square tailNode = searchSquare(tailPos);

        headNode.setSnakestart(headNode);
        headNode.setSnakeend(tailNode);
        headNode.setmessage(headNode.getmessage()+""+(char) (numSnakes + 64));

        tailNode.setSnakestart(headNode);
        tailNode.setSnakeend(tailNode);
        tailNode.setmessage(tailNode.getmessage()+""+(char) (numSnakes + 64));

        createSnakes(numSnakes - 1);
    }

    public void createLadders(int numLadders) {
        if (numLadders == 0) {
            return;
        }

        int headPos = (int) (Math.random() * row*column) + 1;
        int tailPos = (int) (Math.random() * (headPos - 1)) + 1;


        if (checkOverlap(headPos) || checkOverlap(tailPos)) {
            createLadders(numLadders);
            return;
        }

        Square headNode = searchSquare(headPos);
        Square tailNode = searchSquare(tailPos);

        headNode.setLadderstart(headNode);
        headNode.setLadderend(tailNode);
        headNode.setmessage(headNode.getmessage()+""+numLadders);

        tailNode.setLadderstart(headNode);
        tailNode.setLadderend(tailNode);
        tailNode.setmessage(tailNode.getmessage()+""+numLadders);

        createLadders(numLadders - 1);
    }



    public Square getHead() {
        return head;
    }

    public void setHead(Square head) {
        this.head = head;
    }

    public Square getTail() {
        return tail;
    }

    public void setTail(Square tail) {
        this.tail = tail;
    }

    public int getColumns() {
        return column;
    }

    public void setColumns(int column) {
        this.column= column;
    }

    public int getFilas() {
        return row;
    }

    public void setFilas(int row) {
        this.row = row;
    }

    public int getSnakes() {
        return snakes;
    }

    public void setSnakes(int snakes) {
        this.snakes = snakes;
    }

    public int getLadders() {
        return ladders;
    }

    public void setLadders(int ladders) {
        this.ladders = ladders;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


}

    

