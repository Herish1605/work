import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        int a[]= new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            a[i]= sc.nextInt();
        }
        int k;
        System.out.println("enter the number to be find: ");
        k = sc.nextInt();
        for(int j=0;j<5;j++){
            if(a[j]==k){
                System.out.println("the number is on the index:"+j);
            }
        }


    }
}
