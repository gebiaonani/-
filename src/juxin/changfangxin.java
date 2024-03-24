package juxin;

public class changfangxin extends juxin{
    double gao;
    double mianji;
    changfangxin(double a,double b,double gao){
        super(a,b);
        this.gao=gao;
    }
    double tiji(){
        return mianji()*gao;
    }
}
