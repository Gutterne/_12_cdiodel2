public class Wallet {
    private int money=1000;
    private int SquareMoney;


    public Wallet(){

    }

    public int getSquareMoney() {
        return SquareMoney;
    }

    public void setSquareMoney(int squareMoney) {
        SquareMoney = squareMoney;
    }


    public int UpdateMoney(){
        if ( 0 >SquareMoney && -SquareMoney> money) {
            money = 0;}
        else {
            money = money + SquareMoney;
        }
        return money;
    }

}