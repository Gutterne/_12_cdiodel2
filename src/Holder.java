public class Holder {
    private int sum;



    Die die1,die2;
    public Holder() {
        die1=new Die();
        die2= new Die();
    }
    public int  sum(){
        sum = die1.roll()+die2.roll();
        return sum;

    }
    public int getSum() {
        return sum;
    }

    public String toString() {
        String result = Integer.toString(sum);
        return result;
    }
}
