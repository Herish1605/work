import java.util.Scanner;
public class arrayasfunctionarguements {

    public static int harry(int a[]){
        for(int i=0; i<5; i++){
            System.out.println(a[i]);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[5];
        for(int i=0; i<5; i++){
            a[i]= sc.nextInt();
        }
       harry(a);
    }
}
