// Logic: Max Subarray Sum (Prefix Sum)
// - Precompute prefix[i] = sum of a[0..i-1].
// - Subarray sum (i..j) = prefix[j+1] - prefix[i].
// - Two nested loops for i, j.
// - Much faster than brute force for large n.
// - Time: O(n^2), Space: O(n).

public class MaxSubarrayPrefixSum {
    // Trick: prefix[i]=sum a[0..i-1]; sum(i..j)=pref[j+1]-pref[i]. O(n^2) pairs.
    public static int maxSubarray(int[] a) {
        int n = a.length, best = Integer.MIN_VALUE;
        int[] pref = new int[n+1];
        for (int i = 1; i <= n; i++) pref[i] = pref[i-1] + a[i-1];
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                best = Math.max(best, pref[j+1] - pref[i]);
        return best;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarray(arr)); // 6
    }
}
// Example: [4,-1,2,1] has max sum 6
// Time: O(n^2); Space: O(n)