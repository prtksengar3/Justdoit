import java.util.Scanner;
public class gcdlcm{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int on=n;
        int om=m;
        while(n%m!=0){
            int rem = n%m;
            n=m;
            m=rem;

        }
        int gcd=m;
        System.out.println(gcd);
        int lcm = (om*on)/m;
        System.out.println(lcm);
    }
}