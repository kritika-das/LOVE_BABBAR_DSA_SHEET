// 9
import java.util.Arrays;
public class minimizeheights {
    

    int getMinDiff(int[] arr, int n, int k) {
        if (n == 1)
            return 0;

        Arrays.sort(arr);
        int diff = arr[n - 1] - arr[0];
        int max;
        int min;

        for (int i = 1; i < n; i++) {
            max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            min = Math.min(arr[0] + k, arr[i] - k);
            diff = Math.min(diff, max - min);
        }

        return diff;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 10};
        int n = arr.length;
        int k = 2;

        Solution solution = new Solution();
        int minDiff = solution.getMinDiff(arr, n, k);

        System.out.println("Minimum difference: " + minDiff);
    }
}


