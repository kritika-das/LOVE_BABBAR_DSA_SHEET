
    // 21
    import java.util.HashSet;
    import java.util.Set;
    public class sum0 {
        static boolean findSum(int[] arr, int n) {
            int sum = 0;
            Set<Integer> set = new HashSet<>();
    
            for (int i = 0; i < n; i++) {
                sum = sum + arr[i];
    
                if (arr[i] == 0 || sum == 0 || set.contains(sum)) {
                    return true;
                }
    
                set.add(sum);
            }
    
            return false;
        }
    
        public static void main(String[] args) {
            int[] arr = {4, 2, -3, 1, 6};
            int n = arr.length;
    
            boolean hasZeroSum = findSum(arr, n);
    
            if (hasZeroSum) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
     
}
