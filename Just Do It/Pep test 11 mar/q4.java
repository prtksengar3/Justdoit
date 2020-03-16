import java.util.*;
public class q4{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int inv=0;
        int op=1;
        int num=1;
        while(n!=0){
            int d=n%10;
            inv=inv+num*(int)Math.pow(10,d-1);
            n=n/10;
            num++;
        }
        System.out.println(inv);

    }
}