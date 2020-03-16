import java.util.*;
       
       public class hollowdiamond{
       
       public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
            int n=scn.nextInt();
            int irow=1;
            int nrows=n;
            int nstars=n/2+1;
            int nspaces=1;
            while(irow<=nrows){
                int istar=1;
                while(istar<=nstars){
                    System.out.print("*\t");
                    istar++;
                }
                int ispace=1;
                while(ispace<=nspaces){
                    System.out.print("\t");
                    ispace++;
                }
                istar=1;
                while(istar<=nstars){
                    System.out.print("*\t");
                    istar++;
                }
                System.out.println();
                if(irow<=nrows/2){
                    nspaces++;
                    nspaces++;
                    nstars--;
                }
                else{
                    nspaces--;
                    nspaces--;
                    nstars++;
                }
                irow++;
            }
            
        }
       }