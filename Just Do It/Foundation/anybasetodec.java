import java.util.Scanner;

public class anybasetodec{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int p=1,ans=0;
        while(a!=0){
            int temp=a%10;
            a=a/10;
            ans+=temp*p;
            p=p*b;
        }
        System.out.println(ans);
    }
}