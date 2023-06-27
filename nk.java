

class nk {
    // Function to find all elements in array that appear more than n/k times.
    public static int countOccurence(int[] arr, int n, int k) {
        int x = n / k;
        HashMap<Integer, Integer> y = new HashMap<>();

        // Count the frequency of each element.
        for (int i = 0; i < n; i++) {
            if (!y.containsKey(arr[i])) {
                y.put(arr[i], 1);
            } else {
                int count = y.get(arr[i]);
                y.put(arr[i], count + 1);
            }
        }

        int count = 0; // Variable to keep track of the count of elements appearing more than n/k times.

        for (Map.Entry<Integer, Integer> entry : y.entrySet()) {
            if (entry.getValue() > x) {
                count++;
            }
        }

        return count;
    }

    // Main function to test the countOccurence method.
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1};
        int n = arr.length;
        int k = 4;

        int result = countOccurence(arr, n, k);

        System.out.println("Count of elements appearing more than n/k times: " + result);
    }
}


