public class hj {
    import java.util.*;



    public static void harrry(int arr[]) {
        int temp1 = 0;
        int temp2 = 0;

        // Sorting logic
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Finding temp1 and temp2
        temp1 = arr[0];  // smallest element
        temp2 = arr[arr.length - 1];  // largest element

        // Replacing duplicate adjacent elements
        for (int k = 0; k < arr.length - 1; k++) {
            if (arr[k] == arr[k + 1]) {
                arr[k] = temp2;
            }
        }

        // Printing the modified array
        for (int l = 0; l < arr.length; l++) {
            System.out.print(arr[l] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 8, 6, 7, 5, 9 };
        harrry(arr);
    }
}


