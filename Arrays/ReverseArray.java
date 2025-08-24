// Logic: Reverse Array
// - Use two pointers: start and end.
// - Swap elements, move inward.
// - Continue until pointers cross.
// - In-place, O(n) time, O(1) space.

import java.util.Arrays;

public class ReverseArray {
    // Trick: two pointers swap; in-place O(1) space.
    public static void reverse(int[] a) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            int t = a[i]; a[i] = a[j]; a[j] = t;
            i++; j--;
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
}
// Example: [1,2,3,4,5] => [5,4,3,2,1]
// Time: O(n); Space: O(1)