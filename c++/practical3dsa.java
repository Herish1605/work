import java.util.Scanner;
public class practical3dsa {
    public static void main(String[] args) {
        int arr[]= new int[5];
        Scanner sc = new Scanner(System.in);
        for(int j=0; j<=5; j++){
           arr[j] = sc.nextInt();
        }

        int x;

        for(int i=0; i<=5; i++){
            if(arr[i]>arr[i+1]){
                x = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = x;
            }
        }
        for(int n=0; n<=5; n++){
            System.out.println(arr[n]);
        }

        
    }
}
