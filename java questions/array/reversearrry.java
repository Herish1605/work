public class reversearrry {
    public static void harry(int arr[]){
        int first = 0; 
        int last = arr.length-1;
        while(first<last){
            int temp = arr[last];
             last = arr[first];
             arr[first]= arr[last];
             first ++;
             last--; 
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        harry(arr); 
        for(int i = 0 ; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
