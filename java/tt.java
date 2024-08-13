import java.util.*;
public class tt {
    public static void vichitra(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0; j<arr.length-1; j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for(int j=1;j<arr.length-1;j+=2){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int n =sc.nextInt();
        System.out.println("Enter the size of array: ");
        int m = sc.nextInt();
        int arr[]= new arr[n];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){

            }
        }
        vichitra(arr);
    }

}