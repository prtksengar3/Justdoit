import java.util.*;
public class rotateanarr{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        k=k%n;
        if(k<0){
            k=k+n;
        }
        reverse(arr,0,arr.length-1-k);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-1);
        for(int val:arr){
            System.out.print(val+" ");
        }

    }
    public static void reverse(int arr[],int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}