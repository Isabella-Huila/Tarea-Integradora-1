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
                    System.out.println("Enter the numbert of rows");
                    int row= reader.nextInt();
                    System.out.println("Enter the numbert of columns");
                    int column= reader.nextInt();
                    board.addAtSqure(0 , row , column);
                    board.printBoard(column);

                    registerPlayers();
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

    public static void registerPlayers(){
        System.out.println("Player one register");
        System.out.println("Enter the name");
        reader.nextLine();
        String nameUno= reader.nextLine();

        System.out.println("Choose the token you are going to play with:\n 1. * \n 2. ! \n 3. O \n 4. X \n 5. % \n 6. $ \n 7. # \n 8. + \n 9. &");
        int gameTokenUno= reader.nextInt();

        board.createrPlayerUno(nameUno, board.chooseGameToken(gameTokenUno));


        System.out.println("Player two register");
        System.out.println("Enter the name");
        reader.nextLine();
        String nameDos= reader.nextLine();

        System.out.println("Choose the token you are going to play with:\n 1. * \n 2. ! \n 3. O \n 4. X \n 5. % \n 6. $ \n 7. # \n 8. + \n 9. &");
        int gameTokenDos= reader.nextInt();

        board.createrPlayerDos(nameDos, board.chooseGameToken(gameTokenDos));

        System.out.println("Player three register");
        System.out.println("Enter the name");
        reader.nextLine();
        String nameTres= reader.nextLine();

        System.out.println("Choose the token you are going to play with:\n 1. * \n 2. ! \n 3. O \n 4. X \n 5. % \n 6. $ \n 7. # \n 8. + \n 9. &");
        int gameTokenTres= reader.nextInt();

        board.createrPlayerTres(nameTres, board.chooseGameToken(gameTokenTres));
    }
}