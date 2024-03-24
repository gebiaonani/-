package eee;

public class Sb extends Sa{
    int x;
    public int result(){
        super.x=5;
        x=super.result()/5;
        return x;
    }
}
