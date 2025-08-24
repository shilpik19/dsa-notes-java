// Logic: Print Subarrays
// - A subarray = continuous part of array.
// - Fix start index i, choose end index j (i..n-1).
// - Print elements from i to j.
// - Uses 3 nested loops → O(n^3).
// - Total subarrays = n*(n+1)/2.

public class PrintSubarrays {
    // Trick: fix start i, extend j; carry running sum for current i.
    public static void printAll(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                System.out.print("[");
                for (int k = i; k <= j; k++)
                    System.out.print(a[k] + (k<j? ", ":""));
                System.out.println("] sum=" + sum);
            }
        }
    }
    public static void main(String[] args) {
        printAll(new int[]{1,2,3});
    }
}
// Example: [1,2,3] => [1], [1,2], [1,2,3], [2], [2,3], [3]
// Time: O(n^2); Space: O(1)