import java.util.*;
public class insertionsort {
    public static void insert(int ar[]){
        for(int i=1;i<ar.length;i++){
            int current = ar[i] ;
            int previous = i-1;  
            // finding out the correct position to insert
            while (previous>= 0  && ar[previous]>current) {
                ar[previous+1] = ar[previous];
                previous-- ;
            }
            //insertion
            ar[previous+1]= current; 
        }
        for(int k=0;k<ar.length;k++){
            System.out.print (ar[k]+ " ");
        }
    }

    public static void main(String[] args) {
        int ar[]= {9,8,7,6,5,4,3,2,1};
        insert(ar);
    }
}
