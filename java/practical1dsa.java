import java.util.Scanner;
public class practical1dsa {
    public static void main(String[] args) {
        
    
    int arr[]= new int[5];
    System.out.print("enter the numbers:");
    Scanner sc = new Scanner(System.in);

    for(int i=0; i<=4;i++ ){
         arr[i] = sc.nextInt();
    }

    int k; 
    System.out.println("enter the digit you want to divide with: ");

    k = sc.nextInt();
    System.out.println("The pairs that are divisible by giikjhijuhyjkjiuhjjjjjjjjjven numnber is: ");
    for(int m=0;m<=4;m++){
        for(int n=0; n<=4; n++){
            if(m!=n){
                if((arr[m]+arr[n])%k==0){
                   System.out.print("("+arr[m]+","+arr[n]+") ");
                }
            }
        }
    }

    }

}
