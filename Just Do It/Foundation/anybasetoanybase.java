import java.util.Scanner;

public class anybasetoanybase{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int b1=scn.nextInt();
        int b2=scn.nextInt();
        int dm=getvalue(n, b1, b2);        
        System.out.println(dm);
    }
    public static int getvalue(int n,int b1,int b2) {
        int dec=anybasetodec(n,b1);
        int dn=dectoanybase(dec,b2);
        return dn;
    }
    public static int anybasetodec(int n,int b){
        int p=1,ans=0;
        while(n!=0){
            int temp=n%10;
            n=n/10;
            ans+=temp*p;
            p=p*b;
        }
        return ans;
    }
    public static int dectoanybase(int n,int b){
        int x=1,ans=0;
        while(n!=0){
            int temp = n%b;
            n=n/b;
             ans += temp*x;
            x=x*10;
            
        }
        return ans;
    }
}