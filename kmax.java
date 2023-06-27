

// Java code for Kth smallest element
// 3
import java.util.Arrays;
import java.util.Collections;

class kmax {
	public static int kthSmallest(Integer[] arr, int K)
	{
		Arrays.sort(arr);

		return arr[K - 1];
	}

	
	public static void main(String[] args)
	{
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
		int K = 2;

		System.out.print("K'th smallest element is "
						+ kthSmallest(arr, K));
	}
}
// K largest elements in decreasing order: 787 23

//  import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {12, 5, 787, 1, 23};
//         int k = 2;
//         kLargest(arr, k);
//     }

//     public static void kLargest(int[] arr, int k) {
//         Arrays.sort(arr); // Sort the array in ascending order

//         System.out.print("K largest elements in decreasing order: ");
//         for (int i = arr.length - 1; i >= arr.length - k; i--) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
