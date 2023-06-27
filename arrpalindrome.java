class arrpalindrome{
    public static int palinArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (!isPalindrome(a[i])) {
                return 0; 
            }
        }
        return 1; 
    }

    private static boolean isPalindrome(int num) {
        int reverse = 0;
        int temp = num;
        while (temp > 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        return num == reverse;
    }

    public static void main(String[] args) {
        int[] arr1 = {111, 222, 333, 444, 555};
        int n1 = arr1.length;
        System.out.println("Is arr1 a palindromic array? " + palinArray(arr1, n1));

        int[] arr2 = {121, 131, 20};
        int n2 = arr2.length;
        System.out.println("Is arr2 a palindromic array? " + palinArray(arr2, n2));
    }
}

