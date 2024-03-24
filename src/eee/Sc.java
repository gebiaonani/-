package eee;

public class Sc extends Sa{
    public static void main(String aa[]){
        Sa a = new Sa();
        a.setXy(5,10);
        System.out.println("sa result:"+a.result());
        Sb s2 = new Sb();
        s2.x=3;
        s2.y=10;
        System.out.println("sb result:"+s2.result());
    }
}
