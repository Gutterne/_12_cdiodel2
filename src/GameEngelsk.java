
/*
import java.util.Scanner;





/*        Der står i opgaveformuleringen at " Spillet skal let kunne oversættes til andre sprog. "
        Dette betyder at outputtet skal let kunne oversættes til et andet sprog, derfor laver vi en game, oversat til
         engelsk, så man let kan koble til et andet sprog.
  */


 /*
public class GameEngelsk {
    Holder holder;

    int randomNum;
    Wallet wallet;
    Player player1, player2;
    Square square;

    Scanner scanner = new Scanner(System.in);


    boolean playing = true;

    public GameEngelsk() {
        holder = new Holder();

        player1 = new Player();
        player2 = new Player();


        wallet = new Wallet();

        square = new Square();


        //board = new Board;

    }

    public void play() {

        while (playing) {

            updateFlow();
            while (holder.getSum() == 10) {
                System.out.println("You got an extra turn!");
                updateFlow();

            }
            if (player1.myWallet.getMoney() >= 3000) {
                playing = false;
                System.out.println("Player 1 has won!");
                break;
            }

            updateFlow2();
            while (holder.getSum() == 10) {
                System.out.println("You get an extra turn");
                updateFlow2();

            }
            if (player2.myWallet.getMoney() >= 3000) {
                playing = false;
                System.out.println("Player 2 has won");
                break;
            }
        }

    }






    //player 1 in loop
    public void updateFlow(){
        System.out.println("Click enter to play, player 1");
        String p1 = scanner.nextLine();
        holder.sum();
        System.out.println("Player 1 you got " + holder.getSum() + " and landed on "+ square.location[holder.getSum()] + " This Square gave : " + square.points[holder.getSum()]);
        player1.myWallet.setSquareMoney(square.points[holder.getSum()]);
        Comment();
        System.out.println(" player 1 has "+player1.myWallet.UpdateMoney()+" ");
    }

    //player 2 in loop
    public void updateFlow2(){
        System.out.println("Click enter to play, player 2");
        String p2 = scanner.nextLine();
        System.out.println();
        holder.sum();
        System.out.println("Player 2 you got " + holder.getSum() + " and landed on "+ square.location[holder.getSum()] + " This Square gave : " + square.points[holder.getSum()]);
        player2.myWallet.setSquareMoney(square.points[holder.getSum()]);
        Comment();
        System.out.println(" player 2 has "+player2.myWallet.UpdateMoney()+" ");

    }
    //update number reference
    public void updateNum(){
        randomNum = (int)(Math.random() * 6); //random nummer
    }

    //comments from negative and positive array reference
    public void Comment(){
        if(square.points[holder.getSum()]>=0){
            System.out.print(square.positiveComments[randomNum]);
        } else if(square.points[holder.getSum()]<0){
            System.out.print(square.negativeComments[randomNum]);
        }
    }
    //TODO check for winner at 3000 money
    //TODO Check for ekstra roll at die roll 10
}


*/


