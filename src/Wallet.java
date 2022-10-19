public class Wallet {


    private int money = 1000;
    Square square = new Square();
    private int squareMoney;
    int[] SQpoints = square.points;

    public Wallet() {
    this.money = money;

    }
    public void setSquareMoney(int SquareMoney) {
        squareMoney = SquareMoney;
    }

    public int GetMoney() {
        //1000 + 60 for testing = 1060 ;D
        int squareMoney = money + SQpoints[9];
        return squareMoney;
    }
    public int DecreasMoney() {
        if (squareMoney > money) {
            money = 0;}
                else {
                    money = money - squareMoney;
                }
    return squareMoney;
    }

    }



