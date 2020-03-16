import java.util.Scanner;

public class pythogoreantriplet1{
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
        boolean result=false;
        result=result||(a*a)+(b*b)==c*c||(c*c)+(b*b)==a*a||(a*a)+(c*c)==b*b;
        System.out.println(result);
    }
}