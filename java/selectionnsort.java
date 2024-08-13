public class selectionnsort {
    public static int sorrrt(int ar[]){
        
        for(int i=0;i<=ar.length-1;i++){
            int minPose = i;
            for(int j=i+1;j<=ar.length-1 ;j++){
                if (ar[minPose]>ar[j]) {
                    minPose = j;
                }
            }
            //swap
            int temp = ar[minPose];
            ar[minPose]= ar[i];
            ar[i]= temp;
        }
        for(int k=0;k<ar.length;k++){
            System.out.print(ar[k]);
            System.out.print(" ");
        }
   return 0; }
    public static void main(String[] args) {
        int ar[]= {5,4,3,2,1};
        sorrrt(ar);
    }
}
