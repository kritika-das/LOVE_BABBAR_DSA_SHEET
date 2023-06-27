
// 27
import java.util.*;

class subsetofanother {
    String isSubset(int a1[], int a2[], int n, int m) {
        HashMap<Integer, Boolean> y = new HashMap<>();
        int lengthA1 = a1.length;
        int lengthA2 = a2.length;

        for (int i = 0; i < lengthA1; i++) {
            y.put(a1[i], true);
        }

        for (int i = 0; i < lengthA2; i++) {
            if (!y.containsKey(a2[i])) {
                return "Not a Subset";
            }
        }

        return "Subset";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] a1 = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] a2 = {11, 3, 7, 1, 7};
        int n = a1.length;
        int m = a2.length;
        System.out.println(solution.isSubset(a1, a2, n, m));

        int[] b1 = {1, 2, 3, 4, 4, 5, 6};
        int[] b2 = {1, 2, 4};
        int p = b1.length;
        int q = b2.length;
        System.out.println(solution.isSubset(b1, b2, p, q));

        int[] c1 = {10, 5, 2, 23, 19};
        int[] c2 = {19, 5, 3};
        int x = c1.length;
        int y = c2.length;
        System.out.println(solution.isSubset(c1, c2, x, y));
    }
}

