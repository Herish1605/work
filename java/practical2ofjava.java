import java.util.Scanner;
public class practical2ofjava {
public static void main(String[] args) {
    System.out.print("enter your mobile number:+91 ");
   
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y =  (x%100000);
    int z =  ((x%100000000) - y)/ 100000;
    int w =  (x/100000000); 
    
    System.out.println("Mobile system operator code is:"+ w);
    
    System.out.println("MSC is:"+ z);
    
    System.out.println("Unique code is: "+ y);

}

}
