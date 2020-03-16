import java.util.Scanner;

public class heart{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int sp=0;
        int st=2*(n+2)+1;
        for(int i=1;i<=3*n-1;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                if((i==1&&(j==1||j==st/2||j==st/2+1||j==st/2+2||j==st))||i==2&&j==st/2+1){
                    System.out.print(" ");
                }
                else
            System.out.print("*");
            }
            System.out.print(st+" "+sp);
            if(i<=n/2+1){

            }
            // else if(n==1){

            // }
            else{
                st--;
                st--;
                sp++;
            }
            System.out.println();
        }
    }
}