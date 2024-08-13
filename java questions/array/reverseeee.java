public class reverseeee {
    public static void harry(int arr[]){
        int first = 0; 
        int last = arr.length-1;
        int a=0;
        while(first<last){
             a = arr[last];
             arr[last]= arr[first];
             arr[first]= a;
             first ++;
             last--; 
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        harry(arr); 
        for(int i = 0 ; i< arr.length; i++){
            System.out.print (arr[i]);
        }
    }  
}
