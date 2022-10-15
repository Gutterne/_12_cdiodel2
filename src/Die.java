public class Die {
int die;
int sum;
public Die(int sum){
    this.sum = sum;
}
public void raffleCup(int dieSum){
    sum = dieSum;
    int size =6 ;
    int die1 = (int) (Math.random()*size+1);
    int die2 = (int) (Math.random()*size+1);
    sum= die1 + die2;
    }
}
