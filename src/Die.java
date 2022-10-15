public class Die {
    private final int MaxSides=6;
    private int facevalue;

    public Die(){
        facevalue=6; // the state of the object before any action.
    }

    public int  roll(){
        facevalue=(int)(Math.random()*MaxSides+1);
        return facevalue;
    }



}
