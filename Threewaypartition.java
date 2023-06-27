//32
public class Main {
    
    public static void swap(int array[], int l, int r) {
        int temp = array[l];
        array[l] = array[r];
        array[r] = temp;
    }

    public static void threewaypartition(int array[], int a, int b) {
        int n = array.length;
        int l = 0; 
        int r = n - 1; 
        int i = 0; 

        while (i <= r) {
            if (array[i] < a) {
                swap(array, i, l);
                i++;
                l++;
            } else if (array[i] > b) {
                swap(array, i, r);
                r--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int array[] = { 3, 1, 5, 2, 6, 4 };
        int a = 2;
        int b = 4;

        System.out.println("Original Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        threeWayPartition(array, a, b);

        System.out.println("Partitioned Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

