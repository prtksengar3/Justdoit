import java.util.*;
public class q1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int b1=scn.nextInt();
        int b2=scn.nextInt();
         int c=dec(b1, n);
        int d=nondec(b2, c);
        System.out.println(d);

    }
    public static int dec(int b1,int n){
        int p=1;
        int ans=0;
        while(n!=0){
            int d= n%10;
            ans=ans+d*p;
            p=p*b1;
            n=n/10;
        }
        return ans;
    }
    public static int nondec(int b2,int n){
        int p=1;
        int ans=0;
        int temp=0;
        // int d=0;
        while(n!=0){
           int d=n%b2;
            temp=temp+d*p;
            p=p*10;
            n=n/b2;
        }
        return temp;
    }
}