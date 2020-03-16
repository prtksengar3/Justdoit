import java.util.*;
public class diffofarr{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int [] arr1=new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=scn.nextInt();
        }
        int m= scn.nextInt();
        int [] arr2=new int[m];
        for(int j=0;j<arr2.length;j++){
            arr2[j]=scn.nextInt();
        }
        int [] diff= new int [m];
        int c=0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k= diff.length-1;
        while(k>=0){
            int d=0;
            // System.out.println(j+" "+ i);
            int alv=i>=0?arr1[i]:0;
            if(arr2[j]+c>=alv){
                d=arr2[j]+c-alv;
                c=0;
            }
            else{
                d=arr2[j]+c+10-alv;
                c=-1;
            }
            d=d%10;
            diff[k]=d;
            i--;
            j--;
            k--;
        }
        int idx=0;
        while(idx<diff.length){
            if(diff[idx]==0){
                idx++;
            }
            else{
                break;
            }
        }
        while(idx<diff.length){
            System.out.println(diff[idx]);
            idx++;
        }
    }
}