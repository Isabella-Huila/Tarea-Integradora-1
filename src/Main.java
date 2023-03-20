import java.util.Scanner ;
public class Main {

    public static Scanner reader= new Scanner(System.in);
    public static Board board= new Board();

    public static int column=0;

    public static int veces=0;

    public static int turn=0;

    public static TopScore topScore = new TopScore();
    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {

        System.out.println("Menu");

        boolean stopFlag = false;

        while (!stopFlag) {

            System.out.println();
            System.out.println("Type an option");
            System.out.println("1. Play a new game");
            System.out.println("2. Exit");

            int mainOption = reader.nextInt();

            switch (mainOption) {

                case 1:
                    veces++;

                    if (veces==1){
                        System.out.println("Enter the number of rows");
                        int row= reader.nextInt();
                        System.out.println("Enter the number of columns");
                        column= reader.nextInt();
                        board.addAtSqure(0 , row , column);
                        board.printBoard(column);

                        System.out.println("Enter the number of Snakes");
                        int snakes = reader.nextInt();
                        System.out.println(" Enter the number of Ladders");
                        int ladders = reader.nextInt();

                        board.createSnakes(snakes);
                        board.createLadders(ladders);

                        registerPlayers();

                    }else {
                        board.restoreGame();
                    }
                    board.printBoard(column);
                    MenuGame();

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

    public static void MenuGame() {

        System.out.println("Game Menu");
        long startTime= System.currentTimeMillis();
        boolean stopFlag = false;
        turn=0;


        while (!stopFlag) {

            System.out.println();
            System.out.println("Type an option");
            System.out.println("1. Roll the Dice");
            System.out.println("2. See Snakes and ladders");

            int mainOption = reader.nextInt();

            switch (mainOption) {

                case 1:
                    System.out.println("Player ["+board.playerinturn(turn).getGameToken()+"]'s turn");

                    if (board.throwDice(turn)){
                        stopFlag= true;
                        break;
                    }
                    board.checkPlayer(board.playerinturn(turn));
                    board.printBoard(column);
                    turn++;
                    if(turn==3){turn=0;}
                    break;
                case 2:
                    board.printBoardSL(board.getColumns());
                    break;
                default:
                    System.out.println("You must type a valid option");
                    break;

            }

        }

        long finalTime = System.currentTimeMillis();
        calcultaScore(startTime , finalTime);

        System.out.println("TOP");
        topScore.top();
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


        boolean created= true;
        do {
            System.out.println("Choose the token you are going to play with:\n 1. * \n 2. ! \n 3. O \n 4. X \n 5. % \n 6. $ \n 7. # \n 8. + \n 9. &");
            int gameTokenDos= reader.nextInt();
            created= board.createrPlayerDos(nameDos, board.chooseGameToken(gameTokenDos));
        }while (created == false);


        System.out.println("Player three register");
        System.out.println("Enter the name");
        reader.nextLine();
        String nameTres= reader.nextLine();


        do {
            System.out.println("Choose the token you are going to play with:\n 1. * \n 2. ! \n 3. O \n 4. X \n 5. % \n 6. $ \n 7. # \n 8. + \n 9. &");
            int gameTokenTres= reader.nextInt();


            created= board.createrPlayerTres(nameTres, board.chooseGameToken(gameTokenTres));
        }while (created == false);

    }

    public static void calcultaScore(long starTime, long finalTime){
        long totalTime = finalTime - starTime;
        long  score = (long) ((600000 - totalTime) / 600.0);

        if (board.getTail().getPlayerTres() != null){
            board.getTail().getPlayerTres().setScore(score);
            topScore.addScoreRegister(board.getTail().getPlayerTres());
        } else if (board.getTail().getPlayerDos() != null) {
            board.getTail().getPlayerDos().setScore(score);
            topScore.addScoreRegister(board.getTail().getPlayerDos());
        } else if (board.getTail().getPlayerUno() != null) {
            board.getTail().getPlayerUno().setScore(score);
            topScore.addScoreRegister(board.getTail().getPlayerUno());
        }

        System.out.println("your score is: " + score);
    }

}