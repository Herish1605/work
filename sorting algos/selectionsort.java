public class selectionsort {
    public static void sorrt(int arrr[]){
        for(int i=0;i<arrr.length;i++){
            int minpose = i;
            for(int j=i+1;j<arrr.length;j++){
                if(arrr[minpose] > arrr[j]){
                    minpose = j;
                }
            }
            int tempo = arrr[minpose];
            arrr[minpose]=arrr[i];
            arrr[i]= tempo;
        }
        for(int k=0;k<arrr.length ;k++){
            System.out.print(arrr[k]+" ");
        }
    }
    
    public static void main(String[] args) {
        int arrr[] = {6,5,4,3,2,1};
        sorrt(arrr);
    }
}
