import java.util.Scanner;

public class pattern6{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int st=n/2+1;
        int sp=1;
        for(int i=1;i<=n;i++){
            // System.out.print(st+" "+sp);
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }

            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
           
            if(i<n/2+1){
                sp+=2;
                st--;
            }
            else{
                sp-=2;
                st++;
            }
            System.out.println();
        }
    }
}