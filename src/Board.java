public class Board {
    private int row;
    private int column;
    private Square head;
    private Square tail;
    private static int n=0;

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
        /*if((head.getPlayerDos() != null && head.getPlayerDos().getGameToken().equals(gameToken))
                || (head.getPlayerTres() != null && head.getPlayerTres().getGameToken().equals(gameToken))){
            System.out.println("The game token already exists");
            createrPlayerUno(name , gameToken);
        }*/
        Player playerUno= new Player(name, gameToken);
        head.setPlayerUno(playerUno);
    }

    public void createrPlayerDos(String name, String gameToken){
        /*
        if((head.getPlayerUno() != null && head.getPlayerUno().getGameToken().equals(gameToken))
                || (head.getPlayerTres() != null && head.getPlayerTres().getGameToken().equals(gameToken))){
            System.out.println("The game token already exists");
            createrPlayerDos(name, gameToken);
        }*/
        Player playerDos= new Player(name, gameToken);
        head.setPlayerDos(playerDos);
    }

    public void createrPlayerTres(String name, String gameToken){
        /*
        if((head.getPlayerDos() != null && head.getPlayerDos().getGameToken().equals(gameToken))
                || (head.getPlayerUno() != null && head.getPlayerUno().getGameToken().equals(gameToken))){
            System.out.println("The game token already exists");
            createrPlayerTres(name, gameToken);
        }*/
        Player playerTres= new Player(name, gameToken);
        head.setPlayerTres(playerTres);
    }
}
