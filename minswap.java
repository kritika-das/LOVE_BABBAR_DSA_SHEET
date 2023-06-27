// 33
class minswap {
    public static int minSwap(int arr[], int n, int k) {
        int count = 0; // to store the number of elements <= k in the current window
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                count++;
            }
        }

        // Find the number of elements > k in the first window of size 'count'
        int windowCount = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] > k) {
                windowCount++;
            }
        }

        int minSwaps = windowCount; // minimum swaps required for the first window

        // Sliding window approach to find the minimum swaps required for other windows
        for (int i = 0, j = count; j < n; i++, j++) {
            // If the element going out of the window is > k, decrement windowCount
            if (arr[i] > k) {
                windowCount--;
            }

            // If the element coming into the window is > k, increment windowCount
            if (arr[j] > k) {
                windowCount++;
            }

            // Update minSwaps with the minimum value
            minSwaps = Math.min(minSwaps, windowCount);
        }

        return minSwaps;
    }

    public static void main(String[] args) {
        int arr1[] = {2, 1, 5, 6, 3};
        int k1 = 3;
        int n1 = arr1.length;
        System.out.println("Minimum Swaps required for arr1: " + minSwap(arr1, n1, k1));

        int arr2[] = {2, 7, 9, 5, 8, 7, 4};
        int k2 = 6;
        int n2 = arr2.length;
        System.out.println("Minimum Swaps required for arr2: " + minSwap(arr2, n2, k2));
    }
}

