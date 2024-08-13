public class bubblesort {
    public static int bublesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0; j<arr.length-1; j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        return(0);

    }
    public static void main(String[] args) {
         int a[] = {10,19,18,16,74,25,19,83,12,18,7};
          bublesort(a);
          
        
    }
}
