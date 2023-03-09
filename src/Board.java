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
            System.out.print("[ " + current.getNum() + " ]");
        }else{
            System.out.print("[ " + current.getNum() + " ]") ;
            printInOrder(current.getPrevius(), column);

        }

    }

    public void printReverse(Square current, int column){
        if (current==head||current.getPrevius().getNum()%column==0){
            System.out.print("[ " + current.getNum() + " ]");
        }else{

            printReverse(current.getPrevius(), column);
            System.out.print("[ " + current.getNum() + " ]");

        }
    }

}
