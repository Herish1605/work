import java.util.*;
public class ss {
   

    public static int harrry(int arr[]){
        int temp1 = 0;
        int temp2 = 0;
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                temp1 = arr[i];
                arr[i]=arr[i+1];  
               
             }
         
        }
        for(int j=1;j<arr.length;j++){
            if(arr[j]<arr[j-1]){
                temp2 = arr[j];
                arr[j]=temp1;
               
            }
           
        }
        for(int l=0;l<arr.length-1;l++){
           if (arr[l]==arr[l+1]) {
            arr[l+1]= temp1;
           }
        }

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+ " ");
        }
    return 0;
    }
        public static void main(String[] args) {
            int arr[]= {3,5,7,6,8,9};
            harrry(arr);
        
    }
}


