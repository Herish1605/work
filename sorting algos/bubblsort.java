public class bubblsort{

    public static void sortt(int arr[]){
        for(int i=0; i <arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }
        System.out.print("the sorted arrays is:  ");
        for(int k=0;k<=arr.length-1;k++){
           System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
      int arr[] = {5,4,3,2,1};
        sortt(arr);
    }
}