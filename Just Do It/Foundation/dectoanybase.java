import java.util.Scanner;

public class dectoanybase{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int x=1,ans=0;
        while(a!=0){
            int temp = a%b;
            a=a/b;
             ans += temp*x;
            x=x*10;
            
        }
        System.out.println(ans);
    }
}