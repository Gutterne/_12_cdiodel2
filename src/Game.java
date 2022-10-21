import java.util.Scanner;
public class Game {
    Holder holder;

    Wallet wallet;
    Player player1,player2;
    Square square;

    Scanner scanner = new Scanner(System.in);


   // Board board;

    boolean playing = true;

    public Game(){
        holder = new Holder();

        player1 = new Player();
        player2 = new Player();


        wallet = new Wallet();

        square = new Square();


        //board = new Board;

    }

    public void play() {

        while(playing){

        //Player 1
            ////////////////////////////// TESTING


        updateFlow();
            //System.out.println(wallet.SQpoints[8]);
            ////////////////////////////////////
        //Player 2

        updateFlow2();

        }

        }
    public void updateFlow(){
        System.out.println("Spiller 1 kast med terningerne");
        System.out.println("Tryk på enter spiller 1");
        String p1 = scanner.nextLine();
        holder.sum();
        System.out.println("Spiller 1 du slog " + holder.getSum() + " og landet på "+ square.location[holder.getSum()] + " Denne Square Værdi gav : " + square.points[holder.getSum()]);
        player1.myWallet.setSquareMoney(square.points[holder.getSum()]);
        kommentar();
        System.out.println("player 1 har nu "+player1.myWallet.UpdateMoney());
    }

    public void updateFlow2(){

        System.out.println("Spiller 2 kast med terningerne");
        System.out.println("Tryk på enter spiller 2");
        String p2 = scanner.nextLine();
        System.out.println();
        holder.sum();
        System.out.println("Spiller 2 du slog " + holder.getSum() + " og landet på "+ square.location[holder.getSum()] + " Denne Square Værdi gav : " + square.points[holder.getSum()]);
        player2.myWallet.setSquareMoney(square.points[holder.getSum()]);
        kommentar();
        System.out.println("player 2 har nu "+player2.myWallet.UpdateMoney());

    }
    public void kommentar(){
        if(square.points[holder.getSum()]<0){

            System.out.println("minus");
        } else if(square.points[holder.getSum()]>0){

            System.out.println("plus");
        }
    }
}




