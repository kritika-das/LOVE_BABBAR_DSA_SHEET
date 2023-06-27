// 35
public class medianof2nonequal {
    
    public int find_median(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr); // Sort the array in ascending order

        // Calculate the index of the median
        int medianIndex = n / 2;

        // If the number of elements is odd, return the middle element
        if (n % 2 != 0) {
            return arr[medianIndex];
        }
        // If the number of elements is even, return the average of the two middle elements
        else {
            return (arr[medianIndex] + arr[medianIndex - 1]) / 2;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr1 = {90, 100, 78, 89, 67};
        int median1 = solution.find_median(arr1);
        System.out.println("Median of arr1: " + median1);

        int[] arr2 = {56, 67, 30, 79};
        int median2 = solution.find_median(arr2);
        System.out.println("Median of arr2: " + median2);
    }
}


