import java.util.Scanner;

public class yu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入玩游戏的总人数：");
        int n = sc.nextInt();
        System.out.println("请输入报数的起始位置：");
        int m = sc.nextInt();
        System.out.println("请输入每次报数人数：");
        int k = sc.nextInt();
        int renshu[]=new int[n];
        int i = m-1;

        for(;i<n;i+=k) {
            if (renshu[i] == 0) {
                System.out.println("第" + (i + 1) + "个人退出");
                renshu[i] = 1;
            }else{
                i=i+1;
            }
            if((i+k)>=n){
                i=(i+1+k)%n-k;
            }
        }
    }
}
