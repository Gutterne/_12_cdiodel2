public class Die {

    private final int MaxSides=6;
    private int facevalue;

    public Die(){
        facevalue=6; // the state of the object before any action.
    }

    public int getFacevalue() {
        return facevalue;
    }

    public void setFacevalue(int facevalue) {
        this.facevalue = facevalue;
    }

    public int  roll(){
        facevalue=(int)(Math.random()*MaxSides+1);
        return facevalue;
    }



*/
int die
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
/*
}
