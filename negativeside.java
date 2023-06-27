//5
public class NegativeSide {
    
    static void nev(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
    }
    
    public static void main(String args[]) {
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n = arr.length;
        nev(arr, n);
        
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
