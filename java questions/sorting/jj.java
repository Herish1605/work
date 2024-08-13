import java.util.*;
public class jj {
  public static void sorrt(int arr[]){
    for(int j= 0;j<arr.length-1;j++){
        
        for(int i=0;i<arr.length-1;i++){
            
            if(arr[i]>arr[i+1]) {
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;
            }
               
            
        }
    }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]= {4,5,2,3,1,7,6,8,10,9,11,14,12,13};
        sorrt(a);
    }
}
