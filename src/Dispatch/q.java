package Dispatch;

//class A{
//    void callme( ) {
//        System.out.println("Inside A's callme()method");
//    }
//}
//class B extends A{
//    void callme( ) {
//        System.out.println("Inside B's callme() Method");
//    }
//}
//public class q {
//    public static void main(String args[]) {
//        A a=new B();
//        a.callme( );
//    }
//}

class AA{
    double x=1.1;
    double method(){
        return x;
    }
}
class BB extends AA{
    double x=2.2;
    double method(){
        return x;
    }
}

public class q{

    public static void main(String args[]) {
      AA a = new BB();
      System.out.println(a.x);
    }

}
