import java.util.*;
public class q2{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int sp=2*n-3;
        int st=1;
        for(int i=1;i<=n;i++){
            int val=1;
            for(int j=1;j<=st;j++){
                System.out.print(val++ +"\t");
            }
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            if(i==n){
                st--;
                val--;
                }
                val--;
            for(int j=1;j<=st;j++){
                System.out.print(val-- + "\t");
                
            }
            sp-=2;
            st++;
            System.out.println();
        }
    }
}