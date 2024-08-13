import java.util.*; 
public class reverseanarray {
    public static int reverse(int arr[]){
        int first = 0;
        int last = arr.length-1;
        int mid = (first + last)/2; 
       
        while (first<last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first ++;
            last --;
        }
        System.out.println(arr);
       
    return arr; 
    }
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10,12};
        reverse(arr);
         for(int j=0 ; j<arr.length; j++){
             System.out.println(arr[j]);
         }

    }
}
