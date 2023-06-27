// 16

public class nextper {
    
    static List<Integer> nextPermutation(int N, int arr[]) {
        int n = arr.length;
        int k = n - 1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                k = i;
                break;
            }
        }

        if (k == n - 1) {
            reverse(arr, 0, n - 1);
        } else {
            int l = n - 1;
            for (int i = n - 1; i > k; i--) {
                if (arr[i] > arr[k]) {
                    l = i;
                    break;
                }
            }
            swap(arr, k, l);
            reverse(arr, k + 1, n - 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; // Example input array
        int N = arr.length;

        List<Integer> result = nextPermutation(N, arr);

        System.out.println("Next permutation: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}


