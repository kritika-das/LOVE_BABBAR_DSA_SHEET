// 2
import java.util.Arrays;

public class maxmin {
    
    public static int findMax(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    
    public static int findMin(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
    
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 7};
        
        int max = findMax(numbers);
        int min = findMin(numbers);
        
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
