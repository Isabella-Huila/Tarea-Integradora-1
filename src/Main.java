import java.util.Scanner;
public class Main {
    public static Scanner reader= new Scanner(System.in);
    public static Board board= new Board();
    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {

        System.out.println("Menu");

        boolean stopFlag = false;

        while (!stopFlag) {

            System.out.println();
            System.out.println("Type an option");
            System.out.println("1. Play");
            System.out.println("2. Exit");

            int mainOption = reader.nextInt();

            switch (mainOption) {

                case 1:
                    System.out.println("Ingrese el numero de filas");
                    int row= reader.nextInt();
                    System.out.println("Ingrese el numero de columnas");
                    int column= reader.nextInt();
                    board.addAtSqure(0 , row , column);
                    board.printBoard(column);
                    break;
                case 2:
                    System.out.println("Thanks for using our system");
                    stopFlag = true;
                    break;
                default:
                    System.out.println("You must type a valid option");
                    break;

            }

        }

    }
}