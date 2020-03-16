import java.util.Scanner;

public class anybasemultiplication{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b=scn.nextInt();
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int d= getproduct(b,n1,n2);
        System.out.println(d);
        
    }
    public static int getproduct(int b,int n1,int n2){
        int rv=0;
        int p=1;
        while(n2>0){
            int d2=n2%10;
            n2=n2/10;
            int sprd = getonedigitproduct(b,n1,d2);
            rv= getSum(b, rv, sprd*p);
            p=p*10;
        }
        return rv;
    }
    public static int getonedigitproduct(int b,int n1,int d2){
        int c=0;
        int ans=0;
        int p=1;
        while(n1!=0||c!=0){
            int d1=n1%10;
            n1=n1/10;
            // n2=n2/10;
            int d=d1*d2+c;
            c=d/b;
            d=d%b;
            ans = ans+d*p;
            p=p*10;
        }
        return ans;
    }
    public static int getSum(int b, int n1, int n2) {
        int carry = 0;
        int result = 0;
        int mul = 1;
        
        while (n1 != 0 || n2 != 0 || carry != 0) {
            int d1=n1%10;
            int d2=n2%10;
            int D = d1 + d2 + carry;
            if(D>=b){
                D=D%b;
                carry=1;
            }
            else{
                carry=0;
            }
            // carry=D/b;
            // D=D%b;
            
            
            result = result+(D*mul);
            mul=mul*10;
            n1=n1/10;
            n2=n2/10;
            
        }
        return result;
    }
}