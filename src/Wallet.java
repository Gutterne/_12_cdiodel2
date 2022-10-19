public class Wallet {
    private int money = 1000;
    Square square = new Square();
    private String monetos = "";
    private int squareMoney;
    int[] SQpoints = square.points;

    public Wallet() {
    this.money = money;


    }
    public int GetMoney() {
        //1000 + 60 for testing = 1060 ;D
        int squareMoney = money + SQpoints[9];
        return squareMoney;
    }
}
