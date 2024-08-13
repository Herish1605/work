import java.util.*;
public class bubblesort {

    public static int sortt(int arr[]){
        int temp =0;
        for(int i=0;i<=arr.length;i++){
            if(arr[i]>arr[i+1]) {
                temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;
            }
            // else{
            //     arr[i]=arr[i];
            // }
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]= {2,3,4,5,1,7,6};
        sortt(arr);
    }
}
