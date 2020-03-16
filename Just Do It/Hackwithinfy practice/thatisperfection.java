// import java.util.*;
// public class thatisperfection{
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int t=scn.nextInt();
//         for(int a=1;a<=t;a++){
//             int n=scn.nextInt();
//             int ans=0;
//             for(int i=1;i<n;i++){
//                 if(n%i==0){
//                     ans=ans+i;
//                 }
//             }
//             System.out.println(ans);
//             if(ans==n){
//                 System.out.println("Yes");
//             }
//             else{
//                 System.out.println("No");
//             }
//         }
//     }
// }
import java.io.*;
import java.util.*;


public class thatisperfection {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++) {
            int n = Integer.parseInt(br.readLine().trim());

            String out_ = Solve(n);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static String Solve(int n){
        // Write your code here
        int ans=0;
            for(int i=1;i<=n/2;i++){
                if(n%i==0){
                    ans=ans+i;
                }
            }
            // System.out.println(ans);
            if(ans==n){
                return ("YES");
            }
            else{
                return ("NO");
            }
    }
}