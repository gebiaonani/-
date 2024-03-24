public class Main {
    public static void main(String[] args) {
        int i=100;
        int a,b,c;
        for(;i<1000;i++){
            a=i%10;
            b=i/10%10;
            c=i/100;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println("水仙花数为："+i);
            }
        }
    }
}