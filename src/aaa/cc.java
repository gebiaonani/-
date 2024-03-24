package aaa;

//class AA{
//    public AA(){
//        System.out.println("AA");
//    }
//    public AA(int i){
//        this();
//        System.out.println("AAAA");
//    }
//    public static void main(String args[]){
//        BB b=new BB(10);
//    }
//}
//class BB extends AA{
//    public BB(){
//        super();
//        System.out.println("BB");
//    }
//    public BB(int i){
//        super(i);
//        System.out.println("BBBB");
//    }
//}
abstract class a1{
    abstract int add(int x,int y,int z);
}
interface a2 {
    int add(int x,int y);
}
class PacDemo extends a1 implements a2 {
    public int add(int x,int y,int z) {
        int sum;sum=x+y+z;
        return sum;
    }
    public int add(int x,int y) {
        int sum;sum=x+y+1000;
        return sum;
    }
    public static void main(String args[]) {
        PacDemo calc=new PacDemo();
        int sum=calc.add(10,20);
        System.out.println("the addition is:"+sum);
        int sum2=calc.add(10,20,30);
        System.out.println("the addition is:"+sum2);
    }
}
