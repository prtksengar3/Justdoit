import java.util.*;

public class diamond {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nrows=n;
        int irow =1;
        int nstars=1;
        int nspaces=n/2;
        while(irow<=nrows){
            int ispace=1;
            while(ispace<=nspaces){
                System.out.print("\t");
                ispace++;
            }
            int istar=1;
            while(istar<=nstars){
            System.out.print("*\t");    
            istar++;
            }
            System.out.println();
            if(irow<=nrows/2){
                nspaces--;
                nstars++;
                nstars++;
            }
            else{
                nspaces++;
                nstars--;
                nstars--;
            }
            irow++;
        }
        


    }
}