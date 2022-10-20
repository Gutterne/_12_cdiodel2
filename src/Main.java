public class Main {
    public static void main(String[] args) {


    Square square = new Square();
    Game game=new Game();
    game.play();
    Wallet wallet = new Wallet();



        //System.out.println((square.location[8]));
        System.out.println(square.location[8] + square.points[8]);

        System.out.println(wallet.SQpoints[8]);

        System.out.println(wallet.GetMoney());
    }

}