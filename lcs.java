// 24
import java.util.HashSet;

class lcs {
    // arr[]: the input array
    // N: size of the array arr[]
    
    // Function to return length of longest subsequence of consecutive integers.
    static int findLongestConseqSubseq(int arr[], int N) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(arr[i]);
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (!set.contains(arr[i] - 1)) {
                int val = arr[i] + 1;
                while (set.contains(val)) {
                    val++;
                }
                ans = Math.max(ans, val - arr[i]);
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 10, 4, 20, 2};
        int N = arr.length;
        
        int longestConseqSubseq = findLongestConseqSubseq(arr, N);
        System.out.println("Length of the longest subsequence of consecutive integers: " + longestConseqSubseq);
    }
}

