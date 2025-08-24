// Logic: Trapping Rainwater
// - Water at index i = min(maxLeft, maxRight) - height[i].
// - Two-pointer method: move smaller side inward.
// - Maintain leftMax & rightMax, add trapped water.
// - Alternative: prefix/suffix arrays or stack.
// - Time: O(n), Space: O(1) for two-pointers.

public class TrappingRainwater {
    // Trick: move smaller side; that side's max limits water. O(n) time, O(1) space.
    public static int trap(int[] h) {
        int l = 0, r = h.length - 1, leftMax = 0, rightMax = 0, ans = 0;
        while (l < r) {
            if (h[l] <= h[r]) {
                leftMax = Math.max(leftMax, h[l]);
                ans += leftMax - h[l];
                l++;
            } else {
                rightMax = Math.max(rightMax, h[r]);
                ans += rightMax - h[r];
                r--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(trap(new int[]{4,2,0,3,2,5})); // 9
    }
}
// Example: 4,2,0,3,2,5 => 9 units of water trapped
// Time: O(n); Space: O(1)