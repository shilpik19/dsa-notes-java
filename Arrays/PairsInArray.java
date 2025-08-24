// Logic: Pairs in Array
// - For each element, pair it with every element after it.
// - Two nested loops (i, j) with j > i.
// - Prints all possible pairs → O(n^2).
// - Total pairs = n*(n-1)/2.

public class PairsInArray {
    // Trick: nested loops i<j → total pairs = n*(n-1)/2.
    public static void printPairs(int[] a) {
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                System.out.println("(" + a[i] + ", " + a[j] + ")");
    }
    public static void main(String[] args) {
        printPairs(new int[]{1,2,3,4});
    }
}
// Example: [1,2,3,4] => (1,2), (1,3), (1,4), (2,3), (2,4), (3,4)
// Time: O(n^2); Space: O(1)