// Logic: Kadane’s Algorithm
// - Traverse array once.
// - curSum = max(a[i], curSum + a[i]) → reset if curSum < 0.
// - maxSum = max(maxSum, curSum).
// - Finds maximum subarray in linear time.
// - Handles negatives by starting with first element.

public class KadaneAlgorithm {
    // Logic: cur = max(a[i], cur+a[i]); best = max(best, cur). O(n), O(1).
    // Tip: handles all-negative by starting with a[0].
    public static int kadane(int[] a) {
        int best = a[0], cur = a[0];
        for (int i = 1; i < a.length; i++) {
            cur = Math.max(a[i], cur + a[i]); // drop negative prefix
            best = Math.max(best, cur);
        }
        return best;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(kadane(arr)); // 6
    }
}
// Example: [4,-1,2,1] has max sum 6
// Time: O(n); Space: O(1)