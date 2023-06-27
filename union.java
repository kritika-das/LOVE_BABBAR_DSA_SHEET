// 6
public class Union {
    public static void main(String args[]) {
        int arr1[] = {5, 3};
        int arr2[] = {1, 2, 3, 4, 5};
        int len1 = arr1.length;
        int len2 = arr2.length;
        int unionLength = len1 + len2;
        int union[] = new int[unionLength];
        
        for (int i = 0; i < len1; i++) {
            union[i] = arr1[i];/
        }
        
        int k = len1;
        for (int i = 0; i < len2; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < len1; j++) {
                if (arr2[i] == arr1[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                union[k] = arr2[i];
                k++;
            }
        }
        
        for (int i = 0; i < k; i++) {
            System.out.println(union[i]);
        }
    }
}
