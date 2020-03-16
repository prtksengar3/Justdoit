import java.util.*;

public class heart1 {
public static void pattern(int n) {
        int lines, spaces;
        if(n%2 == 0) {
            lines = n/2;
            spaces = n-1;
        }
        else {
            lines = n/2+1;
            spaces = n;
        }
        for(int i=1;i<=lines;i++) {
            for(int j=1;j<=lines-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++) {
                System.out.print("*");
            }
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++) {
                System.out.print("*");
            }
            n +=2;
            spaces -=2;
            System.out.println();
        }
        n -= 2;
        n = n*2 + 1;
        spaces=0;
        while(n > 0) {
            for(int i=1;i<=spaces;i++) {
                System.out.print(" ");
            }
            for(int i=1;i<=n;i++) {
                System.out.print("*");
            }
            n -=2;
            spaces++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pattern(n);
    }
}