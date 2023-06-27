
// 30
import java.util.ArrayList;

class chocolatedistribution {
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        if (m > n)
            return -1;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = a.get(i);
        }

        quickSort(arr, 0, n - 1);

        int res = arr[m - 1] - arr[0];
        for (int i = 0; (i + m - 1) < n; i++) {
            res = Math.min(res, arr[i + m - 1] - arr[i]);
        }

        return res;
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Solution
        Solution solution = new Solution();

        // Create an example ArrayList
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(1);
        a.add(4);
        a.add(7);
        a.add(9);
        a.add(2);
        a.add(5);

        // Call the findMinDiff method
        int n = a.size();
        int m = 3;
        long result = solution.findMinDiff(a, n, m);

        // Print the result
        System.out.println("Minimum Difference: " + result);
    }
}


