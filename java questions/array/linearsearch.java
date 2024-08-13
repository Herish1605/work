public class linearsearch {
    public static int linearsearch(int arr[], int key){
        for(int i=0 ; i<arr.length; i++){
            if (arr[i]==key) {
                System.out.println("the position of the key in the array is: "+ i);
            }
        }
 return 0;
    }
public static void main(String[] args) {
    int arr[]= {2, 4, 6, 8, 10, 12, 14, 16};
    int key = 10;
    linearsearch(arr, key);
}
}
