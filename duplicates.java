
// 11
public class duplicates {
    
        public int findDuplicate(int[] arr) {
            int ans = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[j]);
                        ans = arr[j];
                        break;
                    }
                }
            }
            return ans;
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 4, 5};
            
            Solution solution = new Solution();
            int duplicate = solution.findDuplicate(arr);
            
            System.out.println("Duplicate element: " + duplicate);
        }
    }
    

