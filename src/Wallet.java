public class Wallet {
    private int money = 1000;
    Square square = new Square();
    private String monetos = "";
    private int squareMoney;
    int[] SQpoints = square.points;

    public Wallet() {
    this.money = money;




    }
    public void GetMoney() {
        //System.out.println(money);
    }

    public String toString(int cash) {
        cash =SQpoints[7];
        cash += money;

        return cash + monetos;
    }


}
