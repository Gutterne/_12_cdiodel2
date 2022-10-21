import java.util.Scanner;
public class Game {
    Holder holder;
    Wallet wallet;
    Player player;
    Square square;

    Scanner scanner = new Scanner(System.in);

    boolean playing = true;
    public Game(){
        holder = new Holder();
        wallet = new Wallet();
        player = new Player();
        square = new Square();

    }

    public void play() {

        while(playing){

        //Player 1
            ////////////////////////////// TESTING

        holder.sum();
        updateFlow();
            //System.out.println(wallet.SQpoints[8]);
            ////////////////////////////////////
        //Player 2
        holder.sum();
        updateFlow2();

        }

        }
    public void updateFlow(){
        System.out.println("Spiller 1 kast med terningerne");
        System.out.println("Tryk på enter spiller 1");
        String p1 = scanner.nextLine();
        System.out.println("Spiller 1 du slog " + holder.getSum() + " og landet på "+ square.location[holder.getSum()] + " Denne Square Værdi gav : " + square.points[holder.getSum()]);

    }

    public void updateFlow2(){

        System.out.println("Spiller 2 kast med terningerne");
        System.out.println("Tryk på enter spiller 2");
        String p2 = scanner.nextLine();
        System.out.println("Spiller 2 du slog " + holder.getSum() + " og landet på "+ square.location[holder.getSum()] + " Denne Square Værdi gav : " + square.points[holder.getSum()]);
    }

}




