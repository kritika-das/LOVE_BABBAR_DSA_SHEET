// 36

class medianoftwo {
    static double medianOfArrays(int n, int m, int a[], int b[]) {
        int begin1 = 0;
        int end1 = n;

        while (begin1 <= end1) {
            int i1 = (begin1 + end1) / 2;
            int i2 = (n + m + 1) / 2 - i1;

            int min1 = (i1 == n) ? Integer.MAX_VALUE : a[i1];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : a[i1 - 1];

            int min2 = (i2 == m) ? Integer.MAX_VALUE : b[i2];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : b[i2 - 1];

            if (max1 <= min2 && max2 <= min1) {
                if ((n + m) % 2 == 0) {
                    return (double) (Math.max(max1, max2) + Math.min(min1, min2)) / 2;
                } else {
                    return (double) Math.max(max1, max2);
                }
            } else if (max1 > min2) {
                end1 = i1 - 1;
            } else {
                begin1 = i1 + 1;
            }
        }

        // If the code reaches this point, it means the input arrays are not sorted or the inputs are invalid.
        // You can handle this case based on your requirements.
        // For example, you can return a specific value to indicate an error condition or handle it in some other way.
        return -1.0; // Placeholder value to indicate an error condition
    }
}
