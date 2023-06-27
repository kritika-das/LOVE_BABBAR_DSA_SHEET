// 19
public class commonsorted {
  

class Solution {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k]) {
              
                if (i == 0 || A[i] != A[i - 1]) {
                    result.add(A[i]);
                }
                i++;
                j++;
                k++;
            } else if (A[i] <= B[j] && A[i] <= C[k]) {
                i++;
            } else if (B[j] <= A[i] && B[j] <= C[k]) {
                j++;
            } else {
                k++;
            }
        }
        
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
        int n1 = A.length;
        int n2 = B.length;
        int n3 = C.length;

        ArrayList<Integer> common = solution.commonElements(A, B, C, n1, n2, n3);
        
        if (common.isEmpty()) {
            System.out.println("-1");
        } else {
            for (int element : common) {
                System.out.print(element + " ");
            }
        }
    }
}

}
