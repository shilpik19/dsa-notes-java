// Logic: Binary Search
// - Works on sorted array.
// - Pick middle element each step.
// - If key < mid → search left, else → search right.
// - Cuts search space in half each time → O(log n).

public class BinarySearch {
    // Trick: works only on sorted array; move to side where target can exist.
    public static int binarySearch(int[] a, int key) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;     // avoid overflow
            if (a[m] == key) return m;
            if (a[m] < key) l = m + 1;   // go right
            else r = m - 1;              // go left
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        System.out.println(binarySearch(arr, 7));
    }
}
