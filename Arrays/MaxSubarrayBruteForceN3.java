// Logic: Max Subarray Sum (Brute Force)
// - Generate all subarrays with i..j.
// - For each subarray, calculate sum with inner loop.
// - Track maximum sum found so far.
// - Time: O(n^3), Space: O(1).

public class MaxSubarrayBruteForceN3 {
    // Brute force: try every start i and end j, then sum k=i..j fresh.
    // Time: O(n^3). Space: O(1).
    public static int maxSubarray(int[] a) {
        int best = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {           // start
            for (int j = i; j < a.length; j++) {       // end
                int sum = 0;
                for (int k = i; k <= j; k++) {         // sum i..j (no reuse)
                    sum += a[k];
                }
                if (sum > best) best = sum;
            }
        }
        return best;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Sum = " + maxSubarray(arr)); // 6
    }
}
// Example: [4,-1,2,1] has max sum 6
// Time: O(n^3); Space: O(1)