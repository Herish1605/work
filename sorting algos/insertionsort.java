public class insertionsort {
    public static void sorttt(int ar[]){
        for(int i=1;i<ar.length;i++){
            int curr = ar[i];
            int prev = i-1;
            //finding the position where to insert the element
            while (prev >=0 && ar[prev]>curr) {
                ar[prev+1]=ar[prev];
                prev--;
            }
            //insertion
            ar[prev+1] = curr;
        }
        for(int k=0;k<ar.length ;k++){
            System.out.print(ar[k]+" ");
        }
    }
    public static void main(String[] args) {
        int ar[] = {6,5,4,3,2,1};
        sorttt(ar);
    }
}
