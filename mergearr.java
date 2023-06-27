// 15

public class mergearr {
    public static void main(String args[]) {
        int arr1[] = {10, 20, 3, 4, 5, 6};
        int arr2[] = {2, 3, 5, 6, 7, 8, 9};
        int fir = arr1.length;
        int sec = arr2.length;
        int arr3[] = new int[fir + sec];

        int j = 0;
        for (int i = 0; i < fir; i++) {
            arr3[j] = arr1[i];
            j++;
        }

        for (int i = 0; i < sec; i++) {
            arr3[j] = arr2[i];
            j++;
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
        }
    }
}
