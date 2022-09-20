package Problem6;

public class MaximumSumSubarrayOfSizeK2 {
    public static int maxSum(int arr[], int n, int k)
    {
// k must be smaller than n
        if (n < k)
    {
        System.out.println("Invalid");
        return -1;
    }

    // Compute sum of first window of size k
    int res = 0;
        for (int i=0; i<k; i++)
    res += arr[i];

    int curr_sum = res;
        for (int i=k; i<n; i++)
    {
        curr_sum += arr[i] - arr[i-k];
        res = Math.max(res, curr_sum);
    }

        return res;
}

    public static void main(String[] args) {
        int arr[] = {2,3,4,1,5};
        int k = 2;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}
