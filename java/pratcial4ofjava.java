import java.util.*;
import java.util.Scanner;
public class pratcial4ofjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year:");

        int yy = sc.nextInt();
        
        System.out.println("Enter the month:");

        int mm = sc.nextInt();

        int d =1;
        int m =1;
        int y =1;
        int dy =1;

        String day[] = { "SUN    ", "MON   ", "TUE   ", "WED   ", 
						"THU   ", "FRI    ", "SAT    " }; 

        String month[]  = { "JANUARY", "FEBRUARY", "MARCH", 
                            "APRIL", "MAY",	 "JUNE", 
                            "JULY", "AUGUST", "SEPTEMBER", 
                            "OCTOBER", "NOVEMBER", "DECEMBER" };    
                           
                           
         int ar[] = { 31, 29, 31, 30, 31, 30, 
                                31, 31, 30, 31, 30, 31 }; 
                        

    }
}
