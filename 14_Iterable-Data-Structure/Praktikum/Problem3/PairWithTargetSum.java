package Problem3;

import java.util.HashSet;

public class PairWithTargetSum {
    static void printpairs(int arr[], int sum)
    {
        HashSet<Integer> angka = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i)
        {
            int temp = sum - arr[i];

            if (angka.contains(temp)) {
                System.out.println(" (" + temp + ", " + arr[i] + ")");
            }
            angka.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 6 };
        int n = 6;
        printpairs(A, n);
    }
}
