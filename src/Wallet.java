public class Wallet {
    private int money=1000;
    private int SquareMoney;

    public Wallet(int FromSquare){
        SquareMoney=FromSquare;
    }

    public int getSquareMoney() {
        return SquareMoney;
    }

    public void setSquareMoney(int squareMoney) {
        SquareMoney = squareMoney;
    }
    public int IncreaseMoney(){
        money = money + SquareMoney;
        return money;
    }
    public int DecreaseMoney(){
        if ( SquareMoney > money) {
            money = 0;}
        else {
            money = money - SquareMoney;
        }
        return money;
    }
}