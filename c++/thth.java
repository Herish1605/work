import java.util.Scanner;

public class thth {
    public static void main(String[] args) {
        int a[]= new int[5];

        System.out.println("enter the numbers: ");
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<5;i++){
            a[i]= sc.nextInt();
        }
        int t;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(a[i]<a[j]){
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
         }
        
         System.out.println("enter the number who's position you want to find:");
         int k = sc.nextInt();
         int n=5;
         int o=0;
         int r= n-1;
         while (o<=r) {
           int  m = (o+r)/2;
            if (a[m]<k) {
                o = m + 1;   
            }
            else if (a[m]>k) {
                r= m-1;
            }
            else{
                System.out.println("the position of the number is:"+m); 
                break;
            }
         }
    
    }
    

}
