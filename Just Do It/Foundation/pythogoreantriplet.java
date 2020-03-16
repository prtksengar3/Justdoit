import java.util.Scanner;

public class pythogoreantriplet{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        if(max==a){
            boolean ans = (c*c)+(b*b)==a*a;
            System.out.println(ans);
        }
        else if(max==b){
            boolean ans = (c*c)+(a*a)==b*b;
            System.out.println(ans);
        }
        else{
            boolean ans = (a*a)+(b*b)==c*c;
            System.out.println(ans);
        }
        // System.out.println(max);
    }
}