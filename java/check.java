import java.util.Scanner;
public class check{
public static void main(String args[]){

System.out.println("Enter your mobile number");
  Scanner sc = new Scanner(System.in){
    int x= sc.nextInt();
    
    
    int w= x%100000000;
    int y= (x%100000)-(w*1000);
    int z= x-(x%10000)*(1000);
    
    System.out.println("Your system operator code is:"+w);
    System.out.println("Your MSC code is:"+y);
    System.out.println("Your unique subscriber code is:"+z);
}

}
}